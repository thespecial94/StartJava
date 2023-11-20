package com.startjava.lesson_2_3_4.calculator;

public class Calculator {
    private String[] mathExpression;

    public double calculate(String strMathExpression) {
        mathExpression = strMathExpression.split(" ");
        double a = Integer.parseInt(mathExpression[0]);
        double b = Integer.parseInt(mathExpression[2]);
        double result = 0;
        char operation = mathExpression[1].charAt(0);
        switch (operation) {
            case '^' :
                return result = (int) Math.pow(a,b);
            case '+' :
                return result = a + b;
            case '-' :
                return result = a - b;
            case '*' :
                return result = a * b;
            case '%' :
                return result = a % b;
            case '/' :
                return result = a / b;
            default:
                return Double.MIN_VALUE;
        }
    }

    public void outputResultCalculate(double result) {
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
    }
}