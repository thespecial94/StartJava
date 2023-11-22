package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
    static void output(String mathExpression, double result) {
        String[] elementsExpression = mathExpression.split(" ");
        String[] fractionalPart = ("" + result).split("\\.");
        if (result == Double.MIN_VALUE) {
            System.out.println("Ошибка: знак " + elementsExpression[1] + " не поддерживается");
        } else {
            System.out.print(elementsExpression[0] + " " + elementsExpression[1] + " " + elementsExpression[2] + " = ");
            if (Integer.parseInt(fractionalPart[1]) > 0) {
                System.out.printf("%.3f",result);
            } else {
                System.out.print((int) result);
            }
        }
    }
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in, "cp866");
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                String mathExpression = scanner.nextLine();
                double result = calculator.calculate(mathExpression);
                output(mathExpression, result);
            }
            System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }
}