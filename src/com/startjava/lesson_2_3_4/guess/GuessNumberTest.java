package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        GuessNumber game = new GuessNumber(createPlayers());
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.play();
            }
            System.out.print("\nХотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }

    static Player[] createPlayers() {
        Player[] players = new Player[Player.CAPACITY];
        for (int i = 0; i < Player.CAPACITY; i++) {
            System.out.print("Введите имя " + (i + 1) + " игрока: ");
            Player player = new Player(scanner.nextLine());
            players[i] = player;
        }
        return players;
    }
}