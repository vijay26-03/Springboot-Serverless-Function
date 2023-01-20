FROM openjdk:17-jdk-alpine
ARG JAR_FILE=target/*.jar
COPY ./target/Serverless-Function-0.0.1-SNAPSHOT-aws.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
