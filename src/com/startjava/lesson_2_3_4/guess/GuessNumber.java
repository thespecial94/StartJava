package com.startjava.lesson_2_3_4.guess;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static final int START_RANGE = 1;
    public static final int END_RANGE = 100;
    private static final int ROUNDS = 3;
    private final Player[] players = new Player[Player.CAPACITY];
    private final Scanner scanner = new Scanner(System.in);

    public GuessNumber(Player[] players) {
        System.arraycopy(players, 0, this.players, 0, Player.CAPACITY);
    }

    public void play() {
        castLots();
        System.out.println("Игра началась! У каждого игрока по " + Player.ATTEMPTS + " попыток.");
        boolean guessed = false;
        for (int i = 1; i <= ROUNDS; i++) {
            int hiddenNumber = START_RANGE + (int) (Math.random() * END_RANGE);
            for (int j = 0; j < Player.ATTEMPTS; j++) {
                for (Player player : players) {
                    guessed = isGuessed(player, hiddenNumber);
                    if (guessed) {
                        player.setCountWinnerRounds();
                        break;
                    }
                }
                if (guessed) {
                    break;
                }
            }
            output();
            printWinner(i);

            clear();
        }
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
        int number= inputNumber(player);

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
            for (int n : player.getNumber()) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }

    private void printWinner(int counterRounds) {
        if (counterRounds == ROUNDS) {
            String[] namesGuesses = searchWinners();
            int countWinners = getCountWinners(namesGuesses);

            if (countWinners == 0) {
                System.out.println("По результатам " + ROUNDS + " раундов никто не отгадал число");
            } else if (countWinners >= 1) {
                String strNames = getWinnerNames(namesGuesses);

                if (countWinners == 1) {
                    System.out.println("Игрок " + strNames + " выиграл(а) по результатам " + ROUNDS + " раундов!!!");
                } else {
                    System.out.println("По результатам " + ROUNDS + " раундов ничья между следующими игроками: " +
                            strNames);
                }
            }
        }
    }

    private String[] searchWinners() {
        int maxGuesses = players[0].getCountWinnerRounds();
        String[] namesGuesses = new String[Player.CAPACITY];
        if (maxGuesses != 0) {
            namesGuesses[0] = players[0].getName();
        }
        for (int i = 1; i < Player.CAPACITY; i++) {
            if (players[i].getCountWinnerRounds() > maxGuesses) {
                namesGuesses[i - 1] = null;
                maxGuesses = players[i].getCountWinnerRounds();
                namesGuesses[i] = players[i].getName();
            } else if (players[i].getCountWinnerRounds() == maxGuesses && maxGuesses != 0) {
                namesGuesses[i] = players[i].getName();
            }
        }
        return namesGuesses;
    }

    private int getCountWinners(String[] names) {
        int count = 0;
        for (String name : names) {
            if (name != null) {
                count++;
            }
        }
        return count;
    }

    private String getWinnerNames(String[] names) {
        String strNames = "";
        for (String name : names) {
            if (name != null) {
                strNames += name + " ";
            }
        }
        return strNames;
    }

    private void clear() {
        for (Player player : players) {
            player.clear();
        }
    }
}