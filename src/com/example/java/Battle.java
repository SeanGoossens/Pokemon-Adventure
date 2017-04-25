package com.example.java;

import javax.swing.*;

import java.util.Random;

import static javax.swing.JOptionPane.showMessageDialog;

/**
 * Created by Sean on 4/24/2017.
 */
public class Battle {

    public int health;
    public int speed;
    public int attack;
    public boolean status;
    private static int randomDamage;
    private static int getExp;
    private static int totalExp;
    public int starterHealth = Starter.maxStarterHealth;


    Battle(Starter starter, Pokemon wildPokemon) {
        do {
            //Show stats of both Pokemon before the battle
            JOptionPane.showMessageDialog(null, "Your " + Starter.newStarter + "'s (Lvl. " + Starter.starterLevel + ") stats are: \n Health: "
                    + Starter.maxStarterHealth + "\n Strength: " + Starter.starterAttack + "\n Speed: " + Starter.starterSpeed);

            showMessageDialog(null, wildPokemon.name + "'s stats are: \n Health: "
                    + wildPokemon.health + "\n Attack: " + wildPokemon.attack + "\n Speed: " + wildPokemon.speed);
            exp(health, attack, speed);

            if (Starter.starterSpeed > speed) {
                showMessageDialog(null, Starter.newStarter + " begins the fight against " + wildPokemon.name);
            } else if (speed > Starter.starterSpeed) {
                showMessageDialog(null, wildPokemon.name + " begins the fight against " + Starter.newStarter);
            }

            do {
                //When your starter moves first
                if (Starter.starterSpeed > speed) {

                    Object selection = null;
                    if (starterHealth > 0 && health > 0) {

                        Object[] selectionValues = {"Attack", "Special Attack", "Run"};
                        String initialSelection = "Attack";
                        selection = JOptionPane.showInputDialog(null, "What will you do?",
                                "Pokemon Adventure", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

                    }
                    if (selection == "Attack") {
                        showMessageDialog(null, Starter.newStarter + " attacks " + wildPokemon.name);
                        // Does a random amount of damage from 0 to the Pokemon's attack value
                        randomDamage = randomDamage(0, Starter.starterAttack);
                        health = health - randomDamage;
                        showMessageDialog(null, Starter.newStarter + " does " + randomDamage + " damage to " +
                                wildPokemon.name + " and " + wildPokemon.name + " has " + health + " left.");
                    } else if (selection == "Run") {
                        showMessageDialog(null, Starter.newStarter + " ran away from " + wildPokemon.name);
                        System.exit(0);
                    }
                    if (starterHealth > 0 && health > 0) {
                        showMessageDialog(null, wildPokemon.name + " attacks " + Starter.newStarter);
                        // Does a random amount of damage from 0 to the Pokemon's attack value
                        randomDamage = randomDamage(0, attack);
                        starterHealth = starterHealth - randomDamage;
                        showMessageDialog(null, wildPokemon.name + " does " + randomDamage + " damage to " +
                                Starter.newStarter + " and " + Starter.newStarter + " has " + starterHealth + " left.");
                    }

                    //When Pokemon 2 moves first
                } else if (speed > Starter.starterSpeed) {
                    if (starterHealth > 0 && health > 0) {

                        Object[] selectionValues = {"Attack", "Special Attack", "Run"};
                        String initialSelection = "Attack";
                        Object selection = JOptionPane.showInputDialog(null, "What will you do?",
                                "Pokemon Adventure", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

                        if (selection == "Attack") {

                            showMessageDialog(null, wildPokemon.name + " attacks " + Starter.newStarter);
                            // Does a random amount of damage from 0 to the Pokemon's attack value
                            randomDamage = randomDamage(0, attack);
                            starterHealth = starterHealth - randomDamage;
                            showMessageDialog(null, wildPokemon.name + " does " + randomDamage + " damage to " +
                                    Starter.newStarter + " and " + Starter.newStarter + " has " + starterHealth + " left.");

                            if (starterHealth > 0 && health > 0) {
                                showMessageDialog(null, Starter.newStarter + " attacks " + wildPokemon.name);
                                // Does a random amount of damage from 0 to the Pokemon's attack value
                                randomDamage = randomDamage(0, Starter.starterAttack);
                                health = health - randomDamage;
                                showMessageDialog(null, Starter.newStarter + " does " + randomDamage + " damage to " +
                                        wildPokemon.name + " and " + wildPokemon.name + " has " + health + " left.");
                            }
                        } else if (selection == "Run") {
                            showMessageDialog(null, Starter.newStarter + " ran away from " + wildPokemon.name);
                            System.exit(0);
                        }
                    }

                    //Initializes the randomizer when the Pokemon's speeds are the same value
                } else if (Starter.starterSpeed == speed) {
                    int randomSpeed = getRandomSpeed();
                    if (randomSpeed == 1) {
                        Object selection = null;

                        if (starterHealth > 0 && health > 0) {

                            Object[] selectionValues = {"Attack", "Special Attack", "Run"};
                            String initialSelection = "Attack";
                            selection = JOptionPane.showInputDialog(null, "What will you do?",
                                    "Pokemon Adventure", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

                        }
                        if (selection == "Attack") {
                            showMessageDialog(null, Starter.newStarter + " attacks " + wildPokemon.name);
                            // Does a random amount of damage from 0 to the Pokemon's attack value
                            randomDamage = randomDamage(0, Starter.starterAttack);
                            health = health - randomDamage;
                            showMessageDialog(null, Starter.newStarter + " does " + randomDamage + " damage to " +
                                    wildPokemon.name + " and " + wildPokemon.name + " has " + health + " left.");
                        } else if (selection == "Run") {
                            showMessageDialog(null, Starter.newStarter + " ran away from " + wildPokemon.name);
                            System.exit(0);
                        }
                        if (starterHealth > 0 && health > 0) {
                            showMessageDialog(null, wildPokemon.name + " attacks " + Starter.newStarter);
                            // Does a random amount of damage from 0 to the Pokemon's attack value
                            randomDamage = randomDamage(0, attack);
                            starterHealth = starterHealth - randomDamage;
                            showMessageDialog(null, wildPokemon.name + " does " + randomDamage + " damage to " +
                                    Starter.newStarter + " and " + Starter.newStarter + " has " + starterHealth + " left.");

                        }
                    } else if (randomSpeed == 2) {
                        if (starterHealth > 0 && health > 0) {

                            Object[] selectionValues = {"Attack", "Special Attack", "Run"};
                            String initialSelection = "Attack";
                            Object selection = JOptionPane.showInputDialog(null, "What will you do?",
                                    "Pokemon Adventure", JOptionPane.QUESTION_MESSAGE, null, selectionValues, initialSelection);

                            if (selection == "Attack") {

                                showMessageDialog(null, wildPokemon.name + " attacks " + Starter.newStarter);
                                // Does a random amount of damage from 0 to the Pokemon's attack value
                                randomDamage = randomDamage(0, attack);
                                starterHealth = starterHealth - randomDamage;
                                showMessageDialog(null, wildPokemon.name + " does " + randomDamage + " damage to " +
                                        Starter.newStarter + " and " + Starter.newStarter + " has " + starterHealth + " left.");

                                if (starterHealth > 0 && health > 0) {
                                    showMessageDialog(null, Starter.newStarter + " attacks " + wildPokemon.name);
                                    // Does a random amount of damage from 0 to the Pokemon's attack value
                                    randomDamage = randomDamage(0, Starter.starterAttack);
                                    health = health - randomDamage;
                                    showMessageDialog(null, Starter.newStarter + " does " + randomDamage + " damage to " +
                                            wildPokemon.name + " and " + wildPokemon.name + " has " + health + " left.");
                                }
                            } else if (selection == "Run") {
                                showMessageDialog(null, Starter.newStarter + " ran away from " + wildPokemon.name);
                                System.exit(0);
                            }
                        }

                    }
                }


            } while (starterHealth > 0 && health > 0);
            if (starterHealth < 1)
                showMessageDialog(null, Starter.newStarter + " has been reduced to 0 health. "
                        + Starter.newStarter + " has lost the fight.");

            else showMessageDialog(null, wildPokemon.name + " has been reduced to 0 health. "
                    + wildPokemon.name + " has lost the fight.");
            status = false;
            showMessageDialog(null, Starter.newStarter + " has gained "
                    + getExp + " experience.");
            showMessageDialog(null, Starter.newStarter + " now has "
                    + totalExp + " total experience.");
            expCheck();
            //WildPokemon.resetStatsZone1();
            Starter.resetStarterHealth();
            battleAgain();
        } while (true == status);
    }



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
