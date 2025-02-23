FROM openjdk:21
EXPOSE 8080
ADD target/sendingservice.jar sendingservice.jar
ENTRYPOINT ["java", "-jar","/sendingservice.jar"]
