### Docker command
- docker build:
  ```$docker build -f ./src/main/dockerBase/Dockerfile -t kbe-rest .```
- check docker container:
```docker ps -a```
- remove docker container:
```docker rm <container id>```
- check docker image
```docker images```
- remove docker image
```docker rmi <container id>```
- run container(background)
```docker run -p 8080:8080 -d kbe-rest```
- run container
  ```docker run -p 8080:8080 kbe-rest```
- end container
  ```docker kill <container id>```