package com.company;

public class Main {

    public static void main(String[] args) {

        int highScore = calculateScore(true,1000,4,25);
        System.out.println("My high score is: " + highScore);

        int newHighScore = calculateHighScorePosition(500);
        displayHighScorePosition("Markus", newHighScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus){

        if (gameOver){
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            return finalScore;
        }
        return -1;
    }

    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + ". on the high score table.");
    }

    public static int calculateHighScorePosition(int score){
        if (score >= 1000){
            return 1;
        }else if (score >= 500){
            return 2;
        } else if (score >= 100){
            return 3;
        }
        return 4;
    }
}
