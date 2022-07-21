#!/bin/bash
#负责启动应用
JAR_FILE=springboot_project.jar

JAVA_XMS="-Xms256m"
JAVA_XMX="-Xmx5g"
JAVA_XSS="-Xss256k"

#if [ -f "./k8s/dev/application.yml" ];then
#    SPRING_CONFIG="./k8s/dev/application.yml"
#fi
#如果没有配置conf目录,用默认的
if [ -z "$SPRING_CONFIG" ];then
    if [ -f "/etc/dev/application.yml" ];then
        SPRING_CONFIG="/etc/dev/"
    fi
fi
#如果配置了conf目录
[ -n "$SPRING_CONFIG" ] && SPRING_CONFIG="-Dspring.config.location=$SPRING_CONFIG"
#如果配置了$SPRING_PROFILES_ACTIVE
if [ -n "$SPRING_PROFILES_ACTIVE" ];then
    SPRING_CONFIG="$SPRING_CONFIG -Dspring.profiles.active=$SPRING_PROFILES_ACTIVE"
fi
JAVA_OPTS="-server $JAVA_XMS $JAVA_XMX $JAVA_XSS $SPRING_CONFIG -Duser.timezone=GMT+08 -Djava.security.egd=file:/dev/./urandom -Djava.awt.headless=true -Djna.nosys=true -Djava.net.preferIPv4Stack=true -Djava.util.Arrays.useLegacyMergeSort=true -Dfile.encoding=UTF-8 -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=75 -XX:+UseCMSInitiatingOccupancyOnly -XX:+HeapDumpOnOutOfMemoryError -XX:+DisableExplicitGC"
echo "$JAVA_OPTS"
java $JAVA_OPTS -jar ${JAR_FILE}

