FROM openjdk:17-alpine3.14 AS build
EXPOSE 9090
WORKDIR /app

ARG PROFILE

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN chmod +x mvnw
RUN ./mvnw dependency:go-offline
COPY src ./src

CMD ["./mvnw","spring-boot:run", "-Dspring-boot.run.jvmArguments=\"-Dspring.profiles.active=${PROFILE}\""]