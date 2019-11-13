package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000,2));

        for (int i = 0; i < 5; i++){
            System.out.println("Loop " + i + " hello!");
        }
        for (int i = 8; i > 1; i--) {
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i)));
        }

        findPrimeNumbers(100);
        System.out.println("*************************");
        int count = 0;
        int sum = 0;
        for (int i = 1; i < 1001; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
                count++;
                sum = sum + i;
            }
            if (count == 5){
                break;
            }
        }
        System.out.println("Sum of these 5 numbers is: " + sum);
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
    public static boolean isOdd(int number){
        if (number % 2 != 0 && number > 0){
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end){
        if ((start < 0) || (end < 0) || (start > end)){
            return -1;
        }
        int sum = 0;
        for (int i = start; i <= end; i++){
            if (isOdd(i)){
                sum += i;
            }
        }
        return sum;
    }
}
