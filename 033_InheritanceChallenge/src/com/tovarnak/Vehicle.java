package com.tovarnak;

public class Vehicle {

    private int velocity;
    private String direction;
    private int acceleration;
    private String name;

    public Vehicle(int velocity, String direction, int acceleration, String name) {
        this.velocity = velocity;
        this.direction = direction;
        this.acceleration = acceleration;
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public int getGear(){
        if (velocity >= 50){
            return 5;
        }else if (velocity > 40 ){
            return 4;
        }else if (velocity > 30){
            return 3;
        }else if (velocity > 20){
            return 2;
        }else if (velocity > 10){
            return 1;
        }else if (velocity == 0){
            return 0;
        }else {
            return -1;
        }
    }
}





