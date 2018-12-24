package com.tovarnak;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Create a program using arrays that sorts a list of integers in descending order.
        // Descending order is highest value to lowest.
        // In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
        // ultimately have an array with 106,81,26, 15, 5 in it.
        // Set up the program so that the numbers to sort are read in from the keyboard.
        // Implement the following methods - getIntegers, printArray, and sortIntegers
        // getIntegers returns an array of entered integers from keyboard
        // printArray prints out the contents of the array
        // and sortIntegers should sort the array and return a new array containing the sorted numbers
        // you will have to figure out how to copy the array elements from the passed array into a new
        // array and sort them and return the new sorted array.

        int[] array = getIntegers(10);
        System.out.println("We get array: ");
        printArray(array);
        sortingArray(array);
        System.out.println("We get sorted array: ");
        printArray(array);

    }
    public static int[] getIntegers(int number){
        int[] array = new int[number];
        System.out.println("Enter " + number + " integer numbers");
        for (int i = 0; i < number; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            if (i == array.length - 1) {
                System.out.println(array[i] + ".");
            }else {
                System.out.print(array[i] + ", ");
            }
        }
    }

    public static int[] sortingArray(int[] array){
        for (int i = 0; i < array.length; i++){
            for (int j = i; j < array.length; j++){
                if (array[j] > array[i]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}










