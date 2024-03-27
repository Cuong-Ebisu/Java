FROM openjdk:17-jdk
COPY ./target/SOCIALMEDIA2-0.0.1-SNAPSHOT.jar /app.jar
CMD ["java", "-XX:+UseStringDeduplication", "-jar", "/app.jar"]
