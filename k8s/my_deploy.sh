#!/bin/bash
#报错自动退出
set -o errexit

# docker image的名称,以及 k8s中各个服务的名称
export APP_NAME=springboot-mybatis-demo
# maven打出来的jar包的名称
export PACKAGED_JAR_NAME=springboot-mybatis-demo-0.0.1-SNAPSHOT.jar
# k8s默认的namespace
export DEFAULT_NAME_SPACE=dev
# harbor地址
export HARBOR_URL=192.168.20.23:81
# harbor namespace
export HARBOR_NAMESPACE=econ

export APP_VERSION=$(git rev-parse --short HEAD)

#默认使用dev作为命名空间
if [ x$1 != x ]; then
  export NAME_SPACE=$1
else
  export NAME_SPACE=${DEFAULT_NAME_SPACE}
fi
echo "K8S_NAME_SPACE is set to $NAME_SPACE"

#第二个参数为激活的springboot配置文件,如果不配置,默认为空,会去读取application.yml文件中的配置
if [ x$2 != x ]; then
  export SPRING_PROFILES_ACTIVE=$2
  #如果设置了激活文件的配置,检查配置文件是否存在,不存在直接退出
  if [ -f "../src/main/resources/application-${SPRING_PROFILES_ACTIVE}.yml" ]; then
    echo "conf is set to application-${SPRING_PROFILES_ACTIVE}.yml"
  else
    echo "conf file application-${SPRING_PROFILES_ACTIVE}.yml does not exist,exit now"
    exit 1
  fi
else
  echo "using default conf"
fi

#切换到本文件的当前目录
cd $(dirname $0)
deploy_dir=$(pwd)
#切换到项目根目录,因为Dockerfile中的路径是根目录下的路径
cd ..
project_dir=$(pwd)
#提交代码
#git add *
#git commit -m "manaul_deploy"
#git push
#打包
mvn clean package -U -f pom.xml -s ./k8s/mvn-settings.xml -DskipTests
#打包镜像、推镜像
docker login -u admin -p harbor12345 192.168.20.23:81
#替换jar的名称为实际的jar包
echo "replacing actual jar name in dockerfile..."
sed "s/PACKAGED_JAR_NAME/${PACKAGED_JAR_NAME}/g" ./k8s/Dockerfile >./k8s/Dockerfile-tmp
echo "tmp dockerfile created"
echo "start build docker image"
docker build -t ${HARBOR_URL}/${HARBOR_NAMESPACE}/${APP_NAME}:${APP_VERSION} -f ./k8s/Dockerfile-tmp .
echo "start push image to harbor: ${HARBOR_URL}/${HARBOR_NAMESPACE}"
docker push ${HARBOR_URL}/${HARBOR_NAMESPACE}/${APP_NAME}:${APP_VERSION}
#清理临时文件
rm -f ./k8s/Dockerfile-tmp
echo "tmp dockerfile deleted"

#发布到k8s
#切换到具体namespace的目录,读取对应的application.yml
cd $deploy_dir

export KUBECONFIG=./kube.config
#kubectl config view
#创建secret demo环境
kubectl -n ${NAME_SPACE} delete configmap ${APP_NAME} --ignore-not-found
kubectl -n ${NAME_SPACE} create configmap ${APP_NAME} --from-file=${project_dir}/src/main/resources/

#部署服务

sed "s/NAME_SPACE/${NAME_SPACE}/g;s/APP_NAME/${APP_NAME}/g;s/HARBOR_URL/${HARBOR_URL}/g;s/HARBOR_NAMESPACE/${HARBOR_NAMESPACE}/g;s/APP_VERSION/${APP_VERSION}/g;s/SPRING_PROFILES_ACTIVE_VALUE/${SPRING_PROFILES_ACTIVE}/g" deployment.yaml >deployment-${NAME_SPACE}.yaml
kubectl -n ${NAME_SPACE} delete -f ./deployment-${NAME_SPACE}.yaml --ignore-not-found

kubectl -n ${NAME_SPACE} create -f ./deployment-${NAME_SPACE}.yaml

rm -f deployment-${NAME_SPACE}.yaml
echo "tmp k8s file deleted"
