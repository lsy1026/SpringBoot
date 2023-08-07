FROM openjdk:17-jre
##WORKDIR /app
COPY build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
##CMD ["java", "-jar", "app.jar"]