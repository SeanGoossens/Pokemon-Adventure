package com.example.java;

import javax.swing.*;

/**
 * Created by sgoossens on 4/18/2017.
 */
public class PokemonTester{
    Pokemon pidgey;
    Pokemon ratatta;

    public static void main(String[] args){
        Starter.selectStarter();
        Starter.getNewStarter(Starter.newStarter);

        String newStarter = Starter.newStarter;
        int starterHealth = Starter.starterHealth;
        int starterStrength = Starter.starterStrength;
        int starterSpeed = Starter.starterSpeed;

        Pokemon ratatta = new Pokemon("Ratatta",15,2,3);
        Pokemon pidgey = new Pokemon("Pidgey",15,3,2);
        Pokemon starter = new Pokemon(newStarter, starterHealth, starterStrength, starterSpeed);
        Pokemon.battle(starter, ratatta);
    }
}