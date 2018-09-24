package com.tovarnak;

public class Main {

    public static void main(String[] args) {
	    /*int count = 1;
	    while (count < 6){
            System.out.println("Count value is = " + count);
            count++;
        }
        System.out.println("*************");
        count = 1;
        while (true){
            if (count == 5){
                break;
            }
            System.out.println("Count value is = " + count);
            count++;
        }

        System.out.println("*********");
        count = 1;
        do{
            System.out.println("Count values is = " + count);
            count++;
        }while (count < 6);*/

	    //
        //
        //                  *****EXERCISE*****
        //
        //
        //  1, Create a method called isEvenNumber that takes a parameter of type int
        //  return true if is a even number or not
        //  2, modify the while code below
        //     make it also record the total number of even numbers it has found
        //     and break once 5 are found
        //     and at the end, display the total number of even numbers found
        int number = 4;
        int finishNumber = 20;
        int count = 0;

        while (number <= finishNumber){

            number++;
            if(!isEvenNumber(number)){
                continue;
            }
            count++;
            System.out.println("Even number " + number);
            if (count == 5){
                break;
            }
        }
        System.out.println("Count of even number is " + count);

    }
    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
