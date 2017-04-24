package com.example.java;

import javax.swing.*;
import java.util.Random;


import static javax.swing.JOptionPane.*;

// Not sure whether to make these private or public
public class Pokemon {

    private String name;
    public static int health;
    public static int attack;
    public static int speed;
    public static boolean status;
    private static int randomDamage;
    private static int getExp;
    private static int totalExp;
    public static int starterHealth = Starter.maxStarterHealth;



    /*
     * Constructs the pokemon
     *
     * Asserts that the stats must abide by the following guidelines
     */
    public Pokemon(String name, int health, int attack, int speed, boolean status) {
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
        this.status = status;
    }


    static void battle(Starter starter, Pokemon pokemon2)
    {
        do {
            //Show stats of both Pokemon before the battle
            JOptionPane.showMessageDialog(null, "Your " + Starter.newStarter + "'s (Lvl. " + Starter.starterLevel + ") stats are: \n Health: "
                    + Starter.maxStarterHealth + "\n Strength: " + Starter.starterAttack + "\n Speed: " + Starter.starterSpeed);

            showMessageDialog(null, pokemon2.name + "'s stats are: \n Health: "
                    + pokemon2.health + "\n Attack: " + pokemon2.attack + "\n Speed: " + pokemon2.speed);
            exp(pokemon2.health, pokemon2.attack, pokemon2.speed);

            if (Starter.starterSpeed > pokemon2.speed) {
                showMessageDialog(null, Starter.newStarter + " begins the fight against " + pokemon2.name);
            } else if (pokemon2.speed > Starter.starterSpeed) {
                showMessageDialog(null, pokemon2.name + " begins the fight against " + Starter.newStarter);
            }

            do {
                //When your starter moves first
                if (Starter.starterSpeed > pokemon2.speed) {

                    Object selection = null;
                    if (starterHealth > 0 && pokemon2.health > 0) {

                        Object[] selectionValues = {"Attack", "Special Attack", "Run"};
                        String initialSelection = "Attack";
                        selection = JOptionPane.showInputDialog(null, "What will you do?",
                                "Pokemon Adventure", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

                    }
                    if (selection == "Attack") {
                        showMessageDialog(null, Starter.newStarter + " attacks " + pokemon2.name);
                        // Does a random amount of damage from 0 to the Pokemon's attack value
                        randomDamage = randomDamage(0, Starter.starterAttack);
                        pokemon2.health = pokemon2.health - randomDamage;
                        showMessageDialog(null, Starter.newStarter + " does " + randomDamage + " damage to " +
                                pokemon2.name + " and " + pokemon2.name + " has " + pokemon2.health + " left.");
                    } else if (selection == "Run") {
                        showMessageDialog(null, Starter.newStarter + " ran away from " + pokemon2.name);
                        System.exit(0);
                    }
                    if (starterHealth > 0 && pokemon2.health > 0) {
                        showMessageDialog(null, pokemon2.name + " attacks " + Starter.newStarter);
                        // Does a random amount of damage from 0 to the Pokemon's attack value
                        randomDamage = randomDamage(0, pokemon2.attack);
                        starterHealth = starterHealth - randomDamage;
                        showMessageDialog(null, pokemon2.name + " does " + randomDamage + " damage to " +
                                Starter.newStarter + " and " + Starter.newStarter + " has " + starterHealth + " left.");
                    }

                    //When Pokemon 2 moves first
                } else if (pokemon2.speed > Starter.starterSpeed) {
                    if (starterHealth > 0 && pokemon2.health > 0) {

                        Object[] selectionValues = {"Attack", "Special Attack", "Run"};
                        String initialSelection = "Attack";
                        Object selection = JOptionPane.showInputDialog(null, "What will you do?",
                                "Pokemon Adventure", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

                        if (selection == "Attack") {

                            showMessageDialog(null, pokemon2.name + " attacks " + Starter.newStarter);
                            // Does a random amount of damage from 0 to the Pokemon's attack value
                            randomDamage = randomDamage(0, pokemon2.attack);
                            starterHealth = starterHealth - randomDamage;
                            showMessageDialog(null, pokemon2.name + " does " + randomDamage + " damage to " +
                                    Starter.newStarter + " and " + Starter.newStarter + " has " + starterHealth + " left.");

                            if (starterHealth > 0 && pokemon2.health > 0) {
                                showMessageDialog(null, Starter.newStarter + " attacks " + pokemon2.name);
                                // Does a random amount of damage from 0 to the Pokemon's attack value
                                randomDamage = randomDamage(0, Starter.starterAttack);
                                pokemon2.health = pokemon2.health - randomDamage;
                                showMessageDialog(null, Starter.newStarter + " does " + randomDamage + " damage to " +
                                        pokemon2.name + " and " + pokemon2.name + " has " + pokemon2.health + " left.");
                            }
                        } else if (selection == "Run") {
                            showMessageDialog(null, Starter.newStarter + " ran away from " + pokemon2.name);
                            System.exit(0);
                        }
                    }

                    //Initializes the randomizer when the Pokemon's speeds are the same value
                } else if (Starter.starterSpeed == pokemon2.speed) {
                    int randomSpeed = getRandomSpeed();
                    if (randomSpeed == 1) {
                        Object selection = null;

                        if (starterHealth > 0 && pokemon2.health > 0) {

                            Object[] selectionValues = {"Attack", "Special Attack", "Run"};
                            String initialSelection = "Attack";
                            selection = JOptionPane.showInputDialog(null, "What will you do?",
                                    "Pokemon Adventure", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

                        }
                        if (selection == "Attack") {
                            showMessageDialog(null, Starter.newStarter + " attacks " + pokemon2.name);
                            // Does a random amount of damage from 0 to the Pokemon's attack value
                            randomDamage = randomDamage(0, Starter.starterAttack);
                            pokemon2.health = pokemon2.health - randomDamage;
                            showMessageDialog(null, Starter.newStarter + " does " + randomDamage + " damage to " +
                                    pokemon2.name + " and " + pokemon2.name + " has " + pokemon2.health + " left.");
                        } else if (selection == "Run") {
                            showMessageDialog(null, Starter.newStarter + " ran away from " + pokemon2.name);
                            System.exit(0);
                        }
                        if (starterHealth > 0 && pokemon2.health > 0) {
                            showMessageDialog(null, pokemon2.name + " attacks " + Starter.newStarter);
                            // Does a random amount of damage from 0 to the Pokemon's attack value
                            randomDamage = randomDamage(0, pokemon2.attack);
                            starterHealth = starterHealth - randomDamage;
                            showMessageDialog(null, pokemon2.name + " does " + randomDamage + " damage to " +
                                    Starter.newStarter + " and " + Starter.newStarter + " has " + starterHealth + " left.");

                        }
                    } else if (randomSpeed == 2) {
                        if (starterHealth > 0 && pokemon2.health > 0) {

                            Object[] selectionValues = {"Attack", "Special Attack", "Run"};
                            String initialSelection = "Attack";
                            Object selection = JOptionPane.showInputDialog(null, "What will you do?",
                                    "Pokemon Adventure", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

                            if (selection == "Attack") {

                                showMessageDialog(null, pokemon2.name + " attacks " + Starter.newStarter);
                                // Does a random amount of damage from 0 to the Pokemon's attack value
                                randomDamage = randomDamage(0, pokemon2.attack);
                                starterHealth = starterHealth - randomDamage;
                                showMessageDialog(null, pokemon2.name + " does " + randomDamage + " damage to " +
                                        Starter.newStarter + " and " + Starter.newStarter + " has " + starterHealth + " left.");

                                if (starterHealth > 0 && pokemon2.health > 0) {
                                    showMessageDialog(null, Starter.newStarter + " attacks " + pokemon2.name);
                                    // Does a random amount of damage from 0 to the Pokemon's attack value
                                    randomDamage = randomDamage(0, Starter.starterAttack);
                                    pokemon2.health = pokemon2.health - randomDamage;
                                    showMessageDialog(null, Starter.newStarter + " does " + randomDamage + " damage to " +
                                            pokemon2.name + " and " + pokemon2.name + " has " + pokemon2.health + " left.");
                                }
                            } else if (selection == "Run") {
                                showMessageDialog(null, Starter.newStarter + " ran away from " + pokemon2.name);
                                System.exit(0);
                            }
                        }

                    }
                }


            } while (starterHealth > 0 && pokemon2.health > 0);
            if (starterHealth < 1)
                showMessageDialog(null, Starter.newStarter + " has been reduced to 0 health. "
                        + Starter.newStarter + " has lost the fight.");

            else showMessageDialog(null, pokemon2.name + " has been reduced to 0 health. "
                    + pokemon2.name + " has lost the fight.");
            pokemon2.status = false;
            showMessageDialog(null, Starter.newStarter + " has gained "
                    + getExp + " experience.");
            showMessageDialog(null, Starter.newStarter + " now has "
                    + totalExp + " total experience.");
            expCheck();
            WildPokemon.resetStats();
            Starter.resetStarterHealth();
            battleAgain();
        } while (pokemon2.status == true);



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

    //Experience
    private static void exp(int health, int attack, int speed){
        getExp = health + attack + speed;
        totalExp = getExp + totalExp;
    }

    private static void expCheck(){
        if (totalExp < 20) {
            int xpLeft = 20 - totalExp;
            showMessageDialog(null, Starter.newStarter + " needs " + xpLeft + " experience to reach level 2");

        }
        else if (totalExp >= 20 && totalExp < 60 && Starter.starterLevel == 1) {
            Starter.starterLevel = Starter.starterLevel + 1;
            showMessageDialog(null, Starter.newStarter + " has grown to level " + Starter.starterLevel + "!");
            Starter.maxStarterHealth = Starter.maxStarterHealth + randomHealthIncrease(0,3);
            Starter.starterAttack = Starter.starterAttack + randomAttackIncrease(0,3);
            Starter.starterSpeed = Starter.starterSpeed + randomSpeedIncrease(0,3);
        }
        else if (totalExp >= 60 && totalExp < 180 && Starter.starterLevel == 2) {
            Starter.starterLevel = Starter.starterLevel + 1;
            showMessageDialog(null, Starter.newStarter + " has grown to level " + Starter.starterLevel + "!");
            Starter.maxStarterHealth = Starter.maxStarterHealth + randomHealthIncrease(0,3);
            Starter.starterAttack = Starter.starterAttack + randomAttackIncrease(0,3);
            Starter.starterSpeed = Starter.starterSpeed + randomSpeedIncrease(0,3);
        }
    }

    static void battleAgain(){
        JDialog.setDefaultLookAndFeelDecorated(true);
        int response = JOptionPane.showConfirmDialog(null, "Do you want to battle again?", "Confirm",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.NO_OPTION) {
            showMessageDialog(null,"No button clicked");
            System.exit(0);
        } else if (response == JOptionPane.CLOSED_OPTION) {
            showMessageDialog(null,"Thanks for playing!");
            System.exit(0);
        } else if (response == JOptionPane.YES_OPTION) {
            showMessageDialog(null,"Let's battle again!");
        }
    }


    private static int randomHealthIncrease(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    private static int randomAttackIncrease(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    private static int randomSpeedIncrease(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

}