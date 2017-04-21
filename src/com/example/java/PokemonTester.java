package com.example.java;

public class PokemonTester{

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

    public static void main(String[] args){
        Starter.selectStarter();
        Starter.getNewStarter(Starter.newStarter);

        String newStarter = Starter.newStarter;
        int starterHealth = Starter.starterHealth;
        int starterAttack = Starter.starterAttack;
        int starterSpeed = Starter.starterSpeed;

        Pokemon rattata = new Pokemon("Rattata",randomHealth(15,20),randomAttack(2,4),randomSpeed(2,6));
        Pokemon pidgey = new Pokemon("Pidgey",randomHealth(10,17),randomAttack(3,4),randomSpeed(3,5));
        Pokemon starter = new Pokemon(newStarter, starterHealth, starterAttack, starterSpeed);
        Pokemon.battle(starter, rattata);
    }
}