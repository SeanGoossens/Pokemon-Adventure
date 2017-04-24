package com.example.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class WildPokemon {



    private int randomHealthZone1(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    private int randomAttackZone1(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    private int randomSpeedZone1(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    private int randomHealthZone2(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    private int randomAttackZone2(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }
    private int randomSpeedZone2(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    private Random rand = new Random();
    private List<Pokemon> pokemonZone1;
    private List<Pokemon> pokemonZone2;

    WildPokemon(){
        pokemonZone1 = new ArrayList();
        pokemonZone2 = new ArrayList();

        Pokemon rattata = new Pokemon("Rattata",randomHealthZone1(15,20),randomAttackZone1(2,5),randomSpeedZone1(3,6), true);
        pokemonZone1.add(rattata);
        Pokemon pidgey = new Pokemon("Pidgey",randomHealthZone1(10,17),randomAttackZone1(3,4),randomSpeedZone1(2,5), true);
        pokemonZone1.add(pidgey);

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
