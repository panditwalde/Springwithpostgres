FROM openjdk:8
VOLUME /tmp
EXPOSE 8080
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
ADD target/SpringbootwithPostgres-0.0.1-SNAPSHOT.jar SpringbootwithPostgres-0.0.1-SNAPSHOT.jar


ENTRYPOINT ["java","-jar","SpringbootwithPostgres-0.0.1-SNAPSHOT.jar"]






