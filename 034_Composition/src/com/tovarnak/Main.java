package com.tovarnak;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);

        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 6, 4, "v2.44");

        PC thePc = new PC(theCase, monitor, motherboard);
        thePc.powerUp();
        thePc.drawLogo();

        //
        //      ******CHALLENGE******
        //
        //  Create a single room of house using composition
        //  Think about the things that should be included in the room
        //  Maybe physical parts of the house but furniture as well
        //  Add a least one method to access an object via getter and
        //  then object public method as you saw in previous video
        //  then add at least one method to hide the object (not using getters)
        //  but to access the object used in composition within the main calss like you saw in previous video

        Television television = new Television("Samsung",5);
        RemoteController remoteController = new RemoteController("Panasonic",10);
        Light light = new Light(true);

        MyRoom myRoom = new MyRoom(television,remoteController,light);

        System.out.println("Remote controller is in " + myRoom.getRemoteController().getReach() + "m from from TV ");
        myRoom.turnTv();
        myRoom.turnLightInRoom();
    }
}
