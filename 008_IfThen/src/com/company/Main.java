package com.company;

import javax.crypto.spec.PSource;

public class Main {

    public static void main(String[] args) {

        boolean isAlien = false;
        if (isAlien == true) {
            System.out.println("It is not an Alien");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore <= 100) {
            System.out.println("You got high score");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and lesser then 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either of both condition are true");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("This is not car");
        }

        int value = 10;
        String notice = (value == 10) ? "isEquals" : "notEquals";
        System.out.println(notice);

        double firstDoubleValue = 20.00;
        double secondDoubleValue = 80.00;
        double firstAndSecondTotal = (firstDoubleValue + secondDoubleValue)  * 100.00;
        double remainder = firstAndSecondTotal % 40.00;
        boolean isRemainderZero = remainder == 0;
        System.out.println("Is there zero remainder ? ..." + isRemainderZero);
        if (!isRemainderZero){
            System.out.println("Got some remainder");
        }
    }
}
