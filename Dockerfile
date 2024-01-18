# Base image
FROM openjdk:17.0.1-jdk-slim

# Labels
LABEL author="Ibank gateway core banking service"

# Set the timezone to GMT+7
ENV TZ=Asia/Bangkok

# Copy the application JAR file to the container
RUN mkdir /app
COPY ./target/*.jar /app/run.jar

# Expose port 4400 for the container
EXPOSE 8080

# Set the command to run the Spring Boot application
ENTRYPOINT ["java", "-jar", "-Duser.timezone=GMT+7", "/app/run.jar"]