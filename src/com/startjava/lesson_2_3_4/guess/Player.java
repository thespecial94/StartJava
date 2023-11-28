package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private static final int LEN = 3;
    private int[] numbers = new int[LEN];
    private int attempts;

    public Player(String name) {
        this.name = name;
    }

    public int getLen() {
       return numbers.length;
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