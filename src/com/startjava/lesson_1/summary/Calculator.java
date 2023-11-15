package com.startjava.lesson_1.summary;

public class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int result = 0;
        char operation = '^';
        if (operation == '+') {
            result = num1 + num2;
        } else if (operation == '-') {
            result = num1 - num2;
        } else if (operation == '*') {
            result = num1 * num2;
        } else if (operation == '%') {
            result = num1 % num2;
        } else if (operation == '/') {
            result = num1 / num2;
        } else if (operation == '^') {
            result = num1;
            for(int i = num2; i > 1; i--) {
                result *= num1;
            }
        }
        System.out.println(num1 + " " + operation + " " + num2 + " = " + result);
    }
}