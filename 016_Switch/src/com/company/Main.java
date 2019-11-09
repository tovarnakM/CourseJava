package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDaysInMonth(2,2020));
        int switchValue = 5;

	    switch (switchValue){
            case 1:
                System.out.println("Value 1");
                break;
            case 2:
                System.out.println("Value 2");
                break;
            case 3: case 4: case 5:
                System.out.println("Value was 3 or 4 or 5");
                System.out.println("Actually it was " + switchValue);
                break;
            default:
                System.out.println("Value was not 1 or 2");
                break;
        }

        char switchChar = 'D';
	    switch (switchChar){
            case 'A':
                System.out.println("Value is A");
                break;
            case 'B':
                System.out.println("Value is B");
                break;
            case 'C':
                System.out.println("Value is C");
                break;
            case 'D':
                System.out.println("Value is D");
                break;
            case 'E':
                System.out.println("Value is E");
                break;
            default:
                System.out.println("Value not found");
                break;
        }

    }
    public static void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }

    public static void printNumberInWord(int number){
        if (number == 0){
            System.out.println("ZERO");
        }else if (number == 1){
            System.out.println("ONE");
        }else if (number == 2){
            System.out.println("TWO");
        }else if (number == 3){
            System.out.println("THREE");
        }else if (number == 4){
            System.out.println("FOUR");
        }else if (number == 5) {
            System.out.println("FIVE");
        }else if (number == 6){
            System.out.println("SIX");
        }else if (number == 7){
            System.out.println("SEVEN");
        }else if (number == 8){
            System.out.println("EIGHT");
        }else if (number == 9){
            System.out.println("NINE");
        }else {
            System.out.println("OTHER");
        }
    }

    public static boolean isLeap(int year){
        if (year < 1 || year > 9999){
            return false;
        }
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
            return true;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12){
            return -1;
        }
        if (year < 1 || year > 9999){
            return -1;
        }
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isLeap(year)){
                    return 29;
                }else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }
    }
}

























