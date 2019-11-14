package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        readUserInputChallenge();


	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter your year of birth:");
	    boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name:");
            String name = scanner.nextLine();
            int age = 2019 - yearOfBirth;

            if (age >= 0 && age <= 100){
                System.out.println("Your name is " + name + " and your are " + age + " old.");
            }else {
                System.out.println("Invalid year of birth");
            }
        }else {
            System.out.println("Unable to parse user year of birth input");
        }

        scanner.close();
    }

    public static void readUserInputChallenge(){
        System.out.println("Enter 10 numbers for sum");
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        while (true){
            System.out.println("Enter " + (count + 1) + "." + " number");
            boolean hasEnteredValidNumber = scanner.hasNextInt();

            if (hasEnteredValidNumber) {
                int enteredNumber = scanner.nextInt();
                sum += enteredNumber;
                count++;
            }else {
                System.out.println("Invalid number");
                count = 0;
                sum = 0;
            }

            scanner.nextLine();

            if (count == 10){
                System.out.println("Sum of entered numbers is: " + sum);
                break;
            }
        }
    }
}
