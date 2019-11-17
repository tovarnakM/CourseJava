package com.company;

public class Light {

    private boolean turnOn;
    private boolean isDark;

    public Light(boolean turnOn, boolean isDark) {
        this.turnOn = turnOn;
        this.isDark = isDark;
    }

    public void turnOn(){
        if (this.isDark){
            this.turnOn = true;
            System.out.println("Light turned on.");
        }else {
            this.turnOn = false;
            System.out.println("Light turned off.");
        }
    }

    public boolean isTurnOn() {
        return turnOn;
    }

    public boolean isDark() {
        return isDark;
    }
}
