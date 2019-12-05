package com.series.tovarnak;

public class Series {

    public static int getSumOfNumbers(int number){
        int sum = 0;
        for (int i = 0; i <= number; i++){
            sum += i;
        }
        return sum;
    }

    public static int getFactorial(int number){
        int factorial = 1;
        if (number == 0 || number == 1){
            return 1;
        }
        for (int i = 2; i <= number; i++){
            factorial *= i;
        }
        return factorial;
    }

    public static int fibonacci(int number){
        if (number == 0){
            return 0;
        }
        if (number == 1 || number == 2){
            return 1;
        }

        int firstNumber = 0;
        int secondNumber = 1;
        int fibSum = 0;

        for (int i = 0; i < number - 2; i++){
            fibSum = firstNumber + secondNumber;
            int temp = firstNumber;
            firstNumber = secondNumber;
            secondNumber = fibSum;
        }
        return fibSum;
    }
}
