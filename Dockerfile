FROM maven:3.8.5-openjdk-17 AS build
COPY . ./
RUN mvn clean
RUN mvn package
FROM openjdk:17.0.2-jdk
COPY --from=build /target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
run mvn spring-boot:run