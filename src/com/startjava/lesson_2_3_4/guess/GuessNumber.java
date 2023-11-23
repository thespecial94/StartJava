package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int number = 0;

    public GuessNumber(String name1, String name2) {
        player1 = new Player(name1);
        player2 = new Player(name2);
    }

    public void play() {
        int hiddenNumber = 1 + (int) (Math.random() * 100);
        boolean winner = false;
        do {
            number = inputNumber(player1);
            winner = isGuessed(player1, number, hiddenNumber);
            if (!winner) {
                number = inputNumber(player2);
                winner = isGuessed(player2, number, hiddenNumber);
            }
        } while (!winner);
        output(player1);
        output(player2);
    }

    private int inputNumber(Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(player.getName() + " вводит число: ");
        number = scanner.nextInt();
        player.setNumbers(number);
        return number;
    }

    private boolean isGuessed(Player player, int number, int hiddenNumber) {
        if (player1.getAttempts() == 10 && player2.getAttempts() == 10) {
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
        if (player.getAttempts() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
        System.out.print("Все названные числа игроком " + player.getName() + " = " + player.getNumbers());
        System.out.println();
        player.fillNumbers();
    }
}