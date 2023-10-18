public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Перевод псевдокода на язык Java");
        short age = 18;
        float height = 1.8f;
        char firstSymbolName = "Magomed".charAt(0);
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
        } else { 
            if (num3 < 0) {
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
        int numOnes4 = num4 % 10;
        int numOnes5 = num5 % 10;
        int numTens4 = (num4 / 10) % 10;
        int numTens5 = (num5 / 10) % 10;
        int numHundreds4 = num4 / 100;
        int numHundreds5 = num5 / 100;
        System.out.println("Исходные числа: " + num4 + " " + num5);
        if (numHundreds4 != numHundreds5 & numOnes4 != numOnes5 & numTens4 != numTens5) {
            System.out.println("Все цифры в разрядах отличаются!");
        } else {
            if (numHundreds4 == numHundreds5) {
                System.out.println("одинаковые в них цифры: " + numHundreds4);
                System.out.println("номера разрядов: " + 3);
            }
            if (numTens4 == numTens5) {
                System.out.println("одинаковые в них цифры: " + numTens4);
                System.out.println("номера разрядов: " + 2);
            }
            if (numOnes4 == numOnes5) {
                System.out.println("одинаковые в них цифры: " + numOnes4);
                System.out.println("номера разрядов: " + 1);
            }
        }

        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0034';
        if ((symbol >= 'A') && (symbol <= 'Z')) {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else if ((symbol >= 'a') && (symbol <= 'z')) {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else if ((symbol >= '0') && (symbol <= '9')) {
            System.out.println("Символ " + symbol + " является цифрой");
        } else {
            System.out.println("Символ " + symbol + " является не буквой и не цифрой");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301_000;
        int percent = 10;
        if (deposit < 100_000) {
            percent = 5;
        } else if (deposit <= 300_000) {
            percent = 7;
        }
        double interest = deposit / 100 * percent;
        double totalSum = deposit + interest;
        System.out.println("сумму вклада = " + deposit);
        System.out.println("сумма начисленного % = " + interest);
        System.out.println("итоговая сумма с % = " + totalSum);

        System.out.println("\n7. Определение оценки по предметам");
        double historyPercent = 0.59;
        double programmingPercent = 0.92;
        int historyGrade = 5;
        if (historyPercent <= 0.6) {
            historyGrade = 2;
        } else if (historyPercent < 0.73) {
            historyGrade = 3;
        } else if (historyPercent < 0.91) {
            historyGrade = 4;
        }
        int programmingGrade = 5;
        if (programmingPercent <= 0.6) {
            programmingGrade = 2;
        } else if (programmingPercent < 0.73) {
            programmingGrade = 3;
        } else if (programmingPercent < 0.91) {
            programmingGrade = 4;
        }
        int countObjects = 2;
        int avgMarkObjects = (historyGrade + programmingGrade) / countObjects;
        double avgPercent = historyPercent + programmingPercent / countObjects * 100;
        System.out.println("Оценка по истории = " + historyGrade);
        System.out.println("Оценка по программированию = " + programmingGrade);
        System.out.println("Средний балл оценок по предметам = " + avgMarkObjects);
        System.out.println("Средний % по предметам = " + avgPercent + "%");

        System.out.println("\n8. Расчет годовой прибыли");
        int rentPremise = 5000;
        int costPriceProduction = 9000;
        int saleGoods = 13000;
        int month = 12;
        int profit = (saleGoods - (costPriceProduction + rentPremise)) * month;
        if (profit > 0) {
            System.out.println("Прибыль за год: " + "+" + profit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profit + " руб.");
        }
    }
}