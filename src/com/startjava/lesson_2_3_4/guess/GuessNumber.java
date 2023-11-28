package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private Player player3;
    private static final int FIRST_RANGE = 1;
    private static final int END_RANGE = 100;
    private Player[] players = new Player[3];
    private Scanner scanner = new Scanner(System.in);

    public GuessNumber(String name1, String name2, String name3) {
        player1 = new Player(name1);
        player2 = new Player(name2);
        player3 = new Player(name3);
    }

    public void play() {
        castLots();
        int hiddenNumber = FIRST_RANGE + (int) (Math.random() * END_RANGE);
        int count = 0;
        int len = players.length;
        boolean guessed = false;
        for (int i = 0; i < len; i++) {
            guessed = isGuessed(players[i], hiddenNumber);
            if (guessed) {
                break;
            }
            if (i + 1 == 3 && len * len > count) {
                i = -1;
            }
            count++;
        }
        for (int i = 0; i < len; i++) {
            output(players[i]);
        }
    }

    private void castLots() {
        int endRange = 3;
        int[] elements = new int[endRange];
        int len = elements.length;
        for (int i = 0; i < len; i++) {
            elements[i] = i + 1;
        }
        int count = 0;
        for (int i = len - 1; i >= 0; i--) {
            int randomNumber = 1 + (int) (Math.random() * endRange);
            for (int j = 0; j < len - count; j++) {
                if (elements[j] == randomNumber) {
                    int tmpNumber = elements[i];
                    elements[i] = elements[j];
                    elements[j] = tmpNumber;
                    break;
                }
            }
            endRange--;
            count++;
        }
        for (int i = 0; i < len; i++) {
            players[i] = switch (elements[i]) {
                case 1 -> player1;
                case 2 -> player2;
                case 3 -> player3;
                default -> throw new IllegalArgumentException("Ошибка: игрок в указанном диапазоне не найден!");
            };
        }
    }

    private int inputNumber(Player player) {
        int number;
        do {
            System.out.print(player.getName() + " вводит число: ");
            number = scanner.nextInt();
            if (number < FIRST_RANGE || number > END_RANGE) {
                System.out.println("Введенное число выходит за пределы полуинтервала (0, 100]");
            }
        } while (!(number >= FIRST_RANGE && number <= END_RANGE));
        return player.setNumber(number);
    }

    private boolean isGuessed(Player player, int hiddenNumber) {
        int number = inputNumber(player);
        if (player1.getAttempts() == player1.getLen() && player2.getAttempts() == player2.getLen() &&
                player3.getAttempts() == player3.getLen()) {
            return true;
        }
        if (number == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал "  + number +
                        " с "  + player.getAttempts() +  " попытки");
            return true;
        }
        String lessMore = number < hiddenNumber ? " меньше " : " больше ";
        System.out.println("Число " + number + lessMore + "того, что загадал компьютер");
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
        for (int a : player.getNumber()) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}