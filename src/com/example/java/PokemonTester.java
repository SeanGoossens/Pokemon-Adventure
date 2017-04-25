package com.example.java;

import javax.swing.*;


import static com.example.java.Starter.*;



public class PokemonTester {


    public static void main(String[] args) {
        Starter.selectStarter();
        Starter.createNewStarter(newStarter);
        Starter starter = new Starter(newStarter, maxStarterHealth, starterAttack, starterSpeed, starterStatus);

        WildPokemon wildPokemon = new WildPokemon();

        do {JDialog.setDefaultLookAndFeelDecorated(true);
        Object[] selectionValues = {"Pallet Town (Easy)", "Veridian Forest (Medium)"};
        String initialSelection = "Pallet Town (Easy)";
        Object selection = JOptionPane.showInputDialog(null, "Which zone would you like to battle in?",
                "Pokemon Adventure", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);
        if (selection == "Pallet Town (Easy)") {
            JOptionPane.showMessageDialog(null, "You have chosen Pallet Town!");
            new Battle(starter, wildPokemon.getRandomPokemonZone1());
        } else if (selection == "Veridian Forest (Medium)") {
            JOptionPane.showMessageDialog(null, "You have chosen Veridian Forest!");
            new Battle(starter, wildPokemon.getRandomPokemonZone2());
        }
        } while (true);
    }
}