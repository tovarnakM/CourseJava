package com.tovarnak;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.fullname = "Markus";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health is " + player.healthRemaining());
        EnhancedPlayer player = new EnhancedPlayer("Markus",50,"sword");
        System.out.println("Initial health is: " + player.getHealth());
    }
}
