package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;
import java.text.DecimalFormat;

import static com.startjava.lesson_2_3_4.calculator.Calculator.calculate;

public class CalculatorTest {
    static void output(String mathExpression, double result) {
        DecimalFormat decimalFormat = new DecimalFormat("#.###");
        System.out.print(mathExpression + " = " + (result %1 == 0 ? (int) result : decimalFormat.format(result)));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in, "cp866");
        String answer = "yes";
        do {
            if (answer.equals("yes")) {
                try {
                System.out.print("Введите математическое выражение: ");
                    String mathExpression = scanner.nextLine();
                    double result = calculate(mathExpression);
                    output(mathExpression, result);
                } catch (RuntimeException e) {
                    System.out.println(e.getMessage());
                }
            }
            System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
            answer = scanner.nextLine();
        } while (!answer.equals("no"));
    }
}