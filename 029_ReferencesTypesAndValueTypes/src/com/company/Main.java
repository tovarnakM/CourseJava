package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        /*int myIntValue = 10;
        int anotherIntValue = myIntValue;

        System.out.println("My int value: " + myIntValue);
        System.out.println("Another int value: " + anotherIntValue);

        anotherIntValue++;

        System.out.println("My int value: " + myIntValue);
        System.out.println("Another int value: " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherIntArray = myIntArray;

        System.out.println("My int array: " + Arrays.toString(myIntArray));
        System.out.println("Another int array: " + Arrays.toString(anotherIntArray));

        anotherIntArray[0] = 1;

        System.out.println("My int array after change: " + Arrays.toString(myIntArray));
        System.out.println("Another int array after change: " + Arrays.toString(anotherIntArray));

        anotherIntArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(myIntArray);

        System.out.println("My int array modify: " + Arrays.toString(myIntArray));
        System.out.println("Another int array modify: " + Arrays.toString(anotherIntArray));*/






        /*System.out.println("Enter count of number you can enter: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] array = readIntegers(count);
        System.out.println(Arrays.toString(array));

        System.out.println("The minimum element of array is " + findMin(array));

        scanner.close();*/


        int[] array =  {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    private static void modifyArray(int[] array){
        array[0] = 2;
        //does not work because de-referencing
        array = new int[] {1, 2, 3, 4, 5};
    }

    private static int[] readIntegers(int count){
        int[] intNumbers = new int[count];
        for (int i = 0; i < count; i++){
            System.out.println("Enter " + (i+1) + ". number");
            intNumbers[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return intNumbers;
    }

    private static int findMin(int[] array){
        int minvalue = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < minvalue){
                minvalue = array[i];
            }
        }
        return minvalue;
    }

    private static void reverse(int[] array){
        int param;
        for (int i = 0; i < array.length / 2; i++){
            param = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = param;
        }
    }
}
