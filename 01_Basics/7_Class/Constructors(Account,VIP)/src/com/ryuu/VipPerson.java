package com.ryuu;

public class VipPerson {
    private String name;
    private double creditLimit;
    private String emailAddress;


    //constructor(default)
    public VipPerson() {
        this("Default name", 50000.00, "default@email.com");
    }

    //constructor(name, creditlimit)
    public VipPerson(String name, double creditLimit) {
        this(name, creditLimit, "unknown@email.com");
    }

    //constructor(name, creditlimit, emailAddress)
    public VipPerson(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
