package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000,2));

        for (int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }
        for (int i = 8; i > 1; i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f",calculateInterest(10000,i)));
        }

        findPrimeNumbers(100);
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n){
        if (n == 1){
            return false;
        }
        for (int i = 2; i < n/2; i++){
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void findPrimeNumbers(int number){
        int count = 0;
        for (int i = 10; i < number; i++){
            if (isPrime(i)){
                System.out.println("Prime number found: " + i);
                count++;
            }
            if (count == 3){
                break;
            }
        }
    }
}
