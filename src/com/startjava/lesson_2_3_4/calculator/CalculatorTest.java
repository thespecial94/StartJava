package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in, "cp866");
        String answer = "";
        double result = 0;
        do {
            System.out.print("Введите математическое выражение: ");
            String[] mathExpression = scanner.nextLine().split(" ");;
            result = calculator.calculate(mathExpression);
            if (result == Double.MIN_VALUE) {
                System.out.println("Ошибка: знак " + mathExpression[1] + " не поддерживается");
            } else {
                System.out.print(mathExpression[0] + " " + mathExpression[1] + " " + mathExpression[2] + " = ");
                if (result == 0) {
                    System.out.print((int) result);
                } else {
                    System.out.printf("%.3f",result);
                }
            }
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        } while (!answer.equals("no"));
    }
}