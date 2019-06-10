#FROM openjdk:8-jdk-alpine
#VOLUME /tmp
#ARG JAR_FILE
#COPY ${JAR_FILE} app.jar
#ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
#EXPOSE 8080

# Start with a base image containing Java runtime
FROM openjdk:8-jdk-alpine
# Add Maintainer Info
LABEL maintainer="frank.rodriguez@cobiscorp.com"
# Add a volume pointing to /tmp
VOLUME /tmp
# Make port 80 available to the world outside this container
EXPOSE 80
# The application's jar file
ARG JAR_FILE=target/swagger-spring-1.0.0.jar
# Add the application's jar to the container
ADD ${JAR_FILE} app.jar
# Run the jar file 
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]