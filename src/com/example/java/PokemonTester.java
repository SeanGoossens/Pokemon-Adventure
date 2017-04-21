package com.example.java;

public class PokemonTester{


    public static void main(String[] args){
        Starter.selectStarter();
        Starter.getNewStarter(Starter.newStarter);

        String newStarter = Starter.newStarter;
        int starterHealth = Starter.starterHealth;
        int starterAttack = Starter.starterAttack;
        int starterSpeed = Starter.starterSpeed;

        Pokemon starter = new Pokemon(newStarter, starterHealth, starterAttack, starterSpeed);
        Pokemon.battle(starter, WildPokemon.rattata);
    }

}