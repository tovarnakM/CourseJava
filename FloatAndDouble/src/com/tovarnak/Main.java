package com.tovarnak;

public class Main {

    public static void main(String[] args) {
	    //width of int = 32 (4 bytes)
        int myIntValue = 5/3;
        //width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        //width of double = 64 (8 bytes)
        double myFloatDouble = 5d / 3d;
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myFloatDouble);

        //using underscores
        double pi = 3.141_592_7d;
        System.out.println("pi = " + pi);

        //
        //                      *****EXERCISE*****
        //
        //  Convert a given number of pounds to kilograms
        //  1. Create a variable to store number of pounds
        //  2. Calculate the number of Kilograms for a number above and store in a variable
        //  3. Print out the result
        //
        //  NOTES: 1 pound is equal to 0.45359237 kilograms

        double pounds = 200d;
        double kilograms = pounds*0.45359237d;
        System.out.println("Result of converting " + pounds + " pounds to kilograms = " + kilograms);

    }
}
