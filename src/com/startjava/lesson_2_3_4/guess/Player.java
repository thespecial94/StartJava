package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    public static final int CAPACITY = 3;
    private String name;
    private int[] numbers = new int[CAPACITY];
    private int attempts;

    public Player() {}

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public int[] getNumber() {
        return Arrays.copyOf(numbers, attempts);
    }

    public int setNumber(int number) {
        numbers[attempts++] = number;
        return number;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }
}