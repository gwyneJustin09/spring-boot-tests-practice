FROM openjdk:17

COPY /target/Unit_Test-0.0.1-SNAPSHOT.jar Unit_Test_v1.jar
ENTRYPOINT ["java", "-jar", "Unit_Test_v1.jar"]

