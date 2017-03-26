FROM gcr.io/google_appengine/openjdk
VOLUME /tmp
ADD target.jar app.jar
CMD [ "java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]