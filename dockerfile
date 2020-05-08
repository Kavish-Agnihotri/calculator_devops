FROM openjdk:8-alpine

RUN apk update
RUN apk add  maven
COPY pom.xml /usr/local/calculator_devops/pom.xml
COPY src /usr/local/calculator_devops/src
WORKDIR /usr/local/calculator_devops
RUN mvn package
CMD ["java","-cp","target/devops_calculator-1.0-SNAPSHOT.jar","calculator.main.App"]
