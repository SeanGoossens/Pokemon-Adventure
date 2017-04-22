package com.example.java;

import javax.swing.*;
import java.util.Random;
import static com.example.java.Starter.*;
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


    static void battle(Pokemon pokemon1, Pokemon pokemon2) {
        //Show stats of both Pokemon before the battle
        JOptionPane.showMessageDialog(null, "Your " + newStarter + "'s stats are: \n Health: "
                + starterHealth + "\n Strength: " + starterAttack + "\n Speed: " + starterSpeed);

        showMessageDialog(null, pokemon2.name + "'s stats are: \n Health: "
                + pokemon2.health + "\n Attack: " + pokemon2.attack + "\n Speed: " + pokemon2.speed);

        if (pokemon1.speed > pokemon2.speed) {
            showMessageDialog(null, pokemon1.name + " begins the fight against " + pokemon2.name);
        } else if (pokemon2.speed > pokemon1.speed) {
            showMessageDialog(null, pokemon2.name + " begins the fight against " + pokemon1.name);
        }

        do {
            //When your starter moves first
            if (pokemon1.speed > pokemon2.speed) {

                Object selection = null;
                if (pokemon1.health > 0 && pokemon2.health > 0) {

                    Object[] selectionValues = {"Attack", "Special Attack", "Run"};
                    String initialSelection = "Attack";
                    selection = JOptionPane.showInputDialog(null, "What will you do?",
                            "Pokemon Adventure", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

                }
                if (selection == "Attack") {
                    showMessageDialog(null, pokemon1.name + " attacks " + pokemon2.name);
                    // Does a random amount of damage from 0 to the Pokemon's attack value
                    pokemon1.randomDamage = randomDamage(0, pokemon1.attack);
                    pokemon2.health = pokemon2.health - pokemon1.randomDamage;
                    showMessageDialog(null, pokemon1.name + " does " + pokemon1.randomDamage + " damage to " +
                            pokemon2.name + " and " + pokemon2.name + " has " + pokemon2.health + " left.");
                } else if (selection == "Run") {
                    showMessageDialog(null, pokemon1.name + " ran away from " + pokemon2.name);
                    System.exit(0);
                }
                if (pokemon1.health > 0 && pokemon2.health > 0) {
                    showMessageDialog(null, pokemon2.name + " attacks " + pokemon1.name);
                    // Does a random amount of damage from 0 to the Pokemon's attack value
                    pokemon2.randomDamage = randomDamage(0, pokemon2.attack);
                    pokemon1.health = pokemon1.health - pokemon2.randomDamage;
                    showMessageDialog(null, pokemon2.name + " does " + pokemon2.randomDamage + " damage to " +
                            pokemon1.name + " and " + pokemon1.name + " has " + pokemon1.health + " left.");
                }

                //When Pokemon 2 moves first
            } else if (pokemon2.speed > pokemon1.speed) {
                if (pokemon1.health > 0 && pokemon2.health > 0) {

                    Object[] selectionValues = {"Attack", "Special Attack", "Run"};
                    String initialSelection = "Attack";
                    Object selection = JOptionPane.showInputDialog(null, "What will you do?",
                            "Pokemon Adventure", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

                    if (selection == "Attack") {

                        showMessageDialog(null, pokemon2.name + " attacks " + pokemon1.name);
                        // Does a random amount of damage from 0 to the Pokemon's attack value
                        pokemon2.randomDamage = randomDamage(0, pokemon2.attack);
                        pokemon1.health = pokemon1.health - pokemon2.randomDamage;
                        showMessageDialog(null, pokemon2.name + " does " + pokemon2.randomDamage + " damage to " +
                                pokemon1.name + " and " + pokemon1.name + " has " + pokemon1.health + " left.");

                        if (pokemon1.health > 0 && pokemon2.health > 0) {
                            showMessageDialog(null, pokemon1.name + " attacks " + pokemon2.name);
                            // Does a random amount of damage from 0 to the Pokemon's attack value
                            pokemon1.randomDamage = randomDamage(0, pokemon1.attack);
                            pokemon2.health = pokemon2.health - pokemon1.randomDamage;
                            showMessageDialog(null, pokemon1.name + " does " + pokemon1.randomDamage + " damage to " +
                                    pokemon2.name + " and " + pokemon2.name + " has " + pokemon2.health + " left.");
                        }
                    } else if (selection == "Run") {
                        showMessageDialog(null, pokemon1.name + " ran away from " + pokemon2.name);
                        System.exit(0);
                    }
                }

                //Initializes the randomizer when the Pokemon's speeds are the same value
            } else if (pokemon1.speed == pokemon2.speed) {
                int randomSpeed = getRandomSpeed();
                if (randomSpeed == 1) {
                    Object selection = null;

                    if (pokemon1.health > 0 && pokemon2.health > 0) {

                        Object[] selectionValues = {"Attack", "Special Attack", "Run"};
                        String initialSelection = "Attack";
                        selection = JOptionPane.showInputDialog(null, "What will you do?",
                                "Pokemon Adventure", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

                    }
                    if (selection == "Attack") {
                        showMessageDialog(null, pokemon1.name + " attacks " + pokemon2.name);
                        // Does a random amount of damage from 0 to the Pokemon's attack value
                        pokemon1.randomDamage = randomDamage(0, pokemon1.attack);
                        pokemon2.health = pokemon2.health - pokemon1.randomDamage;
                        showMessageDialog(null, pokemon1.name + " does " + pokemon1.randomDamage + " damage to " +
                                pokemon2.name + " and " + pokemon2.name + " has " + pokemon2.health + " left.");
                    } else if (selection == "Run") {
                        showMessageDialog(null, pokemon1.name + " ran away from " + pokemon2.name);
                        System.exit(0);
                    }
                    if (pokemon1.health > 0 && pokemon2.health > 0) {
                        showMessageDialog(null, pokemon2.name + " attacks " + pokemon1.name);
                        // Does a random amount of damage from 0 to the Pokemon's attack value
                        pokemon2.randomDamage = randomDamage(0, pokemon2.attack);
                        pokemon1.health = pokemon1.health - pokemon2.randomDamage;
                        showMessageDialog(null, pokemon2.name + " does " + pokemon2.randomDamage + " damage to " +
                                pokemon1.name + " and " + pokemon1.name + " has " + pokemon1.health + " left.");

                    }
                } else if (randomSpeed == 2) {
                    if (pokemon1.health > 0 && pokemon2.health > 0) {

                        Object[] selectionValues = {"Attack", "Special Attack", "Run"};
                        String initialSelection = "Attack";
                        Object selection = JOptionPane.showInputDialog(null, "What will you do?",
                                "Pokemon Adventure", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

                        if (selection == "Attack") {

                            showMessageDialog(null, pokemon2.name + " attacks " + pokemon1.name);
                            // Does a random amount of damage from 0 to the Pokemon's attack value
                            pokemon2.randomDamage = randomDamage(0, pokemon2.attack);
                            pokemon1.health = pokemon1.health - pokemon2.randomDamage;
                            showMessageDialog(null, pokemon2.name + " does " + pokemon2.randomDamage + " damage to " +
                                    pokemon1.name + " and " + pokemon1.name + " has " + pokemon1.health + " left.");

                            if (pokemon1.health > 0 && pokemon2.health > 0) {
                                showMessageDialog(null, pokemon1.name + " attacks " + pokemon2.name);
                                // Does a random amount of damage from 0 to the Pokemon's attack value
                                pokemon1.randomDamage = randomDamage(0, pokemon1.attack);
                                pokemon2.health = pokemon2.health - pokemon1.randomDamage;
                                showMessageDialog(null, pokemon1.name + " does " + pokemon1.randomDamage + " damage to " +
                                        pokemon2.name + " and " + pokemon2.name + " has " + pokemon2.health + " left.");
                            }
                        } else if (selection == "Run") {
                            showMessageDialog(null, pokemon1.name + " ran away from " + pokemon2.name);
                            System.exit(0);
                        }
                    }

                }
            }


        } while (pokemon1.health > 0 && pokemon2.health > 0);
        if (pokemon1.health < 1) showMessageDialog(null, pokemon1.name + " has been reduced to 0 health. "
                + pokemon1.name + " has lost the fight.");

        else showMessageDialog(null, pokemon2.name + " has been reduced to 0 health. "
                + pokemon2.name + " has lost the fight.");

    }

    //Takes the Pokemon's damage and gives it a range from 0 to their max attack
    private static int randomDamage(int min, int max) {
        int range = (max - min) + 1;
        return (int) (Math.random() * range) + min;
    }


    //Speed randomizer when the starter speed is the same as the wild Pokemon's speed
    private static int getRandomSpeed() {
        Random r = new Random();
        int i = r.nextInt(2);

        switch (i) {
            case 0:
                return 1;
            case 1:
                return 2;
            default:
                break;
        }
        return i;
    }
}
