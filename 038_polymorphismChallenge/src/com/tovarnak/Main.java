package com.tovarnak;

class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() { return name; }

    public String startEngine(){
        return "Engine was started. (for Car)";
    }

    public String accelerate(){
        return "Accelerate (for Car)";
    }

    public String brake(){
        return "Brake (for Car)";
    }
}
class Mercedes extends Car{

    public Mercedes(int cylinders, String name){
        super(cylinders,name);
    }
    @Override
    public String startEngine(){
        return "Engine was started. (for Mercedes)";
    }
    @Override
    public String accelerate(){
        return "Accelerate (for Mercedes)";
    }
    @Override
    public String brake(){
        return "Brake (for Mercedes)";
    }
}
class Porsche extends Car{
    public Porsche(int cylinders, String name){
        super(cylinders,name);
    }
    @Override
    public String startEngine(){
        return "Engine was started. (for Porsche)";
    }
    @Override
    public String accelerate(){
        return "Accelerate (for Porsche)";
    }
    @Override
    public String brake(){
        return "Brake (for Porsche)";
    }
}
class Skoda extends Car{
    public Skoda(int cylinders, String name){
        super(cylinders,name);
    }
    @Override
    public String startEngine(){
        return "Engine was started. (for Skoda)";
    }
    @Override
    public String accelerate(){
        return "Accelerate (for Skoda)";
    }
    @Override
    public String brake(){
        return "Brake (for Skoda)";
    }
}
public class Main {

    public static void main(String[] args) {
        // We are going to go back to the car analogy.
        // Create a base class called Car
        // It should have a few fields that would be appropriate for a generics car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinders (number of) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters.
        // Create appropriate getters

        // Create some methods like startEngine, accelerate, and brake
        // show a message for each in the base class
        // Now create 3 sub classes for your favorite vehicles.
        // Override the appropriate methods to demonstrate polymorphism in use.
        // put all classes in the one java file (this one).
        Car car = new Car(8,"Basic Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mercedes mercedes = new Mercedes(6,"Outlander");
        System.out.println(mercedes.startEngine());
        System.out.println(mercedes.accelerate());
        System.out.println(mercedes.brake());

        Porsche porsche = new Porsche(4,"Carrera");
        System.out.println(porsche.startEngine());
        System.out.println(porsche.accelerate());
        System.out.println(porsche.brake());

        Skoda skoda = new Skoda(2, "Octavia");
        System.out.println(skoda.startEngine());
        System.out.println(skoda.accelerate());
        System.out.println(skoda.brake());


    }
}
