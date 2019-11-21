package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        int[] array = getIntegers(5);
        printArray(array);

        System.out.println();

        sortIntegers(array);
        printArray(array);

        //System.out.println(getAverage(array));

        /*Scanner scanner = new Scanner(System.in);
        int[] array = new int[0];
        int countOfNumber = 0;
        while (true){
            System.out.println("Enter " + (countOfNumber + 1) + "." + "number");
            boolean hasEnteredInt = scanner.hasNextInt();
            if (hasEnteredInt) {
                int number = scanner.nextInt();
                scanner.nextLine();
                array = Arrays.copyOf(array, array.length + 1);
                array[countOfNumber] = number;
                countOfNumber++;
            }else {
                scanner.nextLine();
                System.out.println("Entered ended");
                break;
            }
        }

        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }*/


        /*int[] myIntArray = new int[25]; //{1,2,3,4,5,6,7,8,9,10};
        double[] myDoubleArray = new double[10];
        for (int i = 0; i < myIntArray.length; i++){
            myIntArray[i] = i * 10;
        }
        printArray(myIntArray);*/
    }

    public static void printArray(int[] array){
        System.out.println("My int values are: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static int[] getIntegers(int number){
        System.out.println("Enter " + number + " integers values");
        int[] array = new int[number];

        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return array;
    }

    public static double getAverage(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return ((double)sum/array.length);
    }

    public static int[] sortIntegers(int[] array){
        int value;
        for (int i = 0; i < array.length;i++){
            for (int j = i; j < array.length; j++){
                if (array[j] > array[i]){
                    value = array[i];
                    array[i] = array[j];
                    array[j] = value;
                }
            }
        }
        return array;
    }
}
