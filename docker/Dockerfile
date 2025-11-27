FROM eclipse-temurin:17-jre-alpine

# Create non-root user
RUN addgroup -S appgroup && adduser -S appuser -G appgroup

WORKDIR /app

# Copy JAR from Maven build output
COPY ../myapp/target/*.jar app.jar

USER appuser

ENTRYPOINT ["java", "-jar", "app.jar"]
