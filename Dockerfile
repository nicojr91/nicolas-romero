FROM openjdk:11-slim
EXPOSE 8080
RUN mkdir -p /app/
ADD build/libs/nicolas-romero-0.0.1-SNAPSHOT.jar /app/nicolas-romero-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/app/nicolas-romero-0.0.1-SNAPSHOT.jar"]