package com.tovarnak;

public class Light {

    private boolean isTurned;
    private boolean turnOn;
    private boolean turnOff;

    public Light(boolean isTurned) {
        this.isTurned = isTurned;
    }

    public void isTurned(){
        if (isTurned){
            turnOff = true;
            turnOn = false;
            System.out.println("Yes, turning OFF...");
        }else {
            turnOn = true;
            turnOff = false;
            System.out.println("No, turning ON...");
        }
    }
}
