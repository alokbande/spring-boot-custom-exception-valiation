FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/spring-boot-custom-exception-valiation.jar spring-boot-custom-exception-valiation.jar
EXPOSE 8080
CMD ["java","-jar","spring-boot-custom-exception-valiation.jar"]
