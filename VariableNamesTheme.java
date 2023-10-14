public class VariableNamesTheme {
    public static void main(String[] args) {
        // 1.Разные переменные
        // цифра
        byte number = 5;
        // сумма чисел
        byte sumNumbers = 10;
        // произведение цифр
        byte compositionNumbers = 6;
        // максимальное число
        byte maxNumber = 100;
        // количество десятков
        byte countTens = 7;
        // вес собаки
        byte weightDog = 50;
        // исходное число
        short sourceNumber = 200;
        // процент по вкладу
        double interestDeposit = 5.5;
        // (переменная хранит символ) &
        char symbol = '&';
        // код ошибки
        String codeError = "500-2";
        // тип сообщения
        String typeMessage = "Success";
        // число нулей
        byte numberZeros = 1;
        // уникальное число
        byte uniqueNumber = 5;
        // случайное число
        short randomNumber = 150;
        // математическое выражение
        String mathematicalExpression = "30 - 15";
        // выбор чего-либо
        String choosingSomething = "Moscow";
        // количество очков (в игре)
        byte countPointsGame = 98;
        // максимальная длина строки
        int maxLengthString = 3000000;
        // пункт меню
        String menuItem = "Завершение работы";
        // стоимость кофе на вынос
        String costCoffeeTakeAway = "200 рублей";
        // дата начала (чего-либо)
        String startDateSomething = "в 13:00 по Московскому времени";
        // окончание диапазона
        String endRange = "вес должен быть до 80 кг при росте 180";
        // полное имя работника месяца
        String fullnameEmployeeMonth = "Иванов Иван Иванович";
        // заголовок электронной книги
        String ebookTitle = "StartJava";
        // размер
        double size = 40.5;
        // вместимость (чего-либо)
        String capacitySomething = "500 мл.";
        // счетчик
        double counter = 3.6;
        // путь до файла
        String pathFile = "C:/StartJava";
        // количество чисел в каждой строке
        byte countNumbersEachRow = 25;

        // 2. boolean-переменные
        // сотни равны?;
        boolean equalHundreds = false;
        // компьютер включен?
        boolean running = true;
        // есть равные цифры?
        boolean equalNumbers = false;
        // (что-либо) создано?
        boolean created = true;
        // (что-либо) пусто?
        boolean empty = true;
        // (что-либо) активный?
        boolean active = false;
        // новый?
        boolean newest = true;
        // электронная почта действительная?
        boolean actual = true;
        // имеются уникальные строки?
        boolean unique = false;

        // 3. Аббревиатуры
        // старый universally unique identifier
        String universallyUniqueIdentifier = "UUID";
        // производитель оперативной памяти
        String ramManufacturer = "RAM";
        // емкость жесткого диска
        String capacityHardDisk = "HDD";
        // протокол передачи гипертекста
        String hypertextTransferProtocol = "HTTP";
        // сокращенный uniform resource locator
        String uniformResourceLocator = "URL";
        // новый идентификатор клиента
        String newClientId = "ClientID";
        // кодировка american standard code for information interchange
        String encodingASCII = "ASCII";

        System.out.println("1. Разные переменные");
        System.out.println("цифра = " + number);
        System.out.println("сумма чисел = " + sumNumbers);
        System.out.println("произведение цифр = " + compositionNumbers);
        System.out.println("максимальное число = " + maxNumber);
        System.out.println("количество десятков = " + countTens);
        System.out.println("вес собаки = " + weightDog);
        System.out.println("исходное число = " + sourceNumber);
        System.out.println("процент по вкладу = " + interestDeposit);
        System.out.println("переменная хранит символ = " + symbol);
        System.out.println("код ошибки = " + codeError);
        System.out.println("тип сообщения = " + typeMessage);
        System.out.println("число нулей = " + numberZeros);
        System.out.println("уникальное число = " + uniqueNumber);
        System.out.println("случайное число = " + randomNumber);
        System.out.println("математическое выражение = " + mathematicalExpression);
        System.out.println("выбор чего-либо = " + choosingSomething);
        System.out.println("количество очков (в игре) = " + countPointsGame);
        System.out.println("максимальная длина строки = " + maxLengthString);
        System.out.println("пункт меню = " + menuItem);
        System.out.println("стоимость кофе на вынос = " + costCoffeeTakeAway);
        System.out.println("дата начала (чего-либо) = " + startDateSomething);
        System.out.println("окончание диапазона = " + endRange);
        System.out.println("полное имя работника месяца = " + fullnameEmployeeMonth);
        System.out.println("заголовок электронной книги = " + ebookTitle);
        System.out.println("размер = " + size);
        System.out.println("вместимость (чего-либо) = " + capacitySomething);
        System.out.println("счетчик = " + counter);
        System.out.println("путь до файла = " + pathFile);
        System.out.println("количество чисел в каждой строке = " + countNumbersEachRow);
        System.out.println();

        System.out.println("2. boolean-переменные");
        if(equalHundreds == false)
            System.out.println("сотни равны? Нет");
        else
            System.out.println("сотни равны? Да");
        if(running == false)
            System.out.println("компьютер включен? Нет");
        else
            System.out.println("компьютер включен? Да");
        if(equalNumbers == false)
            System.out.println("есть равные цифры? Нет");
        else
            System.out.println("есть равные цифры? Да");
        if(created == false)
            System.out.println("(что-либо) создано? Нет");
        else
            System.out.println("(что-либо) создано? Да");
        if(empty == false)
            System.out.println("пусто? Нет");
        else
            System.out.println("пусто? Да");
        if(active == false)
            System.out.println("(что-либо) активный? Нет");
        else
            System.out.println("(что-либо) активный? Да");
        if(newest == false)
            System.out.println("новый? Нет");
        else
            System.out.println("новый? Да");
        if(actual == false)
            System.out.println("электронная почта действительная? Нет");
        else
            System.out.println("электронная почта действительная? Да");
        if(unique == false)
            System.out.println("имеются уникальные строки? Нет");
        else
            System.out.println("имеются уникальные строки? Да");
        System.out.println();

        System.out.println("3. Аббревиатуры");
        System.out.println("старый universally unique identifier = " + universallyUniqueIdentifier);
        System.out.println("производитель оперативной памяти = " + ramManufacturer);
        System.out.println("емкость жесткого диска = " + capacityHardDisk);
        System.out.println("протокол передачи гипертекста = " + hypertextTransferProtocol);
        System.out.println("сокращенный uniform resource locator = " + uniformResourceLocator);
        System.out.println("новый идентификатор клиент = " + newClientId);
        System.out.println("кодировка american standard code for information interchange = " + encodingASCII);
    }
}