package com.tovarnak;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        result = result - 1;
        System.out.println(previousResult + " - 1 = " + result);

        previousResult = result;
        result = result*10;
        System.out.println(previousResult + " * 10 = " + result);

        previousResult = result;
        result = result / 5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;
        System.out.println(previousResult + " % 3 = " + result);

        result = result + 1;
        System.out.println("Result is now " + result);

        result++;
        System.out.println("Result is now " + result);

        result--;
        System.out.println("Result is now " + result);

        result += 2;
        System.out.println("Result is now " + result);

        result *= 10;
        System.out.println("Result is now " + result);

        result -=10;
        System.out.println("Result is now " + result);

        result /= 10;
        System.out.println("Result is now " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It´s not Alien");
        }

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than topScore and less than 100");
        }

        if ((topScore > 90) || secondTopScore <=90 ){
            System.out.println("One of these tests is TRUE");
        }

        int newValue = 50;
        if (newValue == 50){
            System.out.println("This is true");
        }

        boolean isCar = true;
        if (isCar){
            System.out.println("This is not supposed to happen");
        }

        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }
        //int number1 = 1;
        //***if number1 = 1, number1 is assigned the value of 1000 else -1***
        //int number2 = (number1 == 1) ? 1000 : -1;
        //System.out.println(number2);

        //
        //
        //                  *****EXERCISE*****
        //
        //
        //  1. Create a double variable with the value 20.
        //  2. Create a second variable of type double with the value 80.
        //  3. Add both numbers up and multiply by 25.
        //  4. Use a remainder operator to figure out the remainder from the sum of (3.) divided by 40.
        //  5. Write an "if" statement that displays a message "Total was over limit".
        //     If a remaining total (4.) is equal to 20 or less.

        double number1 = 20d;
        double number2 = 80d;
        double addition = (number1 + number2) * 25;
        double remainder = addition % 40;
        System.out.println("Remainder is " + remainder);

        if (remainder <= 20){
            System.out.println("Total was over limit");
        }

    }
}
