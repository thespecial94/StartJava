package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in, "cp866");
        String answer = "yes";
        double result = 0;
        do {
            if (answer.equals("yes")) {
                System.out.print("Введите математическое выражение: ");
                result = calculator.calculate(scanner.nextLine());
                calculator.outputResultCalculate(result);
            }
            answer = "";
            if (!answer.equals("no") && !answer.equals("yes")) {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            }
        } while (!answer.equals("no"));
    }
}