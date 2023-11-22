package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String mathExpression) {
        String[] elementsExpression = mathExpression.split(" ");
        double a = Integer.parseInt(elementsExpression[0]);
        double b = Integer.parseInt(elementsExpression[2]);
        char operation = elementsExpression[1].charAt(0);
        switch (operation) {
            case '^' :
                return Math.pow(a,b);
            case '+' :
                return a + b;
            case '-' :
                return a - b;
            case '*' :
                return a * b;
            case '%' :
                return a % b;
            case '/' :
                return a / b;
            default:
                return Double.MIN_VALUE;
        }
    }
}