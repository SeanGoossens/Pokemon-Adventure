package com.example.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class WildPokemon {

    private int randomHealth(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    private int randomAttack(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    private int randomSpeed(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    // http://www.codejava.net/java-core/collections/java-list-collection-tutorial-and-examples
    // Study how to do lists and why this code works

    private Random rand = new Random();
    private List<Pokemon> pokemonList;

    public WildPokemon(){
        pokemonList = new ArrayList();
        Pokemon rattata = new Pokemon("Rattata",randomHealth(15,20),randomAttack(2,5),randomSpeed(3,6));
        pokemonList.add(rattata);
        Pokemon pidgey = new Pokemon("Pidgey",randomHealth(10,17),randomAttack(3,4),randomSpeed(2,5));
        pokemonList.add(pidgey);
    }

    Pokemon getRandomPokemon() {
        int n = rand.nextInt(pokemonList.size());
        return pokemonList.get(n);
    }
}
