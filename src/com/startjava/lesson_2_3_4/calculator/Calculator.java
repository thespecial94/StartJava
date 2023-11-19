package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

    public double calculate(String[] mathExpression) {
        double a = Integer.parseInt(mathExpression[0]);
        double b = Integer.parseInt(mathExpression[2]);
        double result = 0;
        char operation = mathExpression[1].charAt(0);
        switch (operation) {
            case '^' :
                result = (int) Math.pow(a,b);
                break;
            case '+' :
                result = a + b;
                break;
            case '-' :
                result = a - b;
                break;
            case '*' :
                result = a * b;
                break;
            case '%' :
                result = a % b;
                break;
            case '/' :
                result = a / b;
                break;
            default:
                return Double.MIN_VALUE;
        }
        return result;
    }
}