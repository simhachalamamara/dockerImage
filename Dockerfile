FROM openjdk:8
EXPOSE 8080
ADD target/Spring-Boot-docker-image-0.0.1-SNAPSHOT.jar Spring-Boot-docker-image-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Spring-Boot-docker-image-0.0.1-SNAPSHOT.jar"]
