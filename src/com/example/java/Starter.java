package com.example.java;

import javax.swing.*;

public class Starter {

    static String newStarter;
    static int starterHealth;
    static int starterStrength;
    static int starterSpeed;

// Possible change to getting user input from a dialogue window? https://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html

    public static String selectStarter() {
        JOptionPane.showMessageDialog(null, "Welcome trainer! Please select your starter!");
        int starter = Integer.parseInt(JOptionPane.showInputDialog("Which starter will you choose?\n\nCharmander = 1, Squirtle = 2, Bulbasaur = 3\n\n"));
        if (starter == 1) {
            JOptionPane.showMessageDialog(null, "You have chosen Charmander!");
            newStarter = "Charmander";
            return newStarter;
        } else if (starter == 2) {
            JOptionPane.showMessageDialog(null, "You have chosen Squirtle!");
            newStarter = "Squirtle";
            return newStarter;
        } else if (starter == 3) {
            JOptionPane.showMessageDialog(null, "You have chosen Bulbasaur!");
            newStarter = "Bulbasaur";
            return newStarter;
        } else
            JOptionPane.showMessageDialog(null, "You have entered an incorrect starter, please try again!");
        return null;
    }

    public static void getNewStarter(String newStarter) {
        JOptionPane.showMessageDialog(null, "Ah so you have chosen " + newStarter + "! Great choice.");
        if (newStarter == "Charmander") {
            starterHealth = 20;
            starterStrength = 6;
            starterSpeed = 4;
            JOptionPane.showMessageDialog(null, "Your " + newStarter + "'s stats are: \n Health: "
                    + starterHealth + "\n Strength: " + starterStrength + "\n Speed: " + starterSpeed);
        } else if (newStarter == "Squirtle") {
            starterHealth = 25;
            starterStrength = 4;
            starterSpeed = 5;
            JOptionPane.showMessageDialog(null, "Your " + newStarter + "'s stats are: \n Health: "
                    + starterHealth + "\n Strength: " + starterStrength + "\n Speed: " + starterSpeed);
        } else if (newStarter == "Bulbasaur") {
            starterHealth = 20;
            starterStrength = 5;
            starterSpeed = 5;
            JOptionPane.showMessageDialog(null, "Your " + newStarter + "'s stats are: \n Health: "
                    + starterHealth + "\n Strength: " + starterStrength + "\n Speed: " + starterSpeed);
        }
    }
}
