package com.example.java;

public class PokemonTester{

    public static void main(String[] args){
        Starter.selectStarter();
        Starter.getNewStarter(Starter.newStarter);

        String newStarter = Starter.newStarter;
        int starterHealth = Starter.starterHealth;
        int starterAttack = Starter.starterAttack;
        int starterSpeed = Starter.starterSpeed;

        Pokemon rattata = new Pokemon("Rattata",15,2,50);
        Pokemon pidgey = new Pokemon("Pidgey",15,3,2);
        Pokemon starter = new Pokemon(newStarter, starterHealth, starterAttack, starterSpeed);
        Pokemon.battle(starter, rattata);
    }
}