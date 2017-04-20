package com.example.java;

import javax.swing.*;

import static javax.swing.JOptionPane.*;

/**
 * Created by sgoossens on 4/18/2017.
 */
public class Pokemon {
    public String name;
    public int health;
    public int strength;
    public int speed;

    /*
     * Constructs the pokemon
     *
     * Asserts that the stats must abide by the following guidelines
     */
    public Pokemon(String name, int health, int strength, int speed) {
        assert health >= 1;
        assert health <= 300;
        assert strength >= 1;
        assert strength <= 300;
        assert speed >= 1;
        assert speed <= 300;

        this.name = name;
        this.health = health;
        this.strength = strength;
        this.speed = speed;
    }

    // Need to change this so the battle ends right as the Pokemon hits 0 HP, not after the loop.
    // Appears to have been fixed

    public static void battle(Pokemon pokemon1, Pokemon pokemon2) {
        showMessageDialog(null, pokemon2.name + "'s stats are: \n Health: "
                + pokemon2.health + "\n Strength: " + pokemon2.strength + "\n Speed: " + pokemon2.speed);
        showMessageDialog(null, pokemon1.name + " begins the fight against " + pokemon2.name);
        do {

            if (pokemon1.health > 0 && pokemon2.health > 0) {
                showMessageDialog(null, pokemon1.name + " attacks " + pokemon2.name);
                pokemon2.health = pokemon2.health - pokemon1.strength;
                showMessageDialog(null, pokemon1.name + " does " + pokemon1.strength + " damage to " +
                        pokemon2.name + " and " + pokemon2.name + " has " + pokemon2.health + " left.");
            }

            if (pokemon1.health > 0 && pokemon2.health > 0) {
                showMessageDialog(null, pokemon2.name + " attacks " + pokemon1.name);
                pokemon1.health = pokemon1.health - pokemon2.strength;
                showMessageDialog(null, pokemon2.name + " does " + pokemon2.strength + " damage to " +
                        pokemon1.name + " and " + pokemon1.name + " has " + pokemon1.health + " left.");
            }


        } while (pokemon1.health > 0 && pokemon2.health > 0);
        if (pokemon1.health < 1) showMessageDialog(null, pokemon1.name + " has been reduced to 0 health. "
                + pokemon1.name + " has lost the fight.");
        else showMessageDialog(null, pokemon2.name + " has been reduced to 0 health. "
                + pokemon2.name + " has lost the fight.");

    }
}