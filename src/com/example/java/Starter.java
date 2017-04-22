package com.example.java;

import javax.swing.*;

class Starter {

    static String newStarter;
    static int starterHealth;
    static int starterAttack;
    static int starterSpeed;
    static Pokemon starter;

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
        JDialog.setDefaultLookAndFeelDecorated(true);
        JOptionPane.showMessageDialog(null, "Welcome trainer! Please select your starter!");
        Object[] selectionValues = { "Charmander", "Squirtle", "Bulbasaur" };
        String initialSelection = "Charmander";
        Object selection = JOptionPane.showInputDialog(null, "Which starter would you like?",
                "Pokemon Adventure", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
        if (selection == "Charmander") {
            JOptionPane.showMessageDialog(null, "You have chosen Charmander!");
            newStarter = "Charmander";
        } else if (selection == "Squirtle") {
            JOptionPane.showMessageDialog(null, "You have chosen Squirtle!");
            newStarter = "Squirtle";
        } else if (selection == "Bulbasaur") {
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
        } else if (newStarter == "Squirtle") {
            starterHealth = randomStarterHealth(23,27);
            starterAttack = randomStarterAttack(3,5);
            starterSpeed = randomStarterSpeed(4,6);

        } else if (newStarter == "Bulbasaur") {
            starterHealth = randomStarterHealth(18,22);
            starterAttack = randomStarterAttack(4,6);
            starterSpeed = randomStarterSpeed(4,6);
        }
    }
}
