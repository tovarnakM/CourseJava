package com.company;

public class Main {

    public static void main(String[] args) {
       boolean result = areEqualByThreeDecimalPlaces(3.175,3.176);
        System.out.println(result);
    }

    public static void checkNumber(int number){
        if (number > 0){
            System.out.println("Number is positive");
        } else if (number < 0){
            System.out.println("Number is negative");
        }else {
            System.out.println("Number is equals to zero");
        }
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour >= 0){
            return Math.round(kilometersPerHour / 1.609);
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0){
            System.out.println("Invalid value");
        }else {
            System.out.println(kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0){
            System.out.println("Invalid Value");
        }else {
            int mBytes = kiloBytes / 1024;
            int remainKiloBytes = kiloBytes - (mBytes * 1024);
            System.out.println(kiloBytes + " KB = " + mBytes + " MB and " + remainKiloBytes + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean isBarking, int hourOfDay){
        if (isBarking && hourOfDay < 24 && hourOfDay >= 0){
            return (hourOfDay < 8) || (hourOfDay > 22);
        }
        return false;
    }

    public static boolean isLeapYear(int year){
        if (year >= 1 && year <= 9999){
            if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)){
                return true;
            }
            if ((year % 4 == 0) && (year % 100 != 0)){
                return true;
            }
        }
        return false;
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        int firstNumber = (int) (num1 * 1000);
        int secondNumber = (int) (num2 * 1000);
        return firstNumber == secondNumber;
    }

    public static boolean hasEqualSum(int num1, int num2, int num3){
        if (num1 + num2 == num3){
            return true;
        }
        return false;
    }

    public static boolean hasTeen(int num1, int num2, int num3){
        return ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19));
    }

    public static boolean isTeen(int num1){
        return (num1 >= 13 && num1 <= 19);
    }
}
