package com.company;

import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue){
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");

        //ArrayList<int> intArrayList = new ArrayList<int>();

        ArrayList<IntClass> intArrayList = new ArrayList<>();
        intArrayList.add(new IntClass(54));
        //Integer integer = new Integer(54);
        //Double doubleValue = new Double(12.25);

        ArrayList<Integer> integerArrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            integerArrayList.add(i);
        }

        for (int i = 0; i < integerArrayList.size(); i++){
            System.out.println("Integer " + integerArrayList.get(i));
        }

        Integer myIntValue = 56; //Integer.valueOf(56)
        int myInt = myIntValue;  //myInt.intValue();

        ArrayList<Double> myDoubles = new ArrayList<>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5){
            myDoubles.add(dbl);
        }

        for (int i = 0; i < myDoubles.size(); i++){
            System.out.println("Doubles " + myDoubles.get(i));
        }
    }
}