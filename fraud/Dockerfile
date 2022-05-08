FROM openjdk:11

ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} fraud.jar

ENTRYPOINT ["java","-jar","fraud.jar"]
