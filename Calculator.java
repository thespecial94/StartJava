public class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;
        int result = 0;
        char symbol = '^';
        if (symbol == '+') {
            result = num1 + num2;
        } else if (symbol == '-') {
            result = num1 - num2;
        } else if (symbol == '*') {
            result = num1 * num2;
        } else if (symbol == '%') {
            result = num1 % num2;
        } else if (symbol == '/') {
            result = num1 / num2;
        } else if (symbol == '^') {
            result = num1;
            int n = num2;
            do {
                result *= num1;
                n--;
            } while (n > 1);
        }
        System.out.println(num1 + " " + symbol + " " + num2 + " = " + result);
    }
}