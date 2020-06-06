FROM centos

RUN yum install -y java

VOLUME /tmp
ADD target/gang-up.jar gang-up.jar
RUN sh -c 'touch /gang-up.jar'
ENTRYPOINT ["java", "-jar", "/gang-up.jar"]