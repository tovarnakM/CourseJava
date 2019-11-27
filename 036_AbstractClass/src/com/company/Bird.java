package com.company;

public abstract class Bird extends Animal implements ICanFly {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat.");
    }

    @Override
    public void fly() {
        System.out.println(getName() + " its flapping its wings");
    }
}
