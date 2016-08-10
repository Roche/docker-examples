@echo off
IF NOT "%1"=="-s" (
    echo Building dependencies
    call mvn clean install
    echo Dependencies built
)

echo Starting services...

echo Starting EUREKA
start mvn -f eureka-micro/pom.xml spring-boot:run
call timeout /t 10

echo Starting CONFIG SERVER
start mvn -f config-micro/pom.xml spring-boot:run
call timeout /t 10

echo Starting PING
start mvn -f ping-micro/pom.xml spring-boot:run
call timeout /t 10

echo Starting PONG
start mvn -f pong-micro/pom.xml spring-boot:run
call timeout /t 10

echo All services up and running
call timeout /t 10
exit
@echo on