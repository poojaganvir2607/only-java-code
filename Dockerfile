# Use Java 17 base image
FROM eclipse-temurin:17-jdk

# Set working directory inside container
WORKDIR /app

# Copy the built jar from target folder
COPY target/console-app-1.0-SNAPSHOT-jar-with-dependencies.jar /app/app.jar
EXPOSE 8080
# Command to run the application
CMD ["java", "-jar", "app.jar"]

