public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Подсчет суммы четных и нечетных чисел");
        byte num = -10;
        byte sumEvenNum = 0;
        byte sumOddEvenNum = 0;
        do {
            if (num%2 == 0 & num != 0) {
                sumEvenNum += num;
            } else if (num%2 != 0 & num != 0) {
                sumOddEvenNum += num;
            } 
            num++;
        } while (num < 22);
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + sumEvenNum 
            + ", а нечетных = " + sumOddEvenNum);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int num2 = -1;
        String message = "";
        for (int i = 9; i > num2; i--) {
            if (i != 5) {
                message += i + " ";
            }
        }
        System.out.println(message);

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int num3 = 1234;
        int sum = 0;
        int tmp1 = 0;
        System.out.println("Число в обратном порядке");
        while (num3 > 0) {
            tmp1 = num3 % 10;
            sum += tmp1;
            num3 /= 10;
            System.out.println(tmp1);
        }
        System.out.println("Сумма цифр = " + sum);

        System.out.println("\n4. Вывод чисел в несколько строк");
        String strNum = "";
        int countOddEvenNum = 0;
        int count = 24;
        for (int i = 2; i <= count; i++) {
            if (i%2 != 0) {
                if (i < 9) {
                    strNum +=  i + "  ";
                } else {
                    strNum +=  i + " ";
                }
                countOddEvenNum++;
            }
            if (countOddEvenNum == 5){
                countOddEvenNum = 0;
                System.out.printf("%15s%n", strNum);
                strNum = "";
            } else if (i == count) {
                countOddEvenNum %= 10;
                if (countOddEvenNum == 1) {
                    strNum += " 0  0  0  0";
                } else if (countOddEvenNum == 2) {
                    strNum += " 0  0  0";
                } else if (countOddEvenNum == 3) {
                    strNum += " 0  0";
                } else if (countOddEvenNum == 4) {
                    strNum += " 0";
                }
                System.out.println(strNum);
            }
        }

        System.out.println("\n15. Проверка количества двоек числа на четность/нечетность");
        int num1 = 3242592;
        int tmp = num1;
        int countNum = 0;
        int compareNum = 0;
        String evenNumMsg = "";
        while (tmp > 0) {
            compareNum = tmp % 10;
            if (compareNum == 2) {
                countNum++;
            }
            tmp /= 10;
        }
        if (countNum%2 == 0 & countNum != 0) {
            evenNumMsg += "четное";
        } else if (countNum%2 != 0 & countNum != 0) {
            evenNumMsg += "нечетное";
        }
        System.out.println("В " + num1 + " (" + evenNumMsg +") количество двоек - " + countNum);

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 0; i <= 4; i++){
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
            if ((i > 14 & i%2 != 0 & (char) i < '1') | 
                (((char) i >= 'a') && ((char) i <= 'z') & i%2 == 0)) {
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
        int num4 = 1234321;
        int tmp2 = num4 / 10000;
        int tmp3 = num4 % 1000;
        int tmpOnes2 = tmp2 % 10;
        int tmpTens2 = (tmp2 / 10) % 10;
        int tmpHundreds2 = tmp2 / 100;
        int tmpOnes3 = tmp3 % 10;
        int tmpTens3 = (tmp3 / 10) % 10;
        int tmpHundreds3 = tmp3 / 100; 
        if (tmpOnes3 == tmpHundreds2 & tmpTens3 == tmpTens2 & tmpOnes2 == tmpHundreds3) {
            System.out.println("Число " + num4 + " является палиндромом");
        } else {
            System.out.println("Число " + num4 + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int num5 = 223340;
        int tmp4 = num5 / 1000;
        int tmp5 = num5 % 1000;
        int tmpOnes4 = tmp4 % 10;
        int tmpTens4 = (tmp4 / 10) % 10;
        int tmpHundreds4 = tmp4 / 100;
        int tmpOnes5 = tmp5 % 10;
        int tmpTens5 = (tmp5 / 10) % 10;
        int tmpHundreds5 = tmp5 / 100;
        int sumTmp4 = tmpOnes4 + tmpTens4 + tmpHundreds4;
        int sumTmp5 = tmpOnes5 + tmpTens5 + tmpHundreds5;
        if (sumTmp4 == sumTmp5) {
            System.out.println("Число " + num5 + " является счастливым");
        } else {
            System.out.println("Число " + num5 + " не является счастливым");
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