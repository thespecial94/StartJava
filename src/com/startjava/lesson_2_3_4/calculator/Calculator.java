package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String mathExpression) {
        String[] elementsExpression = mathExpression.split(" ");
        checkElementsExpression(elementsExpression);
        double a = Integer.parseInt(elementsExpression[0]);
        double b = Integer.parseInt(elementsExpression[2]);
        char operation = elementsExpression[1].charAt(0);
        return switch (operation) {
            case '^' -> Math.pow(a,b);
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '%' -> a % b;
            case '/' -> a / b;
            default -> throw new IllegalArgumentException("Ошибка: знак " +
                    elementsExpression[1] + " не поддерживается");
        };
    }

    private static void checkElementsExpression(String[] elementsExpression) {
        if (elementsExpression.length != 3){
            throw new IllegalArgumentException("Длина вводимого мат. выражения неверная!");
        } else if (Integer.parseInt(elementsExpression[0]) <= 0 || Integer.parseInt(elementsExpression[2]) <= 0) {
            throw new IllegalArgumentException("Вводимые числа неположительные!");
        }
        try {
            Integer.parseInt(elementsExpression[0]);
            Integer.parseInt(elementsExpression[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Числа не являются целыми!");
        }
    }
}