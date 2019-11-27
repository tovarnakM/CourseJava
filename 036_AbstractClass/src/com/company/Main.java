package com.company;

public class Main {

    public static void main(String[] args) {

        /*Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

        Parrot parrot = new Parrot("Australian parrot");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Pinguin pinguin = new Pinguin("Pinguin");
        pinguin.fly();*/

        MyLinkedList list = new MyLinkedList(null);
        list.traverse(list.getRoot());

        /*String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

        String[] data = stringData.split(" ");
        for (String s : data) {
                list.addItem(new Node(s));
        }*/

        list.addItem(new Node("A"));
        list.addItem(new Node("B"));
        list.addItem(new Node("C"));
        list.addItem(new Node("D"));
        list.addItem(new Node("E"));
        list.addItem(new Node("Cc"));
        list.traverse(list.getRoot());
    }
}
