package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String mathExpression) {
        String[] elements = mathExpression.split(" ");
        checkElementsExpression(elements);
        double a = Integer.parseInt(elements[0]);
        double b = Integer.parseInt(elements[2]);
        char operation = elements[1].charAt(0);
        return switch (operation) {
            case '^' -> Math.pow(a,b);
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '%' -> a % b;
            case '/' -> a / b;
            default -> throw new IllegalArgumentException("Ошибка: знак " +
                    elements[1] + " не поддерживается");
        };
    }

    private static void checkElementsExpression(String[] elements) {
        int len = 3;
        if (elements.length != len) {
            throw new IllegalArgumentException("Ошибка: Длина вводимого мат. выражения неверная, " +
                    "допустимая длина выражения = " + len);
        }
        try {
            for (int i = 0; i <  len; i++) {
                if (i != 1) {
                    Integer.parseInt(elements[i]);
                    if (Integer.parseInt(elements[i]) <= 0) {
                        throw new IllegalArgumentException("Ошибка: вводимые числа должны быть положительными!");
                    }
                }
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Ошибка: вводимые числа должны быть целыми!");
        }
    }
}