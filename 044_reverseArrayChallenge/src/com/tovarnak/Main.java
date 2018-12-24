package com.tovarnak;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,10,0,25,5,8,4};
        System.out.println("Array: " + Arrays.toString(array));
        reverseArray(array);
        System.out.println("Reversed array: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] array){
        for (int i = 0; i < array.length/2; i++){
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }
}
