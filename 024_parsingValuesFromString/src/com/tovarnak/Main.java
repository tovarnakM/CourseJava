package com.tovarnak;

public class Main {

    public static void main(String[] args) {
	    String myString = "2018.125";
        System.out.println("myString = " + myString);

        double number = Double.parseDouble(myString);
        System.out.println("number = " + number);

        myString += 1;
        number += 1;

        System.out.println("myString = " + myString);
        System.out.println("number = " + number);
    }
}
