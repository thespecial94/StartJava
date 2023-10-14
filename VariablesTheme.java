public class VariablesTheme {
    public static void main(String[] args) {
        //1.Вывод характеристик компьютера
        byte countRAM = 4;
        short countUSBConnectors = 5;
        int sizeSSD = 512;
        long sizeHDD = 2048000;
        float clockSpeedCPU = 3.4f;
        double videoMemory = 2.99;
        char symbol = '>';
        boolean providedHDMI = true;

        System.out.println("1. Вывод характеристик компьютера");
        System.out.println("Количество оперативной памяти = " + countRAM);
        System.out.println("Количество USB разъемов = " + countUSBConnectors);
        System.out.println("Объем SSD накопителя в Гб = " + sizeSSD);
        System.out.println("Объем HDD накопителя в Мб = " + sizeHDD);
        System.out.println("Видеопамять(Гб) в видеокарте = " + videoMemory);
        System.out.println("Тактовая частота процессора в ГГц = " + clockSpeedCPU);
        System.out.println("Символ, обозначающий больше в условиях = " + symbol);
        if(providedHDMI == true)
            System.out.println("Есть разъем HDMI? Да");
        else
            System.out.println("Есть разъем HDMI? Нет");
        System.out.println();

        //2. Расчет стоимости товара со скидкой
        int pricePen = 100;
        int priceBook = 200;
        double discount = 0.11;
        int sum = pricePen + priceBook;
        double sumDiscount = sum * discount;
        double sumWithDiscount = sum - sumDiscount;
        System.out.println("2. Расчет стоимости товара со скидкой");
        System.out.println("Общая стоимость товаров без скидки = " + sum + " руб.");
        System.out.println("Сумма скидки = " + sumDiscount + " руб.");
        System.out.println("Общая стоимость товаров со скидкой = " + sumWithDiscount + " руб.");
        System.out.println();

        //3. Вывод слова JAVA
        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a");
        System.out.println("   J   a a  v   v  a a");
        System.out.println("J  J  aaaaa  V V  aaaaa");
        System.out.println(" JJ  a     a  V  a     a");
        System.out.println();

        //4. Вывод min и max значений целых числовых типов
        byte maxByteValue = 127;
        short maxShortValue = 32767;
        int maxIntValue = 2147483647;
        long maxLongValue = 9223372036854775807L;
        System.out.println("4. Вывод min и max значений целых числовых типов");
        System.out.println("Вывод значений типа byte");
        System.out.println("первоначальное значение = " + maxByteValue);
        System.out.println("значение после инкремента на единицу = " + maxByteValue++);
        System.out.println("значение после декремента на единицу = " + maxByteValue--);
        System.out.println("Вывод значений типа short");
        System.out.println("первоначальное значение = " + maxShortValue);
        System.out.println("значение после инкремента на единицу = " + maxShortValue++);
        System.out.println("значение после декремента на единицу = " + maxShortValue--);
        System.out.println("Вывод значений типа int");
        System.out.println("первоначальное значение = " + maxIntValue);
        System.out.println("значение после инкремента на единицу = " + maxIntValue++);
        System.out.println("значение после декремента на единицу = " + maxIntValue--);
        System.out.println("Вывод значений типа long");
        System.out.println("первоначальное значение = " + maxLongValue);
        System.out.println("значение после инкремента на единицу = " + maxLongValue++);
        System.out.println("значение после декремента на единицу = " + maxLongValue--);
        System.out.println();

        //5. Перестановка значений переменных
        int num1 = 2;
        int num2 = 5;
        int num3 = 0;
        System.out.println("5. Перестановка значений переменных");
        System.out.println("с помощью третьей переменной");
        System.out.println("исходные значения переменных: num1 = " + num1 + "; num2 = "+ num2);
        num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("новые значения переменных: num1 = " + num1 + "; num2 = "+ num2);
        System.out.println("с помощью арифметических операций");
        System.out.println("исходные значения переменных: num1 = " + num1 + "; num2 = "+ num2);
        num1 -= num2;
        num2 += num1;
        num1 = num2 - num1;
        System.out.println("новые значения переменных: num1 = " + num1 + "; num2 = "+ num2);
        System.out.println("с помощью побитовой операции ^");
        System.out.println("исходные значения переменных: num1 = " + num1 + "; num2 = "+ num2);
        num3 = num2 ^ num1;
        num2 = num3 ^ num2;
        num1 = num3 ^ num1;
        System.out.println("новые значения переменных: num1 = " + num1 + "; num2 = "+ num2);
        System.out.println();

        //6. Вывод символов и их кодов
        byte codeDollar = 36;
        char dollar = '$'; //36
        byte codeAsterisk = 42;
        char asterisk = '*'; //42
        byte codeAtSign = 64;
        char atSign = '@'; //64
        byte codeVerticalBar = 124;
        char verticalBar = '|'; //124
        byte codeTilde = 126;
        char tilde = '~'; //126
        System.out.println("6. Вывод символов и их кодов");
        System.out.println(codeDollar + " - " + dollar);
        System.out.println(codeAsterisk + " - " + asterisk);
        System.out.println(codeAtSign + " - " + atSign);
        System.out.println(codeVerticalBar + " - " + verticalBar);
        System.out.println(codeTilde + " - " + tilde);
        System.out.println();

        //7. Вывод в консоль ASCII-арт Дюка
        char slash1 = '/';
        char slash2 = '\\';
        char parenthesis1 = '(';
        char parenthesis2 = ')';
        char underlining = '_';
        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        System.out.println("    " + slash1 + slash2 + "    ");
        System.out.println("   " + slash1 + "  " + slash2);
        System.out.println("  " + slash1 + underlining + parenthesis1 + " " + parenthesis2 + slash2 + "  ");
        System.out.println(" " + slash1 + "      " + slash2 + " ");
        System.out.println(slash1 +""+ underlining + underlining + underlining + underlining + slash1 + slash2 + underlining + underlining + slash2);
        System.out.println();

        //8. Вывод количества сотен, десятков и единиц числа
        int num = 123;
        int sourceNum = num;
        int numOnes = num % 10;
        num /= 10;
        int numTens = num % 10;
        num /= 10;
        int sumNum = num + numOnes + numTens;
        int composition = num * numOnes * numTens;
        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        System.out.println("Число " + sourceNum + " содержит:");
        System.out.println("  сотен - " + num);
        System.out.println("  десятков - " + numTens);
        System.out.println("  единиц - " + numOnes);
        System.out.println("Сумма его цифр = " + sumNum);
        System.out.println("Произведение = " + composition);
        System.out.println();

        //9. Вывод времени
        int totalSeconds = 86399;
        int seconds = totalSeconds % 60;
        int minutes = (totalSeconds % 3600) / 60;
        int hours = totalSeconds / 3600;
        System.out.println("9. Вывод времени");
        System.out.println("ЧЧ:ММ:СС = " + hours + ":" + minutes + ":" + seconds);
    }
}