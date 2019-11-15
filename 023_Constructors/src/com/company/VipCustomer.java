package com.company;

public class VipCustomer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public VipCustomer(){
        this("Default name", 10_000, "default@gmail.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "unknown@gmail");
    }

    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }


}
