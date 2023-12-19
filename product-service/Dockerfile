FROM openjdk:17-alpine
ENV SPRING_PROFILES_ACTIVE=default
ENV SERVER_PORT=9090
COPY target/product-service.jar  /tmp/product-service.jar
WORKDIR /tmp/
EXPOSE $SERVER_PORT
ENTRYPOINT ["java","-jar","product-service.jar"]
