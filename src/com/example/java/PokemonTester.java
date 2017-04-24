package com.example.java;

import static com.example.java.Pokemon.battle;

import static com.example.java.Starter.*;



public class PokemonTester {

    public static WildPokemon wildPokemon;


    public static void main(String[] args) {
        Starter.selectStarter();
        Starter.getNewStarter(newStarter);
        Starter starter = new Starter(newStarter, maxStarterHealth, starterAttack, starterSpeed);



        WildPokemon wildPokemon = new WildPokemon();
        battle(starter, wildPokemon.getRandomPokemon());


}}