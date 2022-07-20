#!/bin/bash
#负责启动应用
JAR_FILE=springboot_project.jar

JAVA_XMS="-Xms256m"
JAVA_XMX="-Xmx5g"
JAVA_XSS="-Xss256k"

#if [ -f "./k8s/dev/application.yml" ];then
#    SPRING_CONFIG="./k8s/dev/application.yml"
#fi
if [ -z "$SPRING_CONFIG" ];then
    if [ -f "/etc/dev/application.yml" ];then
        SPRING_CONFIG="/etc/dev/"
    fi
fi

[ -n "$SPRING_CONFIG" ] && SPRING_CONFIG="-Dspring.config.location=$SPRING_CONFIG"

JAVA_OPTS="-server $JAVA_XMS $JAVA_XMX $JAVA_XSS $SPRING_CONFIG -Duser.timezone=GMT+08 -Djava.security.egd=file:/dev/./urandom -Djava.awt.headless=true -Djna.nosys=true -Djava.net.preferIPv4Stack=true -Djava.util.Arrays.useLegacyMergeSort=true -Dfile.encoding=UTF-8 -XX:+UseParNewGC -XX:+UseConcMarkSweepGC -XX:CMSInitiatingOccupancyFraction=75 -XX:+UseCMSInitiatingOccupancyOnly -XX:+HeapDumpOnOutOfMemoryError -XX:+DisableExplicitGC"
echo "$JAVA_OPTS"
java $JAVA_OPTS -jar ${JAR_FILE}

