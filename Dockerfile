FROM openjdk:8
EXPOSE 8081
ARG JAR_FILE
COPY ${JAR_FILE} Spring-Boot-docker-image-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Spring-Boot-docker-image-0.0.1-SNAPSHOT.jar"]

