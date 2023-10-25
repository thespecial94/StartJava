public class GameGuessNumber {
    public static void main(String[] args) {
        boolean quessed = false;
        int hiddenNum = 2;
        for (int i = 1; i < 101 && !quessed;) {
            if (i == hiddenNum) {
                System.out.println("Вы победили!");
                quessed = true;
            } else if (i < hiddenNum) {
                System.out.println("Число " + i + " меньше того, что загадал компьютер");
                if (hiddenNum - i < 6) {
                    i += 1;
                } else {
                    i += 5;
                }
            } else {
                System.out.println("Число " + i + " больше того, что загадал компьютер");
                i -= 1;
            }
        }
    }
}