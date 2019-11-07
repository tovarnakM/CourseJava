package com.company;

public class Main {

    public static void main(String[] args) {

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

//        if ((score < 5000) && (score > 1000)) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if (score < 1000) {
//            System.out.println("Your score was less 1000");
//        } else {
//            System.out.println("Got here");
//        }

        int secScore = 10000;
        int secLevelCompleted = 8;
        int secBonus = 200;

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score reached: " + finalScore);
            int secFinalScore = secScore + (secLevelCompleted * secBonus);
            System.out.println("Your second final score was: " + secFinalScore);
        }
    }
}
