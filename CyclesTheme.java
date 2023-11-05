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
        int a = -1;
        int b = 5;
        int c = 10;
        int max = 0;
        int min = 0;
        if (a > b) {
            max = a;
        } else {
            max = b;
        }
        if (c > max) {
            max = c;
        }
        if (a < b) {
            min = a;
        } else {
            min = b;
        }
        if (c < min) {
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
            if (countNumsPerLine == 5){
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
        int triangle = 5;
        int counterTriangle = 4;
        System.out.println();
        while (triangle > 0) {
            System.out.print("#");
            triangle--;
            if (triangle == 0) {
                triangle += counterTriangle;
                counterTriangle--;
                System.out.println();
            }
        }

        counterTriangle = 1;
        triangle = 1;
        do {
            if (counterTriangle == 3) {
                triangle++;
                if (triangle == 4) {
                    counterTriangle = 0;
                } else {
                    counterTriangle = 1;
                }
            }
            if (counterTriangle == 1) {
                System.out.print("\n$");
            } else {
                if (triangle == 1 || triangle == 5) {
                    System.out.print("");
                } else {
                    System.out.print("$");
                }
            }
            counterTriangle++;
        } while (triangle < 5);

        System.out.println("\n\n7. Отображение ASCII-символов");
        System.out.printf("%1s%12s%15s", "DECIMAL", "CHARACTER", "DESCRIPTION");
        System.out.println();
        for (int i = 0; i <= 'z'; i++) {
        boolean genuine = (i > 14 & i % 2 != 0 && i < '1') || 
                ((i >= 'a') && (i <= 'z') && i % 2 == 0);
            if (genuine) {
                System.out.printf("%4s%11s%13s%-1s", i, (char) i, "",Character.getName(i));
                System.out.println();
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int reversedNum = 1234321;
        int compareReversedNum = reversedNum;
        int reversedTmpNum = 0;
        while (reversedNum > 0) {
            reversedTmpNum = (reversedTmpNum * 10) + (reversedNum % 10);
            reversedNum /= 10;
        }
        if (reversedTmpNum == compareReversedNum) {
            System.out.println("Число " + compareReversedNum + " является палиндромом");
        } else {
            System.out.println("Число " + compareReversedNum + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int srcNum5 = 143413;
        int tmp4 = srcNum5 / 1000;
        int tmp5 = srcNum5 % 1000;
        int tmpNum4 = tmp4;
        int tmpNum5 = tmp5;
        int sumTmp4 = 0;
        int sumTmp5 = 0;
        int lengthNum = String.valueOf(srcNum5).length();
        for (int i = 0; i < lengthNum / 2; i++) {
            sumTmp4 += tmp4 % 10;
            sumTmp5 += tmp5 % 10;
            tmp4 /= 10;
            tmp5 /= 10;
        }
        if (sumTmp4 == sumTmp5) {
            System.out.println("Число " + srcNum5 + " является счастливым");
        } else {
            System.out.println("Число " + srcNum5 + " не является счастливым");
        }
        System.out.println("Сумма цифр " + tmpNum4 + " = " + sumTmp4 + 
                ", а сумма " + tmpNum5 + " = " + sumTmp5);

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