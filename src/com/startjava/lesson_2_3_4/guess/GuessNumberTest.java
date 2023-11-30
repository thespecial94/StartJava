package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        System.out.println("Игра началась! У каждого игрока по " + Player.CAPACITY + " попытки.");
        Scanner scanner = new Scanner(System.in);
        GuessNumber game = new GuessNumber();
        for (int i = 0; i < Player.CAPACITY; i++) {
            String orderQueue = switch (i) {
                case 0 -> "первого";
                case 1 -> "второго";
                default -> "третьего";
            };
            System.out.print("Введите имя " + orderQueue + " игрока: ");
            String name = scanner.nextLine();
            Player player = new Player(name);
            game.setPlayer(player, i);
        }
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                game.play();
            }
            System.out.print("\nХотите продолжить игру? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }
}