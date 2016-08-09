# Simple Spring Cloud Dockerized app

This is application based on Microservices Architecture.
Entire application can be run:
- on typical machine (virtual, local, bare-metal etc...)
- on Docker

For Docker maven-docker-plugin is used which can be found here: https://github.com/spotify/docker-maven-plugin

## Services
Application consists of four microservices:
- discovery service (Eureka)
- configuration service (Spring Cloud Config)
- Ping service
- Pong service
Moreover it uses _commons_ module to reuse components.

Overall design and connection between services looks following:
![alt Design image](hh)

## Endpoints
- http://${ping-service-host:ping-service-port}/ping?content=SOME_STRING (i.e. _http://localhost:8080/ping_)
- http://${eureka-service-host:eureka-service-port} (i.e. _http://localhost:8761_)
- http://${config-service-host:config-service-port} (i.e. _http://localhost:7070_)
- POST http://${pong-service-host:pong-service-port}/pong?input=SOME_STRING (i.e. POST to _http://localhost:8082/pong_)

## Running application

### On typical machine
### On Docker

## TODO
- Create API Gateway to simplify visible endpoints
- Add database(s) to show how Dockerize dbs
- Add pushing to private registry after build
- Add description how to use it on Bamboo / CD pipeline






