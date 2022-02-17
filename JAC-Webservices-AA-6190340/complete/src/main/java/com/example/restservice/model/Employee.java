package com.example.restservice.model;

public class Employee {

    private int id;
    private String fName;
    private String lName;
    private Position position;

    private Address address;


    public Employee(int id, String fName, String lName, Position position, Address address) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.position = position;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Work ID: " + id +
                ", First Name: " + fName +
                ", Last Name: " + lName +
                ", Position: " + position +
                ", Address: " + address +
                '}';
    }
}