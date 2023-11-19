package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArraysTheme {
    private int[] numbers = {1, 7, 4, 5, 2, 6, 3};
    private int len = numbers.length;

    public static void main(String[] args) {
        ArraysTheme arraysTheme = new ArraysTheme();
        arraysTheme.reverseElements();
        arraysTheme.multiplicationElements();
        arraysTheme.deleteElements();
        arraysTheme.outputAlphabet();
        arraysTheme.fillUniqueNumbers();
    }

    private void reverseElements() {
        System.out.println("1. Реверс значений массива");
        System.out.print("До реверса: ");
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < len / 2; i++) {
            int randomNumbers = numbers[i];
            numbers[i] = numbers[len - i - 1];
            numbers[len - i - 1] = randomNumbers;
        }
        System.out.print("После реверса: ");
        System.out.println(Arrays.toString(numbers));
    }

    private void multiplicationElements() {
        System.out.println("\n2. Произведение элементов массива");
        int[] multipliers = new int[10];
        int result = 1;
        len = multipliers.length;
        for (int i = 0; i < len; i++) {
            multipliers[i] = i;
            if (i > 1 && i < len - 1) {
                result *= i;
            }
        }
        for (int i = 1; i < len - 2; i++) {
            System.out.print(i + " * ");
        }
        System.out.print(8 + " = " + result);
    }

    private void deleteElements() {
        System.out.println("\n\n3. Удаление элементов массива");
        float[] realNumbers = new float[15];
        len = realNumbers.length;
        for (int i = 0; i < len; i++) {
            realNumbers[i] = (float) Math.random();
        }
        System.out.println("Исходный массив");
        outputResult(realNumbers);

        int countZeros = 0;
        float compareNumber = realNumbers[len / 2];
        for (int i = 0; i < len; i++) {
            if (realNumbers[i] > compareNumber) {
                realNumbers[i] = 0;
                countZeros++;
            }
        }
        System.out.println("\nИзмененный массив");
        outputResult(realNumbers);
        System.out.println("\nКоличество обнуленных ячеек: " + countZeros);
    }

    private void outputResult(float[] realNumbers) {
        for (int i = 0; i < realNumbers.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%6.3f", realNumbers[i]);
        }
    }

    private void outputAlphabet() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        len = 'Z' - 'A';
        char[] symbolsUpperCase = new char[len+1];
        for (int i = 0; i <= len; i++) {
            symbolsUpperCase[i] = (char) ('Z' - i);
        }

        String stairsAlphabet = "";
        for (char s : symbolsUpperCase) {
            stairsAlphabet += s;
            System.out.println(stairsAlphabet);
        }
    }

    private void fillUniqueNumbers() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] uniqueNumbers = new int[30];
        len = uniqueNumbers.length;
        int number = 60 + (int) (Math.random() * 40);
        uniqueNumbers[0] = number;
        for (int i = 0; i < len; i++) {
            if (uniqueNumbers[i] == 0) {
                uniqueNumbers[i] = number;
            }
            if (uniqueNumbers[i] == number || uniqueNumbers[i - 1] == number) {
                number = 60 + (int) (Math.random() * 40);
                i = 0;
            }
        }

        Arrays.sort(uniqueNumbers);
        for (int i = 0; i < len; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.printf("%3d",uniqueNumbers[i]);
        }
    }
}
