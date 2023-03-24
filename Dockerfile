FROM openjdk:8
ADD target/encryption_docker_integration_demo-0.0.1-SNAPSHOT.jar encryption_docker_integration_demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","encryption_docker_integration_demo-0.0.1-SNAPSHOT.jar"]
