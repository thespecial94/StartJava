package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    private static final int START_RANGE = 1;
    private static final int END_RANGE = 100;
    private static final int ROUNDS = 3;
    private int counterRounds = 1;
    private final Player[] players = new Player[Player.CAPACITY];
    private final Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player[] tmpPlayers) {
        System.arraycopy(tmpPlayers, 0, players, 0, Player.CAPACITY);
    }

    public void play() {
        castLots();
        int hiddenNumber = START_RANGE + (int) (Math.random() * END_RANGE);
        boolean guessed = false;
        counterRounds = 1;
        do {
            for (Player player : players) {
                guessed = isGuessed(player, hiddenNumber);
                if (guessed) {
                    break;
                }
            }
            counterRounds++;
        } while (!guessed && counterRounds <= ROUNDS);
        output();

        for (Player player : players) {
            player.clear();
        }
    }

    private void castLots() {
        int endRange = 2;
        System.out.println("Игра началась! У каждого игрока по " + Player.CAPACITY + " попытки.");
        do {
            int position = (int) (Math.random() * endRange);
            for (Player player : players) {
                if (player == players[position]) {
                    players[position] = players[endRange];
                    players[endRange] = player;
                    break;
                }
            }
            endRange--;
            counterRounds++;
        } while (counterRounds <= ROUNDS);
    }

    private boolean isGuessed(Player player, int hiddenNumber) {
        int number = inputNumber(player);
        if (number == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал "  + number +
                    " с "  + player.getAttempts() +  " попытки");
            return true;
        }
        hasAttempt(player);
        String lessMore = number < hiddenNumber ? " меньше " : " больше ";
        System.out.println("Число " + number + lessMore + "того, что загадал компьютер");
        return false;
    }

    void hasAttempt(Player player) {
        if (player.getAttempts() == Player.CAPACITY) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private int inputNumber(Player player) {
        int number;
        boolean display;
        do {
            System.out.print(player.getName() + " вводит число: ");
            number = scanner.nextInt();
            display = number < START_RANGE || number > END_RANGE;
            if (display) {
                System.out.println("Введенное число " + number + " выходит за пределы полуинтервала (0, 100]");
            }
        } while (display);
        return player.setNumber(number);
    }

    private void output() {
        for (Player player : players) {
            outputNumbers(player);
        }
    }

    private void outputNumbers(Player player) {
        System.out.print("Все названные числа игроком " + player.getName() + " = " );
        for (int n : player.getNumber()) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}