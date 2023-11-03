public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        int numSection = -10;
        int sumEvenNum = 0;
        int sumOddEvenNums = 0;
        do {
            if (numSection % 2 == 0) {
                sumEvenNum += numSection;
            } else if (numSection % 2 != 0) {
                sumOddEvenNums += numSection;
            } 
            numSection++;
        } while (numSection < 22);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + sumEvenNum 
            + ", а нечетных = " + sumOddEvenNums);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int srcNum3 = -1;
        int srcNum2 = 10;
        int maxNum = 5;
        int minNum = 5;
        if (maxNum < srcNum3 & srcNum3 > srcNum2) {
            maxNum = srcNum3;
        } else if (maxNum < srcNum2 & srcNum3 < srcNum2) {
            maxNum = srcNum2;
        }
        if (minNum > srcNum3 & srcNum3 < srcNum2) {
            minNum = srcNum3;
        } else if (minNum > srcNum2 & srcNum3 > srcNum2) {
            minNum = srcNum2;
        }
        String message = "";
        for (int i = maxNum - 1; i > minNum; i--) {
            message += i + " ";
        }
        System.out.println(message);

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int srcNum = 1234;
        int sum = 0;
        String strReverseNum = "";
        while (srcNum > 0) {
            int lastDigit = srcNum % 10;
            sum += lastDigit;
            srcNum /= 10;
            strReverseNum += lastDigit + "";
        }
        System.out.println("Число в обратном порядке = " + strReverseNum);
        System.out.println("Сумма цифр = " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int srcTmp1 = 0;
        int srcTmp2 = 0;
        int srcTmp3 = 0;
        int srcTmp4 = 0;
        int srcTmp5 = 0;
        int countOddEvenNum = 0;
        int count = 30;
        for (int i = 1; i <= count; i++) {
            if (i % 2 != 0) {
                if (countOddEvenNum == 0) {
                     srcTmp1 = i;
                } else if (countOddEvenNum == 1) {
                     srcTmp2 = i;
                } else if (countOddEvenNum == 2) {
                     srcTmp3 = i;
                } else if (countOddEvenNum == 3) {
                     srcTmp4 = i;
                } else {
                    srcTmp5 = i;
                }
                countOddEvenNum++;
            }
            if (countOddEvenNum == 5) {
                countOddEvenNum = 0;
                System.out.printf("%2d%3d%3d%3d%3d%n", srcTmp1, srcTmp2, srcTmp3, srcTmp4, srcTmp5);
                srcTmp1 = 0;
                srcTmp2 = 0;
                srcTmp3 = 0;
                srcTmp4 = 0;
                srcTmp5 = 0;
            }
            if (i == count & srcTmp1 != 0) {
                System.out.printf("%2d%3d%3d%3d%3d%n", srcTmp1, srcTmp2, srcTmp3, srcTmp4, srcTmp5);
            }
        }

        System.out.println("\n5. Проверка количества двоек числа на четность/нечетность");
        int srcNum1 = 3242592;
        int copyTmp = srcNum1;
        int countTwos = 0;
        String evenNumMsg = "";
        while (copyTmp > 0) {
            if (copyTmp % 10 == 2) {
                countTwos++;
            }
            copyTmp /= 10;
        }
        if (countTwos % 2 == 0) {
            evenNumMsg += "четное";
        } else if (countTwos % 2 != 0) {
            evenNumMsg += "нечетное";
        }
        System.out.println("В " + srcNum1 + " (" + evenNumMsg +") количество двоек - " + countTwos);

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 0; i <= 4; i++) {
            System.out.println("**********");
        }
        int countGrid = 5;
        while (countGrid > 0) {
            if(countGrid == 5) {
                System.out.println("\n#####");
            } else if (countGrid == 4) {
                System.out.println("####");
            } else if (countGrid == 3) {
                System.out.println("###");
            } else if (countGrid == 2) {
                System.out.println("##");
            } else {
                System.out.println("#");
            }
            countGrid--;
        }
        int countDollar = 2;
        System.out.println("\n$");
        do {
            if(countDollar == 2) {
                System.out.println("$$");
                System.out.println("$$$");
                System.out.println("$$");
            }  else {
                System.out.println("$");
            }
            countDollar--;
        } while (countDollar > 0);

        System.out.println("\n7. Отображение ASCII-символов");
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
        int tmp2 = srcNum4 / 10000;
        int tmp3 = srcNum4 % 1000;
        int tmpOnes2 = tmp2 % 10;
        int tmpTens2 = (tmp2 / 10) % 10;
        int tmpHundreds2 = tmp2 / 100;
        int tmpOnes3 = tmp3 % 10;
        int tmpTens3 = (tmp3 / 10) % 10;
        int tmpHundreds3 = tmp3 / 100; 
        if (tmpOnes3 == tmpHundreds2 & tmpTens3 == tmpTens2 & tmpOnes2 == tmpHundreds3) {
            System.out.println("Число " + srcNum4 + " является палиндромом");
        } else {
            System.out.println("Число " + srcNum4 + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int srcNum5 = 223340;
        int tmp4 = srcNum5 / 1000;
        int tmp5 = srcNum5 % 1000;
        int tmpOnes4 = tmp4 % 10;
        int tmpTens4 = (tmp4 / 10) % 10;
        int tmpHundreds4 = tmp4 / 100;
        int tmpOnes5 = tmp5 % 10;
        int tmpTens5 = (tmp5 / 10) % 10;
        int tmpHundreds5 = tmp5 / 100;
        int sumTmp4 = tmpOnes4 + tmpTens4 + tmpHundreds4;
        int sumTmp5 = tmpOnes5 + tmpTens5 + tmpHundreds5;
        if (sumTmp4 == sumTmp5) {
            System.out.println("Число " + srcNum5 + " является счастливым");
        } else {
            System.out.println("Число " + srcNum5 + " не является счастливым");
        }
        System.out.println("Сумма цифр " + tmp4 + " = " + sumTmp4 + ", а сумма " + tmp5 + " = " + sumTmp5);

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        System.out.println("         Таблица   Пифагора");
        System.out.println("   |  2   3   4   5   6   7   8   9");
        System.out.println("-----------------------------------");
        for (int i = 2; i < 10; i++) {
            if (i == 2) {
                System.out.println(" " + i + " |  " + i * 2 + "   " + i * 3 + "   " + i * 4 
                + "  " + i * 5 + "  " + i * 6 + "  " + i * 7 + "  " + i * 8 + "  " + i * 9);
            } else if (i == 3) {
                System.out.println(" " + i + " |  " + i * 2 + "   " + i * 3 + "  " + i * 4 
                + "  " + i * 5 + "  " + i * 6 + "  " + i * 7 + "  " + i * 8 + "  " + i * 9);
            } else if (i == 4) {
                System.out.println(" " + i + " |  " + i * 2 + "  " + i * 3 + "  " + i * 4 
                + "  " + i * 5 + "  " + i * 6 + "  " + i * 7 + "  " + i * 8 + "  " + i * 9);
            } else {
                System.out.println(" " + i + " | " + i * 2 + "  " + i * 3 + "  " + i * 4 
                + "  " + i * 5 + "  " + i * 6 + "  " + i * 7 + "  " + i * 8 + "  " + i * 9);
            }
        }
    }
}