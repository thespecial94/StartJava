package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;
    private static final int ROUNDS = 3;
    private int counterAttemptsEnded = 0;
    private String nameWinner;
    private final Player[] players = new Player[Player.CAPACITY];
    private final Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player[] players) {
        System.arraycopy(players, 0, this.players, 0, Player.CAPACITY);
    }

    public void play() {
        castLots();
        int hiddenNumber = START_RANGE + (int) (Math.random() * END_RANGE);
        int counterRounds = 1;
        System.out.println("Игра началась! У каждого игрока по " + Player.ATTEMPTS + " попыток.");
        do {
            boolean guessed;
            boolean continued = false;
            do {
                for (Player player : players) {
                    guessed = isGuessed(player, hiddenNumber);
                    continued = guessed || counterAttemptsEnded == ROUNDS;
                    if (continued) {
                        output();
                        break;
                    }
                }
            } while (!(continued));
            checkRounds(counterRounds);

            clear();
            counterAttemptsEnded = 0;
            nameWinner = "";
            hiddenNumber = START_RANGE + (int) (Math.random() * END_RANGE);
            counterRounds++;
        } while (counterRounds <= ROUNDS);
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
        int number;
        number = inputNumber(player);

        if (number == hiddenNumber) {
            System.out.println("Игрок " + player.getName() + " угадал "  + number +
                    " с "  + player.getAttempts() +  " попытки");
            nameWinner = player.getName();
            return true;
        }
        hasAttempt(player);

        String lessMore = number < hiddenNumber ? " меньше " : " больше ";
        System.out.println("Число " + number + lessMore + "того, что загадал компьютер");
        return false;
    }

    private void checkRounds(int counterRounds){
        if (counterRounds == ROUNDS) {
            if (!nameWinner.isEmpty()) {
                System.out.println("Игрок " + nameWinner + " выйграл(а) по результатам " + ROUNDS + " раундов!!!");
            } else {
                System.out.println("По результатам " + ROUNDS + " раундов никто не отгадал число");
            }
        }
    }

    private int inputNumber(Player player) {
        boolean isValidNumber;
        int number;
        do {
            System.out.print(player.getName() + " вводит число: ");
            number = scanner.nextInt();
            isValidNumber = player.setNumber(number);
        } while (!isValidNumber);
        return number;
    }

    private void hasAttempt(Player player) {
        if (player.getAttempts() >= Player.ATTEMPTS) {
            System.out.println("У " + player.getName() + " закончились попытки");
            counterAttemptsEnded++;
        }
    }

    private void output() {
        for (Player player : players) {
            System.out.print("Все названные числа игроком " + player.getName() + " = " );
            for (int n : player.getNumber()) {
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
}