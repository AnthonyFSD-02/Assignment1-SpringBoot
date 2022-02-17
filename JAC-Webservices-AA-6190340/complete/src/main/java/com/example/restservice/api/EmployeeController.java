package com.example.restservice.api;

import com.example.restservice.model.Employee;
import com.example.restservice.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    //Creates new instance of EmployeeService class - from service package
    EmployeeService employeeService = new EmployeeService();

    //GET
    //Returns list of all employees in "database"
    //EXAMPLE       http://localhost:8080/employee
    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    //Returns employee using id, if no matching id returns null
    //EXAMPLE       http://localhost:8080/employee/1
    @GetMapping("/employee/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return employeeService.getById(id);
    }

    //POST
    //EXAMPLE       http://localhost:8080/employee
    @PostMapping("/employee")
    public Employee saveEmployee(@RequestBody Employee employee){
        employeeService.addEmployee(employee);
        return employee;
    }
    //JSON ADD EMPLOYEE EXAMPLE Script below

//{
//    "id": 4,
//    "fName": "Nicolas",
//    "lName": "Cage",
//    "position": {
//            "name": "Marketing Executive",
//            "salary": 50000
//    },
//    "address": {
//        "civicNumber": 35,
//        "street": "Yonkers Road",
//        "postalCode": "H4W9L5",
//        "city": {
//            "name": "Montreal",
//            "province": {
//                    "name": "QC",
//                    "country": "Canada"
//            }
//        }
//    }
//}

    //To Retrieve: GET:    http://localhost:8080/employee/4

}