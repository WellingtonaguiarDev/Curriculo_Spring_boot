
FROM openjdk:21-jdk-slim

WORKDIR /app


COPY . /app


EXPOSE 8080


ENTRYPOINT ["java", "-jar", "curriculo-api-0.0.1-SNAPSHOT.jar"]
