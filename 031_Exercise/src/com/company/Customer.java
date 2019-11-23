package com.company;

import java.util.ArrayList;

public class Customer {

    private ArrayList<Double> transaction;
    private String name;

    public Customer(ArrayList<Double> transaction, String name) {
        this.transaction = transaction;
        this.name = name;
    }

    public void setTransaction(ArrayList<Double> transaction) {
        this.transaction = transaction;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public String getName() {
        return name;
    }
}
