FROM java:8
VOLUME /tmp
ADD config-micro-1.0.jar /app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 7070
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]