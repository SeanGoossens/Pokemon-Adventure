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
        Pokemon caterpie = new Pokemon("Caterpie",randomHealth(20,23),randomAttack(3,4),randomSpeed(2,5), true);
        pokemonZone2.add(caterpie);

}

    Pokemon getRandomPokemonZone1() {
        int n = rand.nextInt(pokemonZone1.size());
        return pokemonZone1.get(n);
    }

    Pokemon getRandomPokemonZone2() {
        int n = rand.nextInt(pokemonZone2.size());
        return pokemonZone2.get(n);
    }

/*
    public static void resetStatsZone1() {
        Pokemon.health = randomHealthZone1(15,20);
        Pokemon.attack = randomAttackZone1(2,5);
        Pokemon.speed = randomSpeedZone1(3,6);
        Pokemon.status = true;
    }

    public static void resetStatsZone2() {
        Pokemon.health = randomHealthZone2(20,25);
        Pokemon.attack = randomAttackZone2(5,7);
        Pokemon.speed = randomSpeedZone2(5,8);
        Pokemon.status = true;
    }
    */
}
