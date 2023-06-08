FROM maven:3.8.5-openjdk-17 AS build
COPY . ./
RUN mvn clean
RUN mvn package
FROM adoptopenjdk/openjdk16:jdk-16.0.1_9
COPY --from=build /target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]