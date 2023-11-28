package com.startjava.lesson_2_3_4.guess;

import java.util.Scanner;

public class GuessNumberTest {

    public static void main(String[] args) {
        final int attempts = 3;
        System.out.println("Игра началась! У каждого игрока по " + attempts + " попытки.");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        String name1 = scanner.nextLine();
        System.out.print("Введите имя второго игрока: ");
        String name2 = scanner.nextLine();
        System.out.print("Введите имя третьего игрока: ");
        String name3 = scanner.nextLine();
        GuessNumber game = new GuessNumber(name1, name2, name3);
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