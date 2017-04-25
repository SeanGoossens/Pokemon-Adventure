package com.example.java;


public class Pokemon {

    public static int starterHealth;
    String name;
    public int health;
    public int attack;
    public int speed;
    public boolean status;



    public Pokemon(String name, int health, int attack, int speed, boolean status) {

        this.name = name;
        this.health = health;
        this.attack = attack;
        this.speed = speed;
        this.status = status;
    }
}

