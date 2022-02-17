package com.example.restservice.model;

public class Address {

    private int civicNumber;
    private String street;
    private String postalCode;

    private City city;


    public Address(int civicNumber, String street, String postalCode, City city) {
        this.civicNumber = civicNumber;
        this.street = street;
        this.postalCode = postalCode;
        this.city = city;
    }

    public int getCivicNumber() {
        return civicNumber;
    }

    public void setCivicNumber(int civicNumber) {
        this.civicNumber = civicNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return  civicNumber +
                ", " + street +
                ", Postal Code: " + postalCode +
                ", City: " + city;
    }
}