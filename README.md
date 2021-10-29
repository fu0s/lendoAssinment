# lendoAssinment

## clone the sourcecode and position in the root directory of the project

**In order to create the containers run the command:**
 mvn clean install docker:build 
 
 **Then to start containers run the command:**
 docker-compose up
 
 #### To run a test please either using curl or postman do Post on url : http://localhost:8081/api/application
 #### with body :
 
 {
    "first_name": "ohn",
    "last_name": "Doe"
}
