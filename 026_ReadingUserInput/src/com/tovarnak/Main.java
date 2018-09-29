package com.tovarnak;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");

        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {
            int yearOfBirth = 2018 - scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();

            if ((yearOfBirth >= 0) && (yearOfBirth <= 100)) {
                System.out.println("Your name is: " + name + " and your age is " + yearOfBirth);
            } else {
                System.out.println("Invalid year of birth");
            }
        }else {
            System.out.println("Unable to parse year of birth");
        }
        scanner.close();
    }
}
