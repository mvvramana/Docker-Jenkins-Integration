FROM openjdk:17
EXPOSE 8080
ADD target/DockerJenkinsIntegration.jar DockerJenkinsIntegration.jar
ENTRYPOINT ["java","-jar","/DockerJenkinsIntegration.jar"]