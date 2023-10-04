package com.alexcode.javatests.player;

import java.util.Random;

public class Dice {

    int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int roll() {
        return new Random().nextInt(sides) + 1;
    }
}
