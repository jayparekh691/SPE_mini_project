FROM openjdk:11
COPY ./target/SPE_mini_project-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
RUN javac Main.java
CMD ["java", "-jar", "SPE_mini_project-1.0-SNAPSHOT-jar-with-dependencies.jar"]