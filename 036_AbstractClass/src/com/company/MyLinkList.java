package com.company;

public class MyLinkList {

    MyNode head;

    public void add(int data){
        MyNode myNode = new MyNode();
        myNode.data = data;
        myNode.next = null;

        if (head == null){
            head = myNode;
        }else {
            MyNode n = head;
            while (n.next != null){
                n = n.next;
            }
            n.next = myNode;
        }
    }

    public void show(){
        MyNode myNode = head;
        while (myNode != null){
            System.out.println(myNode.data);
            myNode = myNode.next;
        }
    }

    public class MyNode {
        int data;
        MyNode next;
    }
}
