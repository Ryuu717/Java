package com.ryuu;

public class Main {

    public static void main(String[] args) {
	    boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        //1. Check the score
        if(score < 5000 && score >1000) {
            System.out.println("This was was less than 5000 but greater than 1000");
        } else if(score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");

        }

        //2. Calculate the final score
        if(gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was " + finalScore);
        }
    }
}
