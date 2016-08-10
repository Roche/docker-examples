@echo off
echo Starting app on Docker with Docker Compose...

echo Creating images
call mvn clean install build docker:build
echo Images created

echo Starting up services...
start docker-compose up
call timeout /t 10
exit
@echo on