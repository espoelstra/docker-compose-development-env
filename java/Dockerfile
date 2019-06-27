ARG java_version
ARG maven_version
FROM maven:${maven_version}-jdk-${java_version}

COPY . /usr/src/app
WORKDIR /usr/src/app

RUN apt update && apt install entr -y

RUN mvn clean package --batch-mode
ENTRYPOINT java -jar target/docker-compose-java-example-1.0-SNAPSHOT.jar
