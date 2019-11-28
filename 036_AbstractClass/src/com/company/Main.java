package com.company;

import java.util.LinkedList;

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

        list.addItem(new Node("E"));
        list.addItem(new Node("B"));
        list.addItem(new Node("A"));
        list.addItem(new Node("C"));
        list.addItem(new Node("F"));
        list.traverse(list.getRoot());

        MyLinkList myLinkList = new MyLinkList();
        myLinkList.add(5);
        myLinkList.add(6);
        myLinkList.add(6);
        myLinkList.add(6);
        myLinkList.add(7);
        myLinkList.show();
    }
}

