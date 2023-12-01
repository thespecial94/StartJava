package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private static final int START_RANGE = 1;
    private static final int END_RANGE = 100;
    private static final int ROUNDS = 3;
    private int counterAttempts;
    private Player[] players = new Player[Player.CAPACITY];
    private Scanner scanner = new Scanner(System.in);

    public void setPlayer(Player player, int index) {
        players[index] = player;
    }

    public void play() {
        castLots();
        int hiddenNumber = START_RANGE + (int) (Math.random() * END_RANGE);
        int counter = 1;
        boolean guessed;
        do {
            for (Player player : players) {
                guessed = isGuessed(player, hiddenNumber);
                if (guessed) {
                    counter = 3;
                    break;
                }
            }
            counter++;
        } while (counter <= Player.CAPACITY);
        for (Player player : players) {
            output(player);
        }
    }

    private void castLots() {
        int endRange = 2;
        int counterRounds = 1;
        int counterPosition = 0;
        Player tmp = new Player();
        do {
            for (int i = Player.CAPACITY - 1; i > 0; i--) {
                int position = (int) (Math.random() * endRange);
                for (Player player : players) {
                    if (player == players[position]) {
                        tmp = player;
                    }
                    if (endRange == i && counterPosition == i) {
                        players[position] = players[endRange];
                        players[i] = tmp;
                    }
                    counterPosition++;
                }
                counterPosition = 0;
                endRange--;
            }
            counterRounds++;
            endRange = 2;
        } while (counterRounds <= ROUNDS);
    }

    private boolean isGuessed(Player player, int hiddenNumber) {
        int number = inputNumber(player);
        if (number == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал "  + number +
                    " с "  + player.getAttempts() +  " попытки");
            return true;
        }
        if (player.getAttempts() == Player.CAPACITY) {
            System.out.println("У " + player.getName() + " закончились попытки");
            counterAttempts++;
            if (counterAttempts == Player.CAPACITY) {
                return true;
            }
        }
        String lessMore = number < hiddenNumber ? " меньше " : " больше ";
        System.out.println("Число " + number + lessMore + "того, что загадал компьютер");
        return false;
    }

    private int inputNumber(Player player) {
        int number = 0;
        String display = "no";
        do {
            if (display.equals("yes")) {
                System.out.println("Введенное число " + number + " выходит за пределы полуинтервала (0, 100]");
            }
            System.out.print(player.getName() + " вводит число: ");
            number = scanner.nextInt();
            display = "yes";
        } while (!(number >= START_RANGE && number <= END_RANGE));
        return player.setNumber(number);
    }

    private void output(Player player) {
        outputNumbers(player);
        player.clear();
    }

    private void outputNumbers(Player player) {
        System.out.print("Все названные числа игроком " + player.getName() + " = " );
        for (int a : player.getNumber()) {
            System.out.print(a + " ");
        }
        System.out.println();
    }
}