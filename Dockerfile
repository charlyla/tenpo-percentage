FROM openjdk:17-jdk-slim
COPY target/tenpo-percentage-*.jar tenpo-percentage.jar
EXPOSE 8090
CMD ["java", "-jar", "tenpo-percentage.jar"]