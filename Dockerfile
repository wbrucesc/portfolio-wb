FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/portfolio-wb-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT exec java -jar app.jar