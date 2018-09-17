package com.tovarnak;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

       /* if ((score < 5000) && (score > 1000)) {
            System.out.println("Your score was less than 5000 but greater than 1000.");
        }else if (score < 1000){
            System.out.println("Your score was less than 1000.");
        } else {
            System.out.println("Got here.");
        }*/

        if (gameOver) {
            //IntelliJ will automatically delete any variables that it creates in that code block.
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

        //
        //
        //                  *****EXERCISE*****
        //
        //
        // Print out a second score on the screen with following:
        //  1. score set to 10000
        //  2. levelCompleted set to 8
        //  3. bonus set to 200
        //  But make sure the first print out above still displays as well

        score = 10_000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }

    }
}


