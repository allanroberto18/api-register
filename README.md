## Customer Register API

To start is necessary create your .env file for docker configurations (can use .env.dist as model)

To deploy the application locally:

```
./mvnw package && java -jar target/alr-register-1.0.0-SNAPSHOT.jar
```

To deploy for docker:

```
./mvnw install dockerfile:build

docker-compose -f stack.yml up
```

##### Access:

* Locally access: http://127.0.0.1:8080/api
* Docker access: http://127.0.0.1:9080/api

##### Endpoints available:

* Locally access: http://127.0.0.1:8080/api/swagger-ui.html
* Docker access: http://127.0.0.1:9080/api/swagger-ui.html