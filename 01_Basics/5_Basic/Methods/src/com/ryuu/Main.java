package com.ryuu;

public class Main {

    public static void main(String[] args) {
        //1. First game
        boolean gameOver = true;
        int score = 1000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(gameOver, score, levelCompleted, bonus);


        //2. Second game
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        calculateScore(gameOver, score, levelCompleted, bonus);
    }

    //Method
    public static int calculateScore(boolean gameOver,int score, int levelCompleted, int bonus) {

        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
            //return finalScore;
        }

        return -1;
    }
}
