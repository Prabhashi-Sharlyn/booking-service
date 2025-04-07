FROM openjdk:17
ADD target/booking-service.jar booking-service.jar
EXPOSE 8081
ENTRYPOINT ["java","-jar","booking-service.jar"]