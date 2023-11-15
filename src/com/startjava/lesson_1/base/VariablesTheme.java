package com.startjava.lesson_1.base;

public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Вывод характеристик компьютера");
        byte countRam = 4;
        short countUsbConnectors = 5;
        int sizeSsd = 512;
        long sizeHdd = 2048000;
        float clockSpeedCpu = 3.4f;
        double videoMemory = 2.99;
        char symbol = '>';
        boolean providedHdmi = false;
        System.out.println("Количество оперативной памяти = " + countRam);
        System.out.println("Количество USB разъемов = " + countUsbConnectors);
        System.out.println("Объем SSD накопителя в Гб = " + sizeSsd);
        System.out.println("Объем HDD накопителя в Мб = " + sizeHdd);
        System.out.println("Видеопамять(Гб) в видеокарте = " + videoMemory);
        System.out.println("Тактовая частота процессора в ГГц = " + clockSpeedCpu);
        System.out.println("Символ, обозначающий больше в условиях = " + symbol);
        if(providedHdmi)
            System.out.println("Есть разъем HDMI? Да");
        else
            System.out.println("Есть разъем HDMI? Нет");

        System.out.println("\n2. Расчет стоимости товара со скидкой");
        int pricePen = 100;
        int priceBook = 200;
        double discount = 0.11;
        int sum = pricePen + priceBook;
        double sumDiscount = sum * discount;
        double discountPrice = sum - sumDiscount;
        System.out.println("Общая стоимость товаров без скидки = " + sum + " руб.");
        System.out.println("Сумма скидки = " + sumDiscount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой = " + discountPrice + " руб.");

        System.out.println("\n3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");

        System.out.println("\n4. Вывод min и max значений целых числовых типов");
        byte maxByteValue = 127;
        short maxShortValue = 32767;
        int maxIntValue = 2147483647;
        long maxLongValue = 9223372036854775807L;
        System.out.println("Вывод значений типа byte");
        System.out.println("первоначальное значение = " + maxByteValue);
        System.out.println("значение после инкремента на единицу = " + ++maxByteValue);
        System.out.println("значение после декремента на единицу = " + --maxByteValue);
        System.out.println("Вывод значений типа short");
        System.out.println("первоначальное значение = " + maxShortValue);
        System.out.println("значение после инкремента на единицу = " + ++maxShortValue);
        System.out.println("значение после декремента на единицу = " + --maxShortValue);
        System.out.println("Вывод значений типа int");
        System.out.println("первоначальное значение = " + maxIntValue);
        System.out.println("значение после инкремента на единицу = " + ++maxIntValue);
        System.out.println("значение после декремента на единицу = " + --maxIntValue);
        System.out.println("Вывод значений типа long");
        System.out.println("первоначальное значение = " + maxLongValue);
        System.out.println("значение после инкремента на единицу = " + ++maxLongValue);
        System.out.println("значение после декремента на единицу = " + --maxLongValue);

        System.out.println("\n5. Перестановка значений переменных");
        int num1 = 2;
        int num2 = 5;
        int tmp = num1;
        System.out.println("с помощью третьей переменной");
        System.out.println("исходные значения переменных: num1 = " + num1 + "; num2 = "+ num2);
        num1 = num2;
        num2 = tmp;
        System.out.println("новые значения переменных: num1 = " + num1 + "; num2 = "+ num2);
        System.out.println("с помощью арифметических операций");
        System.out.println("исходные значения переменных: num1 = " + num1 + "; num2 = "+ num2);
        num1 -= num2;
        num2 += num1;
        num1 = num2 - num1;
        System.out.println("новые значения переменных: num1 = " + num1 + "; num2 = "+ num2);
        System.out.println("с помощью побитовой операции ^");
        System.out.println("исходные значения переменных: num1 = " + num1 + "; num2 = "+ num2);
        num1 ^= num2;
        num2 ^= num1;
        num1 ^= num2;
        System.out.println("новые значения переменных: num1 = " + num1 + "; num2 = "+ num2);

        System.out.println("\n6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*'; //42
        char atSign = '@'; //64
        char verticalBar = '|'; //124
        char tilde = '~'; //126
        System.out.println((int) dollar + " - " + dollar);
        System.out.println((int) asterisk + " - " + asterisk);
        System.out.println((int) atSign + " - " + atSign);
        System.out.println((int) verticalBar + " - " + verticalBar);
        System.out.println((int) tilde + " - " + tilde);

        System.out.println("\n7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backslash = '\\';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        char underscore = '_';
        System.out.println("    " + slash + backslash);
        System.out.println("   " + slash + "  " + backslash);
        System.out.println("  " + slash + underscore + leftParenthesis + " " + 
                rightParenthesis + backslash);
        System.out.println(" " + slash + "      " + backslash);
        System.out.println("" + slash + underscore + underscore + underscore + 
                underscore + slash + backslash + underscore + underscore + backslash);

        System.out.println("\n8. Вывод количества сотен, десятков и единиц числа");
        int num = 123;
        int numOnes = num % 10;
        int numTens = (num / 10) % 10;
        int numHundreds = num / 100;
        sum = numHundreds + numOnes + numTens;
        int multiplication = numHundreds * numOnes * numTens;
        System.out.println("Число " + num + " содержит:");
        System.out.println("  сотен - " + numHundreds);
        System.out.println("  десятков - " + numTens);
        System.out.println("  единиц - " + numOnes);
        System.out.println("Сумма его цифр = " + sum);
        System.out.println("Произведение = " + multiplication);

        System.out.println("\n9. Вывод времени");
        int totalSeconds = 86399;
        int seconds = totalSeconds % 60;
        int minutes = (totalSeconds % 3600) / 60;
        int hours = totalSeconds / 3600;
        System.out.println("ЧЧ:ММ:СС = " + hours + ":" + minutes + ":" + seconds);
    }
}