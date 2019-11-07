package com.company;

public class Main {

    public static void main(String[] args) {

        String myString = "This is string";
        System.out.println("My string :" + myString);
        myString = myString + " !";
        System.out.println("My string :" + myString);
        myString = myString + " \u00A9 2019";
        System.out.println("My string :" + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        int myInt = 50;
        String lastString = "10";
        lastString = lastString + myInt;
        System.out.println("Last string is equal to :" + lastString);

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("Last string is equal to :" + lastString);
    }
}
