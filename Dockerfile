FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/organica-0.0.1-SNAPSHOT.jar cnx-ecommerce.jar
ENTRYPOINT ["java", "-jar", "/cnx-ecommerce.jar"]
