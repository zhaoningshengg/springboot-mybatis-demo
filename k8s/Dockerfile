FROM 192.168.20.23:81/java/alpint-java8:v1

MAINTAINER zns <zhaoningsheng@hitocas.com>

#ENV TZ=Asia/Shanghai
#RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone
#路径为相对于my_deploy文件目录下的路径
COPY ./k8s/start.sh /app/start.sh
COPY ./target/PACKAGED_JAR_NAME /app/springboot_project.jar

WORKDIR /app
EXPOSE 8080
CMD ["sh","start.sh"]
