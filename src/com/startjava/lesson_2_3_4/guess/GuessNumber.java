package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;
    private static final int ROUNDS = 3;
    public static final int CAPACITY = 3;
    private final Player[] players = new Player[CAPACITY];
    private final Scanner scanner = new Scanner(System.in);
    private int countWinners;

    public GuessNumber(Player[] players) {
        System.arraycopy(players, 0, this.players, 0, CAPACITY);
    }

    public void play() {
        castLots();
        System.out.println("Игра началась! У каждого игрока по " + Player.ATTEMPTS + " попыток.");
        for (int i = 1; i <= ROUNDS; i++) {
            int hiddenNumber = START_RANGE + (int) (Math.random() * END_RANGE);
            for (int j = 0; j < Player.ATTEMPTS; j++) {
                boolean guessed = false;
                for (Player player : players) {
                    guessed = isGuessed(player, hiddenNumber);
                    if (guessed) {
                        player.setCountWinner();
                        break;
                    }
                }
                if (guessed) {
                    break;
                }
            }
            output();
            clear();
        }
        printWinner();
        clearRounds();
    }

    private void castLots() {
        Random random = new Random();
        for (int i = players.length - 1; i > 0; i--) {
            int index = random.nextInt(i + 1);
            Player tmp = players[index];
            players[index] = players[i];
            players[i] = tmp;
        }
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

    private int inputNumber(Player player) {
        boolean isValidNumber;
        int number;
        do {
            System.out.print(player.getName() + " вводит число: ");
            number = scanner.nextInt();
            isValidNumber = player.setNumber(number);
            if (!isValidNumber) {
                System.out.println("Введенное число " + number + " выходит за пределы полуинтервала (0, 100]");
            }
        } while (!isValidNumber);
        return number;
    }

    private void hasAttempt(Player player) {
        if (player.getAttempts() >= Player.ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки");
        }
    }

    private void output() {
        for (Player player : players) {
            System.out.print("Все названные числа игроком " + player.getName() + " = " );
            for (int n : player.getNumbers()) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    private void clear() {
        for (Player player : players) {
            player.clear();
        }
    }

    private void printWinner() {
        String nameWinners = defineWinner();

        if (countWinners == 0) {
            System.out.println("По результатам " + ROUNDS + " раундов никто не отгадал число");
        } else if (countWinners >= 1) {
            if (countWinners == 1) {
                System.out.println("Игрок " + nameWinners + " выиграл(а) по результатам " + ROUNDS + " раундов!!!");
            } else {
                System.out.println("По результатам " + ROUNDS +
                        " раундов ничья между следующими игроками: " + nameWinners);
            }
        }
        countWinners = 0;
    }

    private String defineWinner() {
        String nameWinners = "";
        int maxGuesses = players[0].getCountWinner();
        if (maxGuesses != 0) {
            nameWinners = players[0].getName() + " ";
            countWinners++;
        }
        for (int i = 1; i < CAPACITY; i++) {
            if (players[i].getCountWinner() > maxGuesses) {
                maxGuesses = players[i].getCountWinner();
                nameWinners = players[i].getName();
                countWinners = 1;
            } else if (maxGuesses == players[i].getCountWinner() && maxGuesses != 0) {
                nameWinners += players[i].getName() + " ";
                countWinners++;
            }
        }
        return nameWinners;
    }

    private void clearRounds() {
        for (Player player : players) {
            player.clearRounds();
        }
    }
}