package com.tovarnak;

public class Main {

    public static void main(String[] args) {

        String myString = "This is a string";
        System.out.println("Variable myString: " + myString);
        myString = myString + ", see that.";
        System.out.println("Variable myString: " + myString);
        myString = myString + " \u00A9 2018";
        System.out.println("Variable myString: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println("Result is: " + numberString);

        //By adding a integer to string will be converted as text automatically by Java
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString = " + lastString);

        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is yet = " + lastString);
    }
}
