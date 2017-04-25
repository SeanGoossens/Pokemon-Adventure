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


    public Random rand = new Random();
    public List<Pokemon> pokemonZone1;
    public List<Pokemon> pokemonZone2;

    WildPokemon(){
        pokemonZone1 = new ArrayList();
        pokemonZone2 = new ArrayList();

        Pokemon rattata = new Pokemon("Rattata",randomHealth(15,20),randomAttack(2,5),randomSpeed(3,6), true);
        pokemonZone1.add(rattata);
        Pokemon pidgey = new Pokemon("Pidgey",randomHealth(12,17),randomAttack(3,4),randomSpeed(2,5), true);
        pokemonZone1.add(pidgey);
        Pokemon caterpie = new Pokemon("Caterpie",randomHealth(20,23),randomAttack(3,4),randomSpeed(3,7), true);
        pokemonZone2.add(caterpie);
        Pokemon weedle = new Pokemon("Weedle",randomHealth(18,22),randomAttack(3,6),randomSpeed(3,6), true);
        pokemonZone2.add(weedle);
        Pokemon metapod = new Pokemon("Metapod",randomHealth(24,27),randomAttack(3,5),randomSpeed(3,7), true);
        pokemonZone2.add(metapod);

}

    Pokemon getRandomPokemonZone1() {
        int n = rand.nextInt(pokemonZone1.size());
        return pokemonZone1.get(n);
    }

    Pokemon getRandomPokemonZone2() {
        int n = rand.nextInt(pokemonZone2.size());
        return pokemonZone2.get(n);
    }



}
