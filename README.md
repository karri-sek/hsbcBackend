This code repo contains the code base for test.
### Description:
 This code base contains the backend business logic for the HSBC test, which fetches the data from the openWeather api.
This project is developed as a spring boot maven Rest service. Exposed a *REST* GET endpoint.
` http://localhost:8080/getCities?letter=z`

#### Steps to execute:

   Run command **`mvn clean install`** from the project root folder.
Above command should be successful and run all the *tests*, you should be able to see a message *BUILD SUCCESS*

### Run the application and hit the GET endpoint through postman

   Install maven in your local machine.
   Run this command from the project root folder **`mvn spring-boot:run`**
    Hit this endpoint **```http://localhost:8080/getCities?letter=z```** from post-man.
Response:
    ``` {
       "noOfCitiesMatched": 3
     }```


### postman output looks like 
![alt text](https://github.com/karri-sek/hsbcBackend/blob/master/src/main/resources/images/backend-postman.png?raw=true)
### Frontend repo:
Open [https://github.com/karri-sek/hsbcFrontEnd](https://github.com/karri-sek/hsbcFrontEnd) 
    
