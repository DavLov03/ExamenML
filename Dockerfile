FROM alpine:latest as build

RUN apk update
RUN apk add openjdk17

COPY . .
RUN chmod +x ./gradlew
RUN ./gradlew bootJar --no-daemon

# Etapa de ejecución
FROM openjdk:17-jdk-alpine
EXPOSE 8080
COPY --from=build ./build/libs/ExamenML-0.0.1-SNAPSHOT-plain.jar ./app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]