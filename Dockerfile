FROM openjdk:8
EXPOSE 8080
ADD target/Spring-Boot-docker-image.jar Spring-Boot-docker-image.jar
ENTRYPOINT ["java","-jar","/Spring-Boot-docker-image.jar"]
