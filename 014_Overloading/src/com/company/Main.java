package com.company;

public class Main {

    public static void main(String[] args) {
//        int score = calculateScore("Markus",500);
//        System.out.println("New score is: " + score);
//        calculateScore(75);
//        calculateScore();
        calcFeetAndInchesToCentimeters(157);
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("Unnamed player scored no score");
        return 0;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        /*if (feet < 0){
            return -1;
        }
        if (inches < 0 || inches > 12){
            return -1;
        }*/
        double centimeters = feet * 12 * 2.54 + inches * 2.54;
        System.out.println(feet + " feet and " + inches + " inches are " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            System.out.println("Invalid Value");
            return -1;
        }
        double feet = (int)(inches / 12);
        double remainInches = (int)(inches % 12);
        System.out.println("It is " + feet + " feet and " + remainInches + " inches");
        return calcFeetAndInchesToCentimeters(feet,remainInches);
    }
}
