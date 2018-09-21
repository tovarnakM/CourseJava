package com.tovarnak;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {

        //System.out.println(getDurationString(301,59));
        System.out.println(getDurationString(-5));
    }

    public static String getDurationString(int minutes, int seconds){

        if (minutes < 0){
            return INVALID_VALUE_MESSAGE;
        }
        if ((seconds > 59) || (seconds < 0)){
            return INVALID_VALUE_MESSAGE;
        }
        int hour = 0;
        if (minutes > 59){
            hour = minutes / 60;
        }
        int min = minutes % 60;

        String newHour = String.format("%02d",hour);
        String newMin = String.format("%02d",min);
        String newSeconds = String.format("%02d",seconds);

        return (newHour + "h " + newMin + "min " + newSeconds + "s");
    }

    public static String getDurationString(int seconds){
        if (seconds < 0){
            return INVALID_VALUE_MESSAGE;
        }
        int min = 0;
        if (seconds > 59){
            min = seconds / 60;
        }
        int sec = seconds % 60;
        return getDurationString(min,sec);
    }
}
