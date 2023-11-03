public class Calculator {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 3;
        int result = 0;
        char symbolCalculation = '^';
        if (symbolCalculation == '+') {
            result = num1 + num2;
        } else if (symbolCalculation == '-') {
            result = num1 - num2;
        } else if (symbolCalculation == '*') {
            result = num1 * num2;
        } else if (symbolCalculation == '%') {
            result = num1 % num2;
        } else if (symbolCalculation == '/') {
            result = num1 / num2;
        } else if (symbolCalculation == '^') {
            result = num1;
            for(int i = num2; i > 1; i--) {
                result *= num1;
            }
        }
        System.out.println(num1 + " " + symbolCalculation + " " + num2 + " = " + result);
    }
}