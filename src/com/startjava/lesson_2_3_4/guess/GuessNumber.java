package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void play() {
        int hiddenNumber = 1 + (int) (Math.random() * 100);
        boolean guessed = false;
        do {
            guessed = isGuessed(player1, inputNumber(player1), hiddenNumber);
            if (!guessed) {
                guessed = isGuessed(player2, inputNumber(player2), hiddenNumber);
            }
        } while (!guessed);
        output(player1);
        output(player2);
    }

    private int inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(player.getName() + " вводит число: ");
        return player.setNumber(scanner.nextInt());
    }

    private boolean isGuessed(Player player, int number, int hiddenNumber) {
        if (player1.getAttempts() == player1.getLen() && player2.getAttempts() == player2.getLen()) {
            return true;
        }
        if (number == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал "  + number +
                        " с "  + player.getAttempts() +  " попытки");
            return true;
        }
        if (number < hiddenNumber) {
            System.out.println("Число " + number + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + number + " больше того, что загадал компьютер");
        }
        return false;
    }

    private void output(Player player) {
        outputAttempts(player);
        outputNumbers(player);
        player.clear();
    }

    private void outputAttempts(Player player) {
        if (player.getAttempts() == player.getLen()) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private void outputNumbers(Player player) {
        System.out.print("Все названные числа игроком " + player.getName() + " = " );
        for (int i = 0; i < player.getAttempts(); i++) {
            System.out.print(player.getNumber(i) + " ");
        }
        System.out.println();
    }
}