FROM openjdk:8-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} discovery-service.jar/
ENTRYPOINT ["java","-jar","/discovery-service.jar"]