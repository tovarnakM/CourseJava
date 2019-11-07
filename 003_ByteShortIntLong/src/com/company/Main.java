package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10_000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("Busted MAX value = " + (myMaxIntValue + 1));
        System.out.println("Busted MIN value = " + (myMinIntValue - 1));

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Min byte = " + myMinByteValue);
        System.out.println("Max byte = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Min short = " + myMinShortValue);
        System.out.println("Max short = " + myMaxShortValue);

        long myLongValue = 100_000_000_000L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Min long = " + myMinLongValue);
        System.out.println("Max long = " + myMaxLongValue);

        int myTotal = (myMinIntValue / 2);
        //CASTING
        byte myTotalByte = (byte) (myMinByteValue / 2);
        short myTotalShort = (short) (myMinShortValue / 2);

        byte num1 = 10;
        short num2 = 20;
        int num3 = 50;
        long total = (50_000L + 10L * (num1 + num2 + num3));
        System.out.println("Total: " + total);
    }
}
