FROM anapsix/alpine-java:8

ADD target/DisplaytRequestHeaders-0.0.1-SNAPSHOT.jar DisplaytRequestHeaders.jar

ENTRYPOINT ["java","-jar","/DisplaytRequestHeaders.jar"]
