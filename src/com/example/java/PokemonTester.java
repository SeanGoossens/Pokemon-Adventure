package com.example.java;

import javax.swing.*;

import static com.example.java.Pokemon.battle;

import static com.example.java.Starter.*;



public class PokemonTester {

    public static WildPokemon wildPokemon;


    public static void main(String[] args) {
        Starter.selectStarter();
        Starter.getNewStarter(newStarter);
        Starter starter = new Starter(newStarter, maxStarterHealth, starterAttack, starterSpeed);

        WildPokemon wildPokemon = new WildPokemon();

        JDialog.setDefaultLookAndFeelDecorated(true);
        Object[] selectionValues = {"Zone 1 (Easy)", "Zone 2 (Medium)"};
        String initialSelection = "Zone 1";
        Object selection = JOptionPane.showInputDialog(null, "Which zone would you like to battle in?",
                "Pokemon Adventure", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
        if (selection == "Zone 1 (Easy)") {
            JOptionPane.showMessageDialog(null, "You have chosen Zone 1!");
            battle(starter, wildPokemon.getRandomPokemonZone1());
        } else if (selection == "Zone 2 (Medium)") {
            JOptionPane.showMessageDialog(null, "You have chosen Zone 2!");
            battle(starter, wildPokemon.getRandomPokemonZone2());
        }
    }
}