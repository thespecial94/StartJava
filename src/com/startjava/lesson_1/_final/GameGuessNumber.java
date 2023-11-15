package com.startjava.lesson_1._final;

public class GameGuessNumber {
    public static void main(String[] args) {
        int hiddenNum = 100;
        for (int i = 1; i < 101;) {
            if (i == hiddenNum) {
                System.out.println("Вы победили!");
                return;
            } 
            if (i < hiddenNum) {
                System.out.println("Число " + i + " меньше того, что загадал компьютер");
                if (hiddenNum - i < 6) {
                    i++;
                } else {
                    i += 5;
                }
            } else {
                System.out.println("Число " + i + " больше того, что загадал компьютер");
                i--;
            }
        }
    }
}