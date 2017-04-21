package com.example.java;

import static javax.swing.JOptionPane.*;

// Not sure whether to make these private or public

public class Pokemon {
    private String name;
    private int health;
    private int attack;
    private int speed;
    private int randomDamage;

    /*
     * Constructs the pokemon
     *
     * Asserts that the stats must abide by the following guidelines
     */
    public Pokemon(String name, int health, int attack, int speed) {
        assert health >= 1;
        assert health <= 300;
        assert attack >= 1;
        assert attack <= 300;
        assert speed >= 1;
        assert speed <= 300;

        this.name = name;
        this.health = health;
        this.attack = attack;
        this.speed = speed;
    }



    public static void battle(Pokemon pokemon1, Pokemon pokemon2) {
        showMessageDialog(null, pokemon2.name + "'s stats are: \n Health: "
                + pokemon2.health + "\n Attack: " + pokemon2.attack + "\n Speed: " + pokemon2.speed);
        showMessageDialog(null, pokemon1.name + " begins the fight against " + pokemon2.name);
        do {

            if (pokemon1.health > 0 && pokemon2.health > 0) {
                showMessageDialog(null, pokemon1.name + " attacks " + pokemon2.name);
                pokemon1.randomDamage = randomDamage(0,pokemon1.attack);
                pokemon2.health = pokemon2.health - pokemon1.randomDamage;
                showMessageDialog(null, pokemon1.name + " does " + pokemon1.randomDamage + " damage to " +
                        pokemon2.name + " and " + pokemon2.name + " has " + pokemon2.health + " left.");
            }

            if (pokemon1.health > 0 && pokemon2.health > 0) {
                showMessageDialog(null, pokemon2.name + " attacks " + pokemon1.name);
                pokemon2.randomDamage = randomDamage(0,pokemon2.attack);
                pokemon1.health = pokemon1.health - pokemon2.randomDamage;
                showMessageDialog(null, pokemon2.name + " does " + pokemon2.randomDamage + " damage to " +
                        pokemon1.name + " and " + pokemon1.name + " has " + pokemon1.health + " left.");
            }


        } while (pokemon1.health > 0 && pokemon2.health > 0);
        if (pokemon1.health < 1) showMessageDialog(null, pokemon1.name + " has been reduced to 0 health. "
                + pokemon1.name + " has lost the fight.");
        else showMessageDialog(null, pokemon2.name + " has been reduced to 0 health. "
                + pokemon2.name + " has lost the fight.");

    }

    /* The ultimate goal here is to take the attack stat and convert it to a random integer
     * to give or take a few points to add some variety to the damage done
     */


    // Adding this to the text gives a random amount of damage. However I need to store it in a variable
    public static int randomDamage(int min, int max) {
        int range = (max - min) + 1;
        int randomDamage =  (int)(Math.random() * range) + min;
        return randomDamage;
    }
}