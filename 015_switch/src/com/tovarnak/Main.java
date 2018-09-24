package com.tovarnak;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Value was not 1 or 2");
//        }

        int switchValue = 4;

        switch (switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually it was a " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

            //
            //
            //                  *****EXERCISE*****
            //
            //
            //  Create a new switch statement using char instead of int
            //  Create  new char variable
            //  Create a switch statement testing for A, B, C, D, or E
            //  display a message if any of these are found and then break
            //  add a default which displays a message saying not found

        char newChar = 'X';

        switch(newChar){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Char " + newChar + " is found");
                break;
            default:
                System.out.println("Char " + newChar + " is not found");
                break;
        }

        String month = "JANUARy";

        switch (month.toLowerCase()){
            case "january":
                System.out.println("Month " + month + " found");
                break;
            default:
                System.out.println("Not found month " + month);
                break;
        }
    }
}
