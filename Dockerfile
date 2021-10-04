FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/Spring-Boot-docker-image.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/spring-boot-web.jar /opt/app/app.jar
COPY ${JAR_FILE} Spring-Boot-docker-image.jar

# java -jar /opt/app/app.jar
ENTRYPOINT ["java","-jar","Spring-Boot-docker-image.jar"]
