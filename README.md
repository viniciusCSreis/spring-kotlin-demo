# spring-kotlin-demo
Esse repositório e uma demostração de um sistema de cadastro de imoveis utilizando Spring framework e kotlin

# Como rodar:

Primeiramente é necessario ter instalado na maquina o **JAVA JDK 8** e o **Maven**.

obs: você deve instalar o java 8 outras versões como java 11 não irão funcionar.

## Spring Rest Repository:

1. execute os comandos:
```
$ cd spring-rest-repository
$ docker-compose up -d
$ mvn spring-boot:run  
``` 

2. abra o postman e importe o arquivo **rest_repository.postman_collection.json** disponível na pasta collections.

## Spring Web MVC:

1. execute os comandos:
```
$ cd spring-web-mvc
$ docker-compose up -d
$ mvn spring-boot:run  
``` 

2. abra o postman e importe o arquivo **Spring Web MVC.postman_collection.json** disponível na pasta collections.
