import java.util.Scanner;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in, "cp866");
        String answer = "";
        do {
            System.out.print("Введите первое число: ");
            int a = scanner.nextInt();
            System.out.print("\nВведите знак математической операции: ");
            char operation = scanner.next().charAt(0);
            System.out.print("\nВведите второе число: ");
            int b = scanner.nextInt();
            calculator.calculate(a, b, operation);
            scanner.nextLine();
            do {
                System.out.print("\nХотите продолжить вычисления? [yes/no]: ");
                answer = scanner.nextLine();
            } while (!answer.equals("no") && !answer.equals("yes"));
        } while (!answer.equals("no"));
    }
}