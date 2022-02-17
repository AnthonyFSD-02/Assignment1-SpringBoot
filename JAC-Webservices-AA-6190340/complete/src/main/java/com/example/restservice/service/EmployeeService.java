package com.example.restservice.service;

import com.example.restservice.model.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    static List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees(){

        Province quebec = new Province("QC", "Canada");
        Province ontario = new Province("ON", "Canada");


        Employee emp1 = new Employee(001, "Anthony", "Aboussafy", new Position("Tech Guru Billionaire", 10000000), new Address(1234, "Billabong Ave.", "H4V4W2",
                new City("Cote-St-Luc", quebec)));
        Employee emp2 = new Employee(002, "Reza", "Shalchian", new Position("CEO", 1000000), new Address(4534, "Mackenzie Road.", "J3W5R6",
                new City("Westmount", quebec)));
        Employee emp3 = new Employee(003, "Stone-Cold Steve", "Austin", new Position("CFO", 350000), new Address(948, "Cucumber Lane", "P9W2Q1",
                new City("Ottawa", ontario)));

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("All employees retrieved.");
        return employees;
    }

    public Employee getById(int id){
        for(Employee e : employees){
            if (e.getId() == id){
                System.out.println("Employee with id: " + id + " has been retrieved.");
                return e;
            }
        }
        System.out.println("No employee using id: " + id + " has been found.");
        return null;
    }

    public void addEmployee(Employee employee){
        System.out.println("Employee: " + employee.getfName() + " " + employee.getlName() + " successfully added.");
        System.out.println(employee);
        employees.add(employee);
    }
}