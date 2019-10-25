FROM java:8-jre

COPY ./target/hello-0.0.1-SNAPSHOT.jar /app/
WORKDIR /app
CMD ["java", "-Xmx200m", "-jar", "hello-0.0.1-SNAPSHOT.jar"]

EXPOSE 18081