This code repo contains the code base for test.

### Description:
 This code base contains the backend business logic for the HSBC test, which fetches the data from the openWeather api.

This project is developed as a spring boot maven Rest service. Exposed a *REST* GET endpoint ` http://localhost:8080/getCities?letter=z`

#### Steps to execute:

    1: Run command `mvn clean install` from the project root folder.
Above command should be successful and run all the *tests*, you should be able to see a message *BUILD SUCCESS*

### Run the application and hit the GET endpoint through postman

    1: Install maven in your local machine.
    2: Run this command from the project root folder mvn spring-boot:run
    3: Hit this endpoint ```http://localhost:8080/getCities?letter=z``` from post man.


    Response:
    ``` {
       "noOfCitiesMatched": 3
     }```


### postman output looks like 
![alt text](https://github.com/karri-sek/hsbcFrontEnd/blob/master/src/images/result.png?raw=true)
### Frontend:
    
