FROM maven:3.8.5-openjdk-17 AS build
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
EXPOSE 9090
RUN mvn clean
RUN mvn package
FROM openjdk:17.0.2-jdk
COPY --from=build /target/*.jar app.jar
CMD ["mvn","spring-boot:run"]