package com.tovarnak;

public class Main {

    public static void main(String[] args) {

        //int has width of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;
        int myTotal = (myMinValue/2);
        System.out.println("myTotal = " + myTotal);

        //int has width of 8
        byte myByteValue = -128;
        //Java convert expression automatically as int
        byte myNewByteValue = (byte)(myByteValue/2);
        System.out.println("myNewByteValue = " + myNewByteValue);

        //int has width of 16
        short myShortValue = -32767;
        short myNewShortValue = (short)(myShortValue/2);
        System.out.println("myNewShortValue = " + myNewShortValue);

        //long has width 64
        long myLongValue = 9_223_372_036_854_775_807L;
        long myNewLongValue = (myLongValue/2);
        System.out.println("myNewLongValue = " + myNewLongValue);

        //
        //                      *****EXERCISE*****
        //
        //  1. Create a 'byte' variable and set it to any valid byte number.
        //  2. Create a 'short' variable and set it to any valid short number.
        //  3. Create an 'int' variable and set it to any valid int number.
        //  4. create a variable of type 'long' and make it equal to 50000 plus 10 times
        //     the sum of the byte plus the short plus the int.

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = (50000L + 10L*(myByte + myShort + myInt));
        System.out.println("myLong = " + myLong);

    }
}
