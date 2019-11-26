package com.company;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Pinguin pinguin = new Pinguin("Pinguin");
        pinguin.fly();
    }
}
