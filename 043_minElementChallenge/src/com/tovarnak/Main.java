package com.tovarnak;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Enter number of elements for array: ");
        int count = scanner.nextInt();
        int[] array = readInteger(count);
        System.out.println("We get array: " + Arrays.toString(array));
        System.out.println("Minimum element of array is: " + findMin(array));
    }

    public static int[] readInteger(int count){
        System.out.println("Enter " + count + " integers:");
        int[] array = new int[count];
        for (int i = 0; i < count; i++){
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array){
        int min = array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
}
