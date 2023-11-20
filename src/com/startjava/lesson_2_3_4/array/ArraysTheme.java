package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArraysTheme {
    private int len = 0;

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
        int[] numbers = {1, 7, 4, 5, 2, 6, 3};
        len = numbers.length;
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < len; i++) {
            int tmp = numbers[i];
            numbers[i] = numbers[--len];
            numbers[len] = tmp;
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
        for (int i = 1; i < len - 1; i++) {
            System.out.print(multipliers[i] + (len - 2 == i  ? "" : " * "));
        }
        System.out.print(" = " + result);
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
        char[] alphabet = new char[len + 1];
        for (int i = 0; i <= len; i++) {
            alphabet[i] = (char) ('A' + i);
        }

        String stairsAlphabet = "";
        for (int i = len; i >= 0; i--) {
            stairsAlphabet += alphabet[i];
            System.out.println(stairsAlphabet);
        }
    }

    private void fillUniqueNumbers() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        int[] uniqueNumbers = new int[30];
        len = uniqueNumbers.length;
        int counter = 1;
        boolean similar = false;
        uniqueNumbers[0] = 60 + (int) (Math.random() * 40);
        do {
            int number = 60 + (int) (Math.random() * 40);
            for (int i = 1; i < len; i++) {
                if (uniqueNumbers[i] == number || uniqueNumbers[i - 1] == number) {
                    similar = true;
                    break;
                }
            }
            if (!similar) {
                uniqueNumbers[counter] = number;
                counter++;
            }
            similar = false;
        } while (counter < len);

        Arrays.sort(uniqueNumbers);
        for (int i = 0; i < len; i++) {
            if (i % 10 == 0 && i != 0) {
                System.out.println();
            }
            System.out.printf("%3d",uniqueNumbers[i]);
        }
    }
}
