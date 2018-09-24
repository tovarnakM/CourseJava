package com.tovarnak;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10_000,2));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10_000,3));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10_000,4));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10_000,5));

        System.out.println();

        for (int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        //
        //
        //                  *****EXERCISE*****
        //
        //
        //  1, using the for statement, call the calculateInterest method with
        //     the amount of 10 000 with an interestRate 2,3,4,5,6,7 and 8
        //     and print the results to the console window
        //  2, modify exercise above to do same thing as shown, but to start from 8% and work back to 2%

        for (int i = 2; i < 9; i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }
        System.out.println("*************");

        for (int i = 8; i > 1; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }

        System.out.println("*************");

        //
        //
        //                  *****EXERCISE*****
        //
        //
        //  Create a for statement using any range of numbers
        //  Determine if the number is prime using isPrime method
        //  if it is a prime number, print it out AND increment a count of the
        //  number of prime numbers found
        //  if that count is 3 exit the for loop

        int count = 0;

        for (int i = 10; i < 50; i++){
            if (isPrime(i)){
                System.out.println("Number " + i + " is PRIME number");
                count++;
            }
            if (count == 3){
                break;
            }
        }

    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n){

        if (n == 1){
            return false;
        }
        for (int i = 2; i <= n/2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
