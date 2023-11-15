public class Calculator {

    public void calculate(int a, int b, char operation) {
        int result;
        switch (operation) {
            case '^' :
                result = a;
                for(int i = b; i > 1; i--) {
                    result *= a;
                }
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
                System.out.println("Мат. операция не поддерживается");
                return;
        }
        System.out.println(a + " " + operation + " " + b + " = " + result);
    }
}