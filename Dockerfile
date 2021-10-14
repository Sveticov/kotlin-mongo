FROM openjdk:8
ADD build/libs/kotlin-mongo-0.1.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]