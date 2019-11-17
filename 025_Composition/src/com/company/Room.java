package com.company;

public class Room {

    private Windows windows;
    private Light light;

    public Room(Windows windows, Light light) {
        this.windows = windows;
        this.light = light;
    }

    public void turnOnLight(){
        light.turnOn();
    }

    public void openWindow(){
        windows.openWindow();
    }
}
