package com.example.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class WildPokemon {

    private static int randomHealth(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    private static int randomAttack(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    private static int randomSpeed(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    private Random rand = new Random();
    private List<Pokemon> pokemonList;

    public WildPokemon(){
        pokemonList = new ArrayList();
        Pokemon rattata = new Pokemon("Rattata",randomHealth(15,20),randomAttack(2,5),randomSpeed(3,6), true);
        pokemonList.add(rattata);
        Pokemon pidgey = new Pokemon("Pidgey",randomHealth(10,17),randomAttack(3,4),randomSpeed(2,5), true);
        pokemonList.add(pidgey);
}

    Pokemon getRandomPokemon() {
        int n = rand.nextInt(pokemonList.size());
        return pokemonList.get(n);
    }

    static void resetStats() {
        Pokemon.health = randomHealth(15,20);
        Pokemon.attack = randomAttack(2,5);
        Pokemon.speed = randomSpeed(3,6);
        Pokemon.status = true;
    }
}
