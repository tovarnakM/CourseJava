package com.tovarnak;

import java.util.Date;

public class Television {

    private String name;
    private int size;

    public Television(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void turnOn(){
        System.out.print("Television turned ON");
    }

    public void turnOff(){
        System.out.println("Television turned OFF");
    }
}
