package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";
    public static void main(String[] args) {
        printYearsAndDays(1440);
    }

    public static String getDurationString(int minutes, int seconds){
        if (minutes < 0){
            return INVALID_VALUE_MESSAGE;
        }
        if (seconds < 0 || seconds > 59){
            return INVALID_VALUE_MESSAGE;
        }
        int hours = minutes / 60;
        minutes = minutes % 60;

        String newHours = Integer.toString(hours);
        String newMinutes = Integer.toString(minutes);
        String newSeconds = Integer.toString(seconds);

        if (hours < 10){
           newHours = "0" + newHours;
        }
        if (minutes < 10){
            newMinutes = "0" + newMinutes;
        }
        if (seconds < 10){
            newSeconds = "0" + newSeconds;
        }

        return (newHours + "h " + newMinutes + "m " + newSeconds + "s");
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds / 60;
        seconds = seconds % 60;
        return getDurationString(minutes, seconds);
    }

    public static double area(double radius){
        if (radius < 0){
            return -1;
        }
        return radius * radius * Math.PI;
    }

    public static double area(double x, double y){
        if (x < 0 || y < 0){
            return -1;
        }
        return x * y;
    }

    public static void printYearsAndDays(long minutes){
        if (minutes < 0){
            System.out.println("Invalid Value");
        }else {
            long years = minutes / 60 / 24 / 365;
            long remainMinute = minutes - (years * 60 * 24 * 365);
            long days = remainMinute / 60 / 24;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }

    public static void printEqual(int num1, int num2, int num3){
        if (num1 < 0 || num2 < 0 || num3 < 0){
            System.out.println("Invalid Value");
        } else if (num1 == num2 && num2 == num3){
            System.out.println("All numbers are equal");
        } else if (num1 != num2 && num2 != num3 && num1 != num3){
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature){
        if(!summer){
            if (temperature >= 25 && temperature <= 35){
                return true;
            }
        }else {
            if (temperature >= 25 && temperature <= 45){
                return true;
            }
        }
        return false;
    }
}








