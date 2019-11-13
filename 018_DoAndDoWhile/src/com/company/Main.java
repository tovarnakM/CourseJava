package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(sumDigits(32123));
        int count = 1;
	    while (count != 6){
            System.out.println("Count value is " + count);
            count++;
	    }

	    System.out.println("**********");

	    for (count = 1; count != 6; count++){
            System.out.println("Count value is " + count);
        }

        System.out.println("**********");

	    count = 1;
	    while (true){
	        if (count == 6){
	            break;
            }
            System.out.println("Count value is " + count);
	        count++;
        }

        System.out.println("**********");

	    count = 1;
	    do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6);

        System.out.println("**********");

        int sum = 0;
        int counter = 0;
        int number = 4;
        int finishNUmber = 20;
        while (number <= finishNUmber){
            number++;
            if (!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number " + number);
            counter++;
            sum += number;
            if (counter == 5){
                break;
            }
        }
        System.out.println("Sum of even numbers is " + sum);
    }

    public static boolean isEvenNumber(int number){
        if (number % 2 == 0){
            return true;
        }
        return false;
    }

    public static int sumDigits(int number){
        if (number < 10){
            return -1;
        }
        int sum = 0;
        while (number != 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
