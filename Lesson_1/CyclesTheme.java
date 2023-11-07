public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int start = -10;
        int counter = start;
        int sumEvenNums = 0;
        int sumOddEvenNums = 0;
        do {
            if (start % 2 == 0) {
                sumEvenNums += start;
            } else {
                sumOddEvenNums += start;
            } 
            start++;
        } while (start < 22);
        System.out.println("В отрезке [" + counter + "," + (start - 1) +
                "] сумма четных чисел = " + sumEvenNums + ", а нечетных = " + sumOddEvenNums);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = 5;
        int b = 10;
        int c = -1;
        int max = a;
        int min = a;
        if (b > max) {
            max = b;
        } 
        if (c > max) {
            max = c;
        }
        if (min > b) {
            min = b;
        } 
        if (min > c) {
            min = c;
        }
        for (int i = max - 1; i > min; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sum = 0;
        System.out.println("Число в обратном порядке");
        while (srcNum > 0) {
            int lastDigit = srcNum % 10;
            sum += lastDigit;
            srcNum /= 10;
            System.out.print(lastDigit);
        }
        System.out.println("\nСумма цифр = " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int countNumsPerLine = 0;
        int finish = 24;
        for (int i = 1; i <= finish; i += 2) {
            System.out.printf("%3d", i);
            countNumsPerLine++;
            if (countNumsPerLine == 5) {
                countNumsPerLine = 0;
                System.out.println();
            } else if (finish - i < 2) {
                countNumsPerLine %= 10;
                countNumsPerLine = 5 - countNumsPerLine;
                if (countNumsPerLine != 5) {
                    do {
                        System.out.printf("%3d", 0);
                        countNumsPerLine--;
                    } while (countNumsPerLine > 0);
                    System.out.println();
                }
            }
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        srcNum = 3242592;
        int copySrcNum = srcNum;
        int countTwos = 0;
        while (copySrcNum > 0) {
            if (copySrcNum % 10 == 2) {
                countTwos++;
            }
            copySrcNum /= 10;
        }

        String state = "";
        if (countTwos % 2 == 0) {
            state += "четное";
        } else if (countTwos % 2 != 0) {
            state += "нечетное";
        }
        System.out.println("В " + srcNum + " (" + state +") количество двоек - " + countTwos);

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 0; i <= 4; i++) {
            System.out.println("**********");
        }

        int rows = 5;
        int columns = 4;
        System.out.println();
        while (rows > 0) {
            System.out.print("#");
            rows--;
            if (rows == 0) {
                rows += columns;
                columns--;
                System.out.println();
            }
        }

        columns = 1;
        rows = 1;
        do {
            if (columns == 3) {
                rows++;
                if (rows == 4) {
                    columns = 0;
                } else {
                    columns = 1;
                }
            }
            if (columns == 1) {
                System.out.print("\n$");
            } else {
                if (rows == 1 || rows == 5) {
                    System.out.print("");
                } else {
                    System.out.print("$");
                }
            }
            columns++;
        } while (rows < 5);

        System.out.println("\n\n7. Отображение ASCII-символов");
        System.out.printf("%1s%12s%15s%n", "DECIMAL", "CHARACTER", "DESCRIPTION");
        for (int i = 0; i <= 'z'; i++) {
            boolean genuine = (i > 14 && i < '0' && i % 2 != 0) || 
                    (i >= 'a' && i <= 'z' && i % 2 == 0);
            if (genuine) {
                System.out.printf("%4s%11c%13s%-1s%n", i, i, "",Character.getName(i));
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        srcNum = 1234321;
        copySrcNum = srcNum;
        int reverseSrcNum = 0;
        while (srcNum > 0) {
            reverseSrcNum = (reverseSrcNum * 10) + (srcNum % 10);
            srcNum /= 10;
        }
        if (reverseSrcNum == copySrcNum) {
            System.out.println("Число " + copySrcNum + " является палиндромом");
        } else {
            System.out.println("Число " + copySrcNum + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        srcNum = 143413;
        int firstHalfNum = srcNum / 1000;
        int secondHalfNum = srcNum % 1000;
        int tmpFirstHalfNum = firstHalfNum;
        int tmpSecondHalfNum = secondHalfNum;
        int sumFirstHalfNum = 0;
        int sumSecondHalfNum = 0;
        int lengthNum = String.valueOf(srcNum).length();
        for (int i = 0; i < lengthNum / 2; i++) {
            sumFirstHalfNum += firstHalfNum % 10;
            sumSecondHalfNum += secondHalfNum % 10;
            firstHalfNum /= 10;
            secondHalfNum /= 10;
        }
        if (sumFirstHalfNum == sumSecondHalfNum) {
            System.out.println("Число " + srcNum + " является счастливым");
        } else {
            System.out.println("Число " + srcNum + " не является счастливым");
        }
        System.out.println("Сумма цифр " + tmpFirstHalfNum + " = " + sumFirstHalfNum + 
                ", а сумма " + tmpSecondHalfNum + " = " + sumSecondHalfNum);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.println("       Таблица   Пифагора");
        System.out.print("   |");
        for (int i = 2; i < 10; i++) {
            if (i == 2) {
                for (int k = 2; k < 10; k++) {
                    System.out.printf("%3d", k);
                }
                System.out.println("\n----------------------------");
            }
            System.out.print(" " + i + " |");
            for (int j = 2; j < 10; j++) {
                System.out.printf("%3d", i * j);
                if (j == 9) {
                    System.out.println();
                }
            }
        }
    }
}