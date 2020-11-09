# Spring Rest API :coffee:

This project was made with Java and Spring, it's a  CRUD backend, it can be used to connect with a frontend through API.

## Technologies :computer:

- Java
- Spring boot
- Spring Data JPA 
- Postman
- Eclipse 
- Swagger 
- MySQL 

## How to use :wave:

To clone and run this application by yourself, make sure you have at least Java 8 and all JDK stuff (including JRE), Maven to build the dependencies, Ecplise or STS, and Postman (it's not necessary, though it's really useful to handle a rest API. After that, do the following instructions: 

```bash
# Clone this repository
$ git clone https://github.com/reness0/spring-rest-api-angular-backend

# Start the application
  run ApiApplication.java

# EndPoints 
  The endpoints are on 'http://localhost:3000/api'
  Use a software like postman to do the resquests. 
```

> By the way, you can change the port (3000) to another one, just change the line on ``` application.properties ```


# API Documentation :memo:

Swagger is responsible to provide a documentation of the API, it break down the endpoints and the models of the application.
Acess: ``` http://localhost:3000/swagger-ui.html ```


![swagger](https://user-images.githubusercontent.com/49681380/98442832-faaa5a80-20e5-11eb-9370-497b7f7ef658.JPG)


**Now, you are able to run this Java application locally.** :heavy_check_mark:


## Ideas to contribute :heavy_plus_sign:

You can contribute of many ways, such as:

- Create new models
- Implement login, with JWT. 
- Create more endpoints

## How to contribute :question:

1. Make a fork;
2. Create a branch with your feature: `git checkout -b my-feature`;
3. Commit changes: `git commit -m 'Creating new classes'`;
4. Push the changes: `git push origin my-feature`.






