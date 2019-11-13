package com.company;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {
        
    }

    public static boolean isPalindrome(int number){
        if (number == 0){
            return true;
        }

        int enteredNumber = number;
        int reversedNumber = 0;
        int digitsCounter = 0;
        while (number != 0){
            digitsCounter++;
            number /= 10;
        }

        int multiplier = 1;
        for (int i = 1; i < digitsCounter; i++){
            multiplier *= 10;
        }

        number = enteredNumber;
        for (int i = 0; i < digitsCounter; i++){
            reversedNumber += multiplier * (number % 10);
            number /= 10;
            multiplier /= 10;
        }

        if (reversedNumber == enteredNumber){
            return true;
        }else {
            return false;
        }
    }

    public static int sumFirstAndLastDigit(int number){
        if (number < 0){
            return -1;
        }

        int enteredNumber = number;
        int digitsCounter = 0;
        while (number != 0){
            digitsCounter++;
            number /= 10;
        }

        int multiplier = 1;
        for (int i = 1; i < digitsCounter; i++){
            multiplier *= 10;
        }

        number = enteredNumber;
        int firstDigit = number / multiplier;
        int lastDigit = number % 10;

        return firstDigit + lastDigit;
    }

    public static int getEvenDigitSum(int number){
        if (number < 0){
            return -1;
        }

        int sumEvenDigits = 0;
        while (number != 0){
            int digit = number % 10;
            if (digit % 2 == 0){
                sumEvenDigits += digit;
            }
            number /= 10;
        }
        return sumEvenDigits;
    }

    public static boolean hasSharedDigit(int num1, int num2){
        if (num1 > 99 || num1 < 10 || num2 > 99 || num2 < 10){
            return false;
        }

        int digNum1_1 = num1 % 10;
        int digNum1_2 = num1 / 10;

        int digNum2_1 = num2 % 10;
        int digNum2_2 = num2 / 10;

        if (digNum1_1 == digNum2_1 || digNum1_1 == digNum2_2 || digNum1_2 == digNum2_1 || digNum1_2 == digNum2_2){
            return true;
        }
        return false;
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if (num1 > 1000 || num1 < 10 || num2 > 1000 || num2 < 10 || num3 > 1000 || num3 < 10){
            return false;
        }
        int digitNum1 = num1 % 10;
        int digitNum2 = num2 % 10;
        int digitNum3 = num3 % 10;

        if (digitNum1 == digitNum2 || digitNum2 == digitNum3 || digitNum1 == digitNum3){
            return true;
        }
        return false;
    }

    public static boolean isValid(int number){
        if (number >= 10 && number <= 1000){
            return true;
        }
        return false;
    }

    public static int getGreatestCommonDivisor(int first, int second){
        if (first < 10 || second < 10){
            return -1;
        }

        int greatestDivisor = 1;
        for (int i = 1; i <= first; i++){
            if (first % i == 0 && second % i == 0){
                greatestDivisor = i;
            }
        }
        return greatestDivisor;
    }

    public static void printFactors(int number){
        if (number < 1){
            System.out.println("Invalid Value");
        }
        for (int i = 1; i <= number; i++){
            if (number % i == 0){
                System.out.println(i);
            }
        }
    }

    public static boolean isPerfectNumber(int number){
        if (number < 1){
            return false;
        }

        int sum = 0;
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                sum += i;
            }
        }
        if (sum == number){
            return true;
        }else {
            return false;
        }
    }

    public static int getDigitCount(int number){
        if (number < 0){
            return -1;
        }
        if (number == 0){
            return 1;
        }
        int digitsCounter = 0;
        while (number != 0){
            digitsCounter++;
            number /= 10;
        }
        return digitsCounter;
    }

    public static int reverse(int number){
        int enteredNumber = number;
        int reversedNumber = 0;
        int digitsCounter = 0;
        while (number != 0){
            digitsCounter++;
            number /= 10;
        }
        int multiplier = 1;
        for (int i = 1; i < digitsCounter; i++){
            multiplier *= 10;
        }
        number = enteredNumber;
        for (int i = 0; i < digitsCounter; i++){
            reversedNumber += multiplier * (number % 10);
            number /= 10;
            multiplier /= 10;

        }
        return reversedNumber;
    }

    public static void numberToWords(int number){
        if (number < 0){
            System.out.println("Invalid Value");
            return;
        }
        String num = Integer.toString(number);

        for (int i = 0; i < num.length(); i++) {
            switch (num.charAt(i)) {
                case '0':
                    System.out.println("Zero");
                    break;
                case '1':
                    System.out.println("One");
                    break;
                case '2':
                    System.out.println("Two");
                    break;
                case '3':
                    System.out.println("Three");
                    break;
                case '4':
                    System.out.println("Four");
                    break;
                case '5':
                    System.out.println("Five");
                    break;
                case '6':
                    System.out.println("Six");
                    break;
                case '7':
                    System.out.println("Seven");
                    break;
                case '8':
                    System.out.println("Eight");
                    break;
                case '9':
                    System.out.println("Nine");
                    break;
            }
        }
    }

    public static boolean canPack(int bigCount, int smallCount, int goal){
        if (bigCount < 0 || smallCount < 0 || goal < 0){
            return false;
        }
        if (goal % 5 == 0 || smallCount >= goal){
            return true;
        }
        while (goal > 5 && bigCount > 0){
            goal -= 5;
            bigCount--;
            if (smallCount >= goal){
                return true;
            }
        }
        return false;
    }

    public static int getLargestPrime(int number){
        if (number < 0 || number == 1){
            return -1;
        }

        int largest = -1;
        int counter = 0;

        for (int i = 2; i <= number; i++){
            for (int y = 1; y <= i; y++){
                if (i % y == 0){
                    counter++;
                }
            }
            if (counter == 2){
                if (number % i == 0){
                    largest = i;
                }
            }
            counter = 0;
        }
        return largest;
    }

    public static void printSquareStar(int number){
        if (number < 5){
            System.out.println("Invalid Value");
            return;
        }

        for (int i = 0; i < number; i++){
            for (int j = 0; j < number; j++) {
                if (i == 0) {
                    System.out.print("*");
                } else if (i == number - 1) {
                    System.out.print("*");
                } else if (j == 0) {
                    System.out.print("*");
                } else if (j == number - 1) {
                    System.out.print("*");
                } else if (j == i) {
                    System.out.print("*");
                } else if (j == number - 1 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


















