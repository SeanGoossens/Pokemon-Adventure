package com.example.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class WildPokemon {


    private Starter starter;

    public int randomHealth(int min, int max) {
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


    private Random rand = new Random();
    private List<Pokemon> pokemonPalletTown;
    private List<Pokemon> pokemonVeridianForest;
    private List<Pokemon> pokemonMtMoon;

    WildPokemon(){
        pokemonPalletTown = new ArrayList();
        pokemonVeridianForest = new ArrayList();
        pokemonMtMoon = new ArrayList();

        //Pallet Town
        Pokemon rattata = new Pokemon("Rattata",randomHealth(15,20),randomAttack(2,5),randomSpeed(3,6), true);
        pokemonPalletTown.add(rattata);
        Pokemon pidgey = new Pokemon("Pidgey",randomHealth(12,17),randomAttack(3,4),randomSpeed(2,5), true);
        pokemonPalletTown.add(pidgey);

        //Veridian Forest
        Pokemon caterpie = new Pokemon("Caterpie",randomHealth(20,23),randomAttack(3,4),randomSpeed(3,7), true);
        pokemonVeridianForest.add(caterpie);
        Pokemon weedle = new Pokemon("Weedle",randomHealth(18,22),randomAttack(3,6),randomSpeed(3,6), true);
        pokemonVeridianForest.add(weedle);
        Pokemon metapod = new Pokemon("Metapod",randomHealth(24,27),randomAttack(3,5),randomSpeed(3,7), true);
        pokemonVeridianForest.add(metapod);

        //Mt Moon
        Pokemon geodude = new Pokemon("Geodude",randomHealth(25,28),randomAttack(6,9),randomSpeed(4,7), true);
        pokemonMtMoon.add(geodude);
        Pokemon zubat = new Pokemon("Zubat",randomHealth(23,28),randomAttack(5,10),randomSpeed(5,12), true);
        pokemonMtMoon.add(zubat);
        Pokemon clefairy = new Pokemon("Clefairy",randomHealth(28,32),randomAttack(4,7),randomSpeed(4,8), true);
        pokemonMtMoon.add(clefairy);

}

    Pokemon getRandomPokemonPalletTown() {
        int n = rand.nextInt(pokemonPalletTown.size());
        return pokemonPalletTown.get(n);
    }

    Pokemon getRandomPokemonVeridianForest() {
        int n = rand.nextInt(pokemonVeridianForest.size());
        return pokemonVeridianForest.get(n);
    }

    Pokemon getRandomPokemonMtMoon() {
        int n = rand.nextInt(pokemonMtMoon.size());
        return pokemonMtMoon.get(n);
    }

}
