# Use Maven image to build the application
FROM maven:3.8.6-eclipse-temurin-17 AS build
WORKDIR /app

# Copy the project files to the build container
COPY . .

# Package the application (creates the JAR file)
RUN mvn clean package -DskipTests

# Use a lightweight JDK for running the app
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the JAR file from the build container
COPY --from=build /app/target/*.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
CMD ["java", "-jar", "app.jar"]
