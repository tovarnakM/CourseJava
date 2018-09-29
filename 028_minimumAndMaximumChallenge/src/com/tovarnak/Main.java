package com.tovarnak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        -Read the numbers from the console entered by the user and print the minimum and maximum number the user has entered.
//        -Before the user enters the number, print the message gEnter number:h
//                -If the user enters an invalid number, break out of the loop and print the minimum and maximum number.
//
//        Hint:
//        -Use an endless while loop.
//
//                Bonus:
//        -Create a project with the name MinAndMaxInputChallenge.

        Scanner scanner = new Scanner(System.in);

        double max = 0;
        double min = 0;
        double number;

        int first = 1;
        while (true){
            System.out.println("Enter the number: ");
            boolean isNumber = scanner.hasNextDouble();

            if (isNumber){
                number = scanner.nextDouble();
                if (first == 1){
                    max = number;
                    min = number;
                    first++;
                    continue;
                }
                if (number > max){
                    max = number;
                }
                if (number < min){
                    min = number;
                }
            }else {
                break;
            }
            scanner.nextLine();
        }
        scanner.close();

        if (first == 1){
            System.out.println("Can not find any max and min number");
            return;
        }

        System.out.println("Max number is = " + max);
        System.out.println("Min number is = " + min);

    }
}
