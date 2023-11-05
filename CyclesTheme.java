public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int counter = -10;
        int counterFirstValue = counter;
        int sumEvenNums = 0;
        int sumOddEvenNums = 0;
        do {
            if (counter % 2 == 0) {
                sumEvenNums += counter;
            } else {
                sumOddEvenNums += counter;
            } 
            counter++;
        } while (counter < 22);
        System.out.println("В отрезке [" + counterFirstValue + "," + (counter - 1) +
                "] сумма четных чисел = " + sumEvenNums + ", а нечетных = " + sumOddEvenNums);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int a = 5;
        int b = 10;
        int maxNum = -1;
        int minNum = -1;
        if (a > maxNum) {
            maxNum = a;
        }
        if (b > maxNum) {
            maxNum = b;
        }
        if (a < minNum) {
            minNum = a;
        }
        if (b < minNum) {
            minNum = b;
        }
        for (int i = maxNum - 1; i > minNum; i--) {
            System.out.print(i);
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
        int countOddEvenNum = 0;
        int count = 24;
        for (int i = 1; i <= count; i++) {
            if (i % 2 != 0) {
                System.out.printf("%3d", i);
                countOddEvenNum++;
            }
            if (countOddEvenNum == 5){
                countOddEvenNum = 0;
                System.out.println();
            } else if (i == count) {
                countOddEvenNum %= 10;
                if (countOddEvenNum == 1) {
                    countOddEvenNum = 4;
                } else if (countOddEvenNum == 4) {
                    countOddEvenNum = 1;
                } else if (countOddEvenNum == 3) {
                    countOddEvenNum = 2;
                } else if (countOddEvenNum == 2) {
                    countOddEvenNum = 3;
                } else {
                    countOddEvenNum = 0;
                }
                if (countOddEvenNum != 0) {
                    do {
                        System.out.printf("%3d", 0);
                        countOddEvenNum--;
                    } while (countOddEvenNum > 0);
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
        int countGrid = 5;
        counter = 4;
        System.out.println();
        while (countGrid > 0) {
            System.out.print("#");
            countGrid--;
            if (countGrid == 0) {
                countGrid += counter;
                counter--;
                System.out.println();
            }
        }
        int countDollar = 1;
        counter = 1;
        do {
            if (counter == 3) {
                countDollar++;
                if (countDollar == 4) {
                    counter = 0;
                } else {
                    counter = 1;
                }
            }
            if (counter == 1) {
                System.out.print("\n$");
            } else {
                if (countDollar == 1 | countDollar == 5) {
                    System.out.print("");
                } else {
                    System.out.print("$");
                }
            }
            counter++;
        } while (countDollar < 5);

        System.out.println("\n\n7. Отображение ASCII-символов");
        char symbol1 = 'z';
        System.out.println("DECIMAL CHARACTER DESCRIPTION");
        for (int i = 0; i <= symbol1; i++) {
            if ((i > 14 & i % 2 != 0 & (char) i < '1') | 
                (((char) i >= 'a') && ((char) i <= 'z') & i % 2 == 0)) {
                if (i < 100) {
                    System.out.println("  " + i + "        " 
                        + (char) i + "     " + Character.getName(i));
                } else {
                    System.out.println(" " + i + "        " 
                        + (char) i + "     " + Character.getName(i));
                }
                
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int srcNum4 = 1234321;
        int lengthNum = String.valueOf(srcNum4).length();
        int tmp2 = 0;
        int tmp3 = 0;
        int tmpOnes2 = 0;
        int tmpTens2 = 0;
        int tmpHundreds2 = 0;
        int tmpOnes3 = 0;
        int tmpTens3 = 0;
        int tmpHundreds3 = 0; 
        int defaultNum = 10;
        int degreeHundredsNum = defaultNum * defaultNum;
        int degreeNum = degreeHundredsNum * degreeHundredsNum;
        int n = 1;
        for (int i = srcNum4; n <= lengthNum / 2; n++) {
            if (n == 1) {
                tmp2 = i / degreeNum;
                tmp3 = i % degreeNum;
                tmpOnes2 = tmp2 % defaultNum;
                tmpOnes3 = tmp3 % defaultNum;
            } else if (n == 2) {
                tmpTens2 = (tmp3 / defaultNum) % defaultNum;
                tmpTens3 = (tmp3 / defaultNum) % defaultNum;
            } else {
                tmpHundreds2 = tmp2 / degreeHundredsNum;
                tmpHundreds3 = tmp3 / degreeHundredsNum % defaultNum;
            }
        }
        if (tmpOnes3 == tmpHundreds2 & tmpTens3 == tmpTens2 & tmpOnes2 == tmpHundreds3) {
            System.out.println("Число " + srcNum4 + " является палиндромом");
        } else {
            System.out.println("Число " + srcNum4 + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int srcNum5 = 143413;
        int tmp4 = 0;
        int tmp5 = 0;
        int tmpOnes4 = 0;
        int tmpTens4 = 0;
        int tmpHundreds4 = 0;
        int tmpOnes5 = 0;
        int tmpTens5 = 0;
        int tmpHundreds5 = 0;
        defaultNum = 10;
        degreeHundredsNum = defaultNum * defaultNum;
        degreeNum = degreeHundredsNum * defaultNum;
        lengthNum = String.valueOf(srcNum5).length();
        n = 1;
        for (int i = srcNum5; n <= lengthNum / 2; n++) {
            if (n == 1) {
                tmp4 = i / degreeNum;
                tmp5 = i % degreeNum;
                tmpOnes4 = tmp4 % defaultNum;
                tmpOnes5 = tmp5 % defaultNum;
            } else if (n == 2) {
                tmpTens4 = (tmp4 / defaultNum) % defaultNum;
                tmpTens5 = (tmp5 / defaultNum) % defaultNum;
            } else {
                tmpHundreds4 = tmp4 / degreeHundredsNum;
                tmpHundreds5 = tmp5 / degreeHundredsNum;
            }
        }
        int sumTmp4 = tmpOnes4 + tmpTens4 + tmpHundreds4;
        int sumTmp5 = tmpOnes5 + tmpTens5 + tmpHundreds5;
        if (sumTmp4 == sumTmp5) {
            System.out.println("Число " + srcNum5 + " является счастливым");
        } else {
            System.out.println("Число " + srcNum5 + " не является счастливым");
        }
        System.out.println("Сумма цифр " + tmp4 + " = " + sumTmp4 + 
                ", а сумма " + tmp5 + " = " + sumTmp5);

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