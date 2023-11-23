package com.startjava.lesson_2_3_4.guess;

import java.util.Arrays;

public class Player {

    private String name;
    private int[] numbers = new int[10];
    private int attempts = 0;
    private int rangeArray = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAttempts() {
        return attempts;
    }

    public String getNumbers() {
        String strNumbers = "";
        for (int a : Arrays.copyOf(numbers, rangeArray)) {
            strNumbers += a + " ";
        }
        return strNumbers;
    }

    public void setNumbers(int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = number;
                rangeArray = i + 1;
                break;
            }
        }
        attempts++;
    }

    public void fillNumbers() {
        Arrays.fill(numbers, 0, attempts, 0);
        attempts = 0;
    }
}