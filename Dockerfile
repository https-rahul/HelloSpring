FROM openjdk:8-jdk-alpine

EXPOSE 8080

ADD target/hellospring.jar hello-Spring.jar

ENTRYPOINT ["java", "-jar", "hellospring.jar"]