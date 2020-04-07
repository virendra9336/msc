From openjdk:8

ADD target/msc-0.0.1-SNAPSHOT.jar msc.jar

ENTRYPOINT ["java","-jar","msc.jar"]

EXPOSE 8080