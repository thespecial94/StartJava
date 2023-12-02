package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumber {

    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;
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
        System.out.println("Игра началась! У каждого игрока по " + Player.CAPACITY + " попытки.");
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

        clear();
    }

    private void castLots() {
        int endRange = 2;
        int position = (int) (Math.random() * endRange);
        do {
            do {
                for (int i = 0; i < Player.CAPACITY; i++) {
                    if (players[i] == players[position]) {
                        Player tmp = players[i];
                        players[i] = players[endRange];
                        players[endRange] = tmp;
                        endRange--;
                        position = (int) (Math.random() * endRange);
                    }
                }
            } while (endRange != 0);
            endRange = 2;
            System.out.println("В " + counterRounds + " раунде выйграл(а) " + players[0].getName());
            counterRounds++;
        } while (counterRounds <= ROUNDS);
    }

    private boolean isGuessed(Player player, int hiddenNumber) {
        int number;
        boolean valid;
        do {
            number = inputNumber(player);
            valid = number < START_RANGE || number > END_RANGE;
            if (valid) {
                System.out.println("Введенное число " + number + " выходит за пределы полуинтервала (0, 100]");
            }
        } while (valid);
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

    private int inputNumber(Player player) {
        int number;
        System.out.print(player.getName() + " вводит число: ");
        number = scanner.nextInt();
        return player.setNumber(number);
    }

    private void hasAttempt(Player player) {
        if (player.getAttempts() == Player.CAPACITY) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
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

    private void clear() {
        for (Player player : players) {
            player.clear();
        }
    }
}