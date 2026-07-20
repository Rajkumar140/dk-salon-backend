# Step 1: Use Java 21 image
FROM eclipse-temurin:21-jdk

# Step 2: Set working directory
WORKDIR /app

# Step 3: Copy jar file
COPY target/*.jar app.jar

# Step 4: Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]