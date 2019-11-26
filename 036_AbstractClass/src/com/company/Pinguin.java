package com.company;

public class Pinguin extends Bird {

    public Pinguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I am not very good at them but I can fly");
    }
}
