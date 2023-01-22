package com.ryuu;

public class Main {

    public static void main(String[] args) {
        EnhancedPlayer player1 = new EnhancedPlayer("Ryuu", 200, "Sword");

        System.out.println("Initial health is " + player1.getHealth());
        player1.loseHealth(50);
        System.out.println("Remaining health is " + player1.getHealth());

    }
}
