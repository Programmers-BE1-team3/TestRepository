FROM openjdk:17-jdk-alpine
EXPOSE 8080
VOLUME /tmp
COPY build/libs/*.jar test-server.jar
ENTRYPOINT ["java", "-jar", "/test-server.jar"]