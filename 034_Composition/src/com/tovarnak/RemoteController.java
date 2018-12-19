package com.tovarnak;

public class RemoteController {

    private String brand;
    private int reach;
    private Television television;

    public RemoteController(String brand, int reach) {
        this.brand = brand;
        this.reach = reach;
    }

    public void turnOnTV(){
        System.out.println("Welcome!");
    }

    public String getBrand() {
        return brand;
    }

    public int getReach() {
        return reach;
    }
}
