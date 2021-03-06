package com.example.java;

import javax.swing.*;

class Starter {

    static String newStarter;
    static int maxStarterHealth;
    static int starterAttack;
    static int starterSpeed;
    static int starterLevel = 1;
    static boolean starterStatus;


    Starter(String newStarter, int starterHealth, int starterAttack, int starterSpeed, boolean starterStatus) {
        Starter.newStarter = newStarter;
        Starter.maxStarterHealth = starterHealth;
        Starter.starterAttack = starterAttack;
        Starter.starterSpeed = starterSpeed;
        Starter.starterStatus = starterStatus;
    }


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
        }
    }

    public static void createNewStarter(String newStarter) {
        JOptionPane.showMessageDialog(null, "Ah so you have chosen " + newStarter + "! Great choice.");
        if (newStarter == "Charmander") {
            maxStarterHealth = randomStarterHealth(18,22);
            starterAttack = randomStarterAttack(5,7);
            starterSpeed = randomStarterSpeed(3,5);

        } else if (newStarter == "Squirtle") {
            maxStarterHealth = randomStarterHealth(23,27);
            starterAttack = randomStarterAttack(4,6);
            starterSpeed = randomStarterSpeed(3,6);

        } else if (newStarter == "Bulbasaur") {
            maxStarterHealth = randomStarterHealth(20,24);
            starterAttack = randomStarterAttack(3,6);
            starterSpeed = randomStarterSpeed(4,6);

        }

    }
    public static void resetStarterHealth(){
        Pokemon.starterHealth = maxStarterHealth;
    }


}
