FROM openjdk:17-alpine
ENV SPRING_PROFILES_ACTIVE=default
ENV SERVER_PORT=9090
COPY target/order-service.jar  /tmp/order-service.jar
WORKDIR /tmp/
EXPOSE $SERVER_PORT
ENTRYPOINT ["java","-jar","order-service.jar"]
