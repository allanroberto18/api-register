## Customer Register API

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

**Locally access:** http://127.0.0.1:8080/api
**Docker access:** http://127.0.0.1:9080/api

##### Endpoints available:

[POST] - ${Local|Docker}/customers/
[PARAMS] - {fistName, lastName, email}