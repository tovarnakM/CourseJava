package com.tovarnak;

public class Main {

    public static void main(String[] args) {
        //  Advantages of overloading methods
        //  - is a feature that allows us to have more than 1 method with the same name, but with different parameters
        //  - multiple methods with the same name with difficulty implementations
        //  - easy to remember 1 method
        //  - improves code readability and re-usability


        int newScore = calculateScore("Markus",500);
        System.out.println("New score is " + newScore);
        calculateScore();

        //
        //
        //                  *****EXERCISE*****
        //
        //
        //  1. Create a method called calcFeetAndInchesToCentimeters
        //  It needs to have two parameters
        //  feet is the first parameter, inches is the 2nd parameter in doubles
        //
        //  check parameter feet is greater or equals to 0. Check 2nd parameter is in range
        //  0-12 (inclusive)
        //
        //  return -1 if both of parameter is failed
        //  If the parameters are valid, then calculate how many centimeters comprise
        //  the feet and inches passed to this method and return that value
        //
        //  2. Create a 2nd method of the same name but with only one parameter inches
        //  validate that its >=0
        //  if not true return -1
        //  If it is valid, then calculate how many feet are in the inches
        //  call the other overloaded method passing the correct feet and inches
        //  calculated so that it can calculate correctly
        //  Hints: a,   1 inch = 2.54 cm
        //         b,   one foot = 12 inches


        calcFeetAndInchesToCentimeters(100);
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches < 0){
            return -1;
        }
        double feet = (int) (inches / 12);
        double inch = (int) (inches % 12);
        System.out.println(inches + " inches ---> " + feet + " feet and " + inch + " inches.");

        return calcFeetAndInchesToCentimeters(feet,inch);
    }


    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet < 0){
            System.out.println("Invalid parameters");
            return -1;
        }
        if ((inches < 0) || (inches > 12)){
            System.out.println("Invalid parameters");
            return -1;
        }

        double cm = feet * 12 * 2.54 + inches * 2.54;
        System.out.println(feet + " feet and " + inches + " inches ---> " + cm + " centimeters.");
        return cm;
    }


    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player name, no player score.");
        return 0;
    }
}
