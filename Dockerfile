FROM eclipse-temurin:17
COPY target/dockernew.jar dockernew.jar
CMD ["java","-jar","dockernew.jar"]
