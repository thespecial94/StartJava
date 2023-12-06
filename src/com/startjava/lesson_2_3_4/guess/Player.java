package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    public static final int CAPACITY = 3;
    public static final int ATTEMPTS = 10;
    private final String name;
    private int attempts;
    private final int[] numbers = new int[ATTEMPTS];
    private int countWinnerRounds;

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

    public boolean setNumber(int number) {
        if (number >= GuessNumber.START_RANGE && number <= GuessNumber.END_RANGE) {
            numbers[attempts++] = number;
            return true;
        }
        return false;
    }

    public void clear() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }

    public int getCountWinner(){
        return countWinnerRounds;
    }

    public void setCountWinnerRounds() {
        countWinnerRounds++;
    }

    public void clearRounds() {
        countWinnerRounds = 0;
    }
}