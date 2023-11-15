import java.util.Scanner;

public class GuessNumber {

    private Player player1;
    private Player player2;
    private int number = 0;
    private Scanner scanner = new Scanner(System.in, "cp866");

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() {
        int hiddenNumber = 1 + (int) (Math.random() * 100);
        boolean winner = false;
        do {
            number = inputNumber(player1.getName());
            winner = isGuessed(number, hiddenNumber);
            if (!winner) {
                number = inputNumber(player2.getName());
                winner = isGuessed(number, hiddenNumber);
            }
        } while (!winner);
    }

    private int inputNumber(String name) {
        System.out.print(name + " вводит число: ");
        number = scanner.nextInt();
        if (name == player1.getName()) {
            player1.setNumber(number);
        } else {
            player2.setNumber(number);
        }
        return number;
    }

    private boolean isGuessed(int number, int hiddenNumber) {
        if (number == hiddenNumber) {
            System.out.println("Вы победили!");
            return true;
        }
        if (number < hiddenNumber) {
            System.out.println("Число " + number + " меньше того, что загадал компьютер");
        } else {
            System.out.println("Число " + number + " больше того, что загадал компьютер");
        }
        return false;
    }
}