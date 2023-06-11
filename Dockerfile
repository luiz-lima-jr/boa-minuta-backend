FROM maven:3.8.5-openjdk-17 AS build
COPY . ./
EXPOSE 9090
RUN mvn clean
RUN mvn package
FROM openjdk:17.0.2-jdk
COPY --from=build /target/*.jar app.jar
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
CMD [".mvnw","spring-boot:run"]