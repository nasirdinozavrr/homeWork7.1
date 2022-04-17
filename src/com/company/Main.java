package com.company;

public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {new Magic(), new Medic(), new Warrior()};
    }

    public static void iterationHeroes(Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility();
        }
    }
}


