package com.example.java;

import javax.swing.*;

class Starter {

    static String newStarter;
    static int starterHealth;
    static int starterAttack;
    static int starterSpeed;

    private static int randomStarterHealth(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    private static int randomStarterAttack(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    private static int randomStarterSpeed(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

// Possible change to getting user input from a dialogue window? https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html

    static void selectStarter() {
        JOptionPane.showMessageDialog(null, "Welcome trainer! Please select your starter!");
        int starter = Integer.parseInt(JOptionPane.showInputDialog("Which starter will you choose?\n\nCharmander = 1, Squirtle = 2, Bulbasaur = 3\n\n"));
        if (starter == 1) {
            JOptionPane.showMessageDialog(null, "You have chosen Charmander!");
            newStarter = "Charmander";
        } else if (starter == 2) {
            JOptionPane.showMessageDialog(null, "You have chosen Squirtle!");
            newStarter = "Squirtle";
        } else if (starter == 3) {
            JOptionPane.showMessageDialog(null, "You have chosen Bulbasaur!");
            newStarter = "Bulbasaur";
        } else
            JOptionPane.showMessageDialog(null, "You have entered an incorrect starter, please try again!");
    }

    static void getNewStarter(String newStarter) {
        JOptionPane.showMessageDialog(null, "Ah so you have chosen " + newStarter + "! Great choice.");
        if (newStarter == "Charmander") {
            starterHealth = randomStarterHealth(18,22);
            starterAttack = randomStarterAttack(5,7);
            starterSpeed = randomStarterSpeed(3,5);
            JOptionPane.showMessageDialog(null, "Your " + newStarter + "'s stats are: \n Health: "
                    + starterHealth + "\n Strength: " + starterAttack + "\n Speed: " + starterSpeed);
        } else if (newStarter == "Squirtle") {
            starterHealth = randomStarterHealth(23,27);
            starterAttack = randomStarterAttack(3,5);
            starterSpeed = randomStarterSpeed(4,6);
            JOptionPane.showMessageDialog(null, "Your " + newStarter + "'s stats are: \n Health: "
                    + starterHealth + "\n Strength: " + starterAttack + "\n Speed: " + starterSpeed);
        } else if (newStarter == "Bulbasaur") {
            starterHealth = randomStarterHealth(18,22);
            starterAttack = randomStarterAttack(4,6);
            starterSpeed = randomStarterSpeed(4,6);
            JOptionPane.showMessageDialog(null, "Your " + newStarter + "'s stats are: \n Health: "
                    + starterHealth + "\n Strength: " + starterAttack + "\n Speed: " + starterSpeed);
        }
    }
}
