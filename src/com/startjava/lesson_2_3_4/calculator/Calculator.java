package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public static double calculate(String mathExpression) {
        String[] elementsExpression = mathExpression.split(" ");
        if (Double.parseDouble(elementsExpression[0]) %1 != 0 || Double.parseDouble(elementsExpression[2]) %1 != 0) {
            throw new IllegalArgumentException("Вводимые числа нецелые!");
        } else if (elementsExpression[0].length() > 9 || elementsExpression[2].length() > 9){
            throw new IllegalArgumentException("Длина вводимых чисел превышает допустимого диапазона!");
        }
        double a = Integer.parseInt(elementsExpression[0]);
        double b = Integer.parseInt(elementsExpression[2]);
        char operation = elementsExpression[1].charAt(0);
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Вводимые числа неположительные!");
        }
        double result = 0;
        result = switch (operation) {
            case '^' -> Math.pow(a,b);
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            case '%' -> a % b;
            case '/' -> a / b;
            default -> throw new IllegalArgumentException("Ошибка: знак " +
                    elementsExpression[1] + " не поддерживается");
        };
        return result;
    }
}