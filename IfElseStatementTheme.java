public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        short age = 18;
        float height = 1.8f;
        char firstSymbolName;
        String name = "Magomed";
        boolean maleGender = false;
        if (!maleGender) {
            System.out.println("Женский пол");
        } else {
            System.out.println("Мужской пол");
        }
        if (age > 18) {
            System.out.println("Возраст превышает 18 лет");
        } else {
            System.out.println("Возраст не превышает 18 лет");
        }
        if (height < 1.8) {
            System.out.println("Рост не превышает 180 см");
        } else {
            System.out.println("Рост превышает 180 см");
        }
        firstSymbolName = name.charAt(0);
        if (firstSymbolName == 'M') {
            System.out.println("Имя начинается с буквы M");
        } else if (firstSymbolName == 'I') {
            System.out.println("Имя начинается с буквы I");
        } else {
            System.out.println("Имя начинается с буквы " + firstSymbolName);
        }

        System.out.println("\n2. Поиск большего числа");
        short num1 = 30;
        short num2 = 30;
        if (num2 > num1) {
            System.out.println("Второе число больше первого");
        } else if (num1 == num2) {
            System.out.println("Значения чисел идентичны друг другу!");
        } else {
            System.out.println("Второе число не больше первого");
        }

        System.out.println("\n3. Проверка числа");
        short num3 = -20;
        String message = "Число " + num3 + " является ";
        if (num3 == 0) {
            message = "Число = " + num3;
        } else 
            { if (num3 < 0) {
                message += "отрицательным и "; 
            } else {
                message += "положительным и "; 
            } 
            if (num3 % 2 == 0) {
                message += "четным"; 
            } else {
                message += "нечетным"; 
            }
        }
        System.out.println(message);

        System.out.println("\n4. Поиск одинаковых цифр в числах");
        int num4 = 214;
        int num5 = 224;
        String messageDischarge = "";
        String messageNum = "";
        int numOnes4 = num4 % 10;
        int numOnes5 = num5 % 10;
        int numTens4 = (num4/10) % 10;
        int numTens5 = (num5/10) % 10;
        int numHundreds4 = num4 / 100;
        int numHundreds5 = num5 / 100;
        System.out.println("Исходные числа: " + num4 + " " + num5);
        if (numHundreds4 != numHundreds5 & numOnes4 != numOnes5 & numTens4 != numTens5) {
            System.out.println("Все цифры в разрядах отличаются!");
        }
        else {
            if (numHundreds4 == numHundreds5) {
                messageDischarge += "3";
                messageNum += numHundreds4;
            }
            if(numTens4 == numTens5) {
                messageDischarge += " 2";
                messageNum += " " + numTens4;
            }
            if(numOnes4 == numOnes5) {
                messageDischarge += " 1";
                messageNum += " " + numOnes4;
            }
            System.out.println("одинаковые в них цифры: " + messageNum);
            System.out.println("номера разрядов: " + messageDischarge);
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0062';
        String message1 = "Символ " + symbol + " является ";
        if ((int) symbol > 64 & (int) symbol < 91) {
            System.out.println(message1 + "большой буквой");
        } else if ((int) symbol > 96 & (int) symbol < 123) {
            System.out.println(message1 + "маленькой буквой");
        } else if ((int) symbol > 47 & (int) symbol < 58) {
            System.out.println(message1 + "цифрой");
        } else {
            System.out.println(message1 + "не буквой и не цифрой");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        double deposit = 301000;
        double accruals = 0;
        double totalSum = 0;
        if (deposit < 100000) {
            accruals = deposit * 0.05;
        } else if (deposit >= 100000 & deposit <= 300000) {
            accruals = deposit * 0.07;
        } else {
            accruals = deposit * 0.1;
        }
        totalSum = deposit + accruals;
        System.out.println("сумму вклада = " + deposit);
        System.out.println("сумма начисленного % = " + accruals);
        System.out.println("итоговая сумма с % = " + totalSum);

        System.out.println("\n7. Определение оценки по предметам");
        double historyPercent = 0.59;
        double programmingPercent = 0.92;
        int countObjects = 2;
        double avgPercent = historyPercent + programmingPercent / countObjects * 100;
        int historyEstimation = 0;
        int programmingEstimation = 0;
        int avgMarkObjects = 0;
        if (historyPercent <= 0.6) {
            historyEstimation = 2;
        } else if (historyPercent < 0.73) {
            historyEstimation = 3;
        } else if (historyPercent < 0.91) {
            historyEstimation = 4;
        } else {
            historyEstimation = 5;
        }
        if (programmingPercent <= 0.6) {
            programmingEstimation = 2;
        } else if (programmingPercent < 0.73) {
            programmingEstimation = 3;
        } else if (programmingPercent < 0.91) {
            programmingEstimation = 4;
        } else {
            programmingEstimation = 5;
        }
        avgMarkObjects = (historyEstimation + programmingEstimation) / countObjects;
        System.out.println("Оценка по истории = " + historyEstimation);
        System.out.println("Оценка по программированию = " + programmingEstimation);
        System.out.println("Средний балл оценок по предметам = " + avgMarkObjects);
        System.out.println("Средний % по предметам = " + avgPercent + "%");

        System.out.println("\n8. Расчет годовой прибыли");
        int rentPremise = 5000;
        int costPriceProduction = 9000;
        int saleGoods = 13000;
        int month = 12;
        String strProfit = "";
        int profit = (saleGoods * month) - (costPriceProduction + rentPremise) * month;
        if (profit > 0) {
            strProfit = "+" + profit;
        } else {
        strProfit += profit;
        }
        System.out.println("Прибыль за год: " + strProfit +" руб.");
    }
} 