# Build stage
FROM maven:3.8.4-openjdk-11 AS build
WORKDIR /app

# Copy the pom.xml file and download the dependencies
COPY pom.xml .
RUN mvn dependency:go-offline

# Copy the source code and build the application
COPY src ./src
RUN mvn package

# Run stage
FROM openjdk:11-jre-slim
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/*.jar app.jar

# Expose the port on which the application will run (if necessary)
EXPOSE 8082

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
