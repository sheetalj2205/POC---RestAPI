# POC-RestAPI
A simple CRUD operations application using spring boot


## Getting Started
* Java 8 is required.
* The project using Spring Boot framework.
* The project is built with Gradle (packaged within the project itself).
* The application runs on port 8080.

## To Launch:
To launch the web server follow instructions as per your case:

### Gradle:
From within project directory run following command  (follow as per your case):
* From git bash, run following command:

  `./gradle run`
* From windows command prompt:

  `gradlew run`

### From IntelliJ IDE.
* Gradle is configured to build for IntelliJ. Run following command and import project in IntelliJ:
  <br/>`./gradlew idea`
* Run `Main` from `RestapiApplication.java`.

## APIs
You can target [http://localhost:8080](http://localhost:8080).

### Endpoints

| Method | Url | Decription |
| ------ | --- | ---------- |
| GET    |/api/v1/load | get(retrieve) all the records of users |
| GET    |/api/v1/load/{user_id}| get(retrieve) record of one user by its user_id |
| POST   |/api/v1/load  | add user in table |
| PUT    |/api/v1/load/{user_id}| update record user |
| DELETE |/api/v1/load/{user_id}| delete record of one user by its user_id |

## Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.2.4.RELEASE/gradle-plugin/reference/html/)

