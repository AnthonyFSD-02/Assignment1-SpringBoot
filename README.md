# Assignment1-SpringBoot
Assignment 1 - Create a Spring Boot project that illustrates what we have learned about Web Services, GET, POST, Mapping and proper organization of such projects. 

FEATURES:
My project contains the following classes: Employee, Position, Address, City & Province. 
It also contains personalized console messages for the various available GET and POST requests.
"All employees retrieved."
"No employee using id: 4 has been found."
"Employee: Nicolas Cage successfully added."
"Employee with id: 4 has been retrieved."


POSTMAN SCRIPTS:
To Retrieve all employees: GET http://localhost:8080/employee
To Retrieve specific employee by ID # (example id: 1): GET http://localhost:8080/employee/1

To Add new employee to list employees: POST http://localhost:8080/employee
TEST EMPLOYEE FOR CONVENIENCE: 

{
      "id": 4,
      "fName": "Nicolas",
      "lName": "Cage",
      "position": {
              "name": "Marketing Executive",
              "salary": 50000
      },
      "address": {
          "civicNumber": 35,
          "street": "Yonkers Road",
          "postalCode": "H4W9L5",
          "city": {
              "name": "Montreal",
              "province": {
                      "name": "QC",
                      "country": "Canada"
             }
         }
     }
} 

