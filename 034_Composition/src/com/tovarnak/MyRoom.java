package com.tovarnak;

public class MyRoom {

    private Television television;
    private RemoteController remoteController;
    private Light light;

    public MyRoom(Television television, RemoteController remoteController, Light light) {
        this.television = television;
        this.remoteController = remoteController;
        this.light = light;
    }

    public void turnTv(){
        television.turnOn();
        System.out.println(" Thank for seeing");
    }

    public RemoteController getRemoteController() {
        return remoteController;
    }

    public void turnLightInRoom(){
        light.isTurned();
    }
}
