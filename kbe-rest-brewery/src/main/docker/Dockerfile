FROM openjdk:17-alpine as builder
WORKDIR application
#ADD maven/kbe-rest-brewery-0.0.1-SNAPSHOT.jar ./
ADD maven/${project.build.finalName}.jar ./
#RUN java -Djarmode=layertools -jar kbe-rest-brewery-0.0.1-SNAPSHOT.jar extract
RUN java -Djarmode=layertools -jar ${project.build.finalName}.jar extract



FROM openjdk:17-alpine

WORKDIR application
COPY --from=builder application/dependencies/ ./
COPY --from=builder application/spring-boot-loader/ ./
COPY --from=builder application/snapshot-dependencies/ ./
COPY --from=builder application/application/ ./
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "org.springframework.boot.loader.JarLauncher"]