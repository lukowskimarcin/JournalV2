FROM openjdk:18-slim-buster

COPY ./provider-core/target/provider-core-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-XX:+UseContainerSupport","-XX:MaxRAMPercentage=50","-XshowSettings:vm","-jar","/app.jar"]