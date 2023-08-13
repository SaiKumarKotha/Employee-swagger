FROM openjdk:11
ADD target/employee.jar employee.jar
ENTRYPOINT ["java", "-jar","employee.jar"]
EXPOSE 8080