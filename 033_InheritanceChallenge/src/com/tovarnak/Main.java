package com.tovarnak;

public class Main {

    public static void main(String[] args) {

        //      *****CHALLENGE*****
        //
        //  Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
        //  Finally, create another class, a specific type of Car that inherits from the Car class.
        //  You should be able to hand steering, changing gears, and moving (speed)
        //  You will want to decide where to put the appropriate state and behaviors (fields and methods).
        //  As mentioned above, changing gears, increasing/decreasing speed should be included.
        //  For you specific type of vehicle you will want to add something specific for that type of car.

        Mercedes mercedes = new Mercedes(260,"left",30);
        System.out.println(mercedes.getName());
        mercedes.setVelocity(41);
        System.out.println("Velocity of mercedes is: " + mercedes.getVelocity());
        System.out.println("Gear is actually in: " + mercedes.getGear() + " gear ");
    }
}
