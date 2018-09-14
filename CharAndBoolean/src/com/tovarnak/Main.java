package com.tovarnak;

public class Main {

    public static void main(String[] args) {
	    //width of char is 2 bytes
        char myChar = '\u00A9';
        System.out.println("Unicode character example " + myChar);

        boolean myBolean = true;
        boolean isMale = true;

        //
        //                  *****EXERCISE*****
        //
        //  1. Find the code for the registered (®) symbol on the same line as a copyright symbol.
        //  2. Create a variable of type char and assign it the unicode value for that symbol.
        //  3. Display it on the screen.

        char myNewChar = '\u00AE';
        System.out.println("Variable myNewChar consists from unicode " + myNewChar);
    }
}
