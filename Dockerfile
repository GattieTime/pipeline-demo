FROM tomcat:jdk8-openjdk
RUN rm -rf /usr/local/tomact/webapps/*
COPY ./target/HelloJenkins.war /usr/local/tomcat/webapps/HelloServlets.war
CMD ["catalina.sh", "run"]
