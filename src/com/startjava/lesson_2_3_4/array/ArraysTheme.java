package com.startjava.lesson_2_3_4.array;

import java.util.Arrays;

public class ArraysTheme {
    private int[] numbers = {1, 7, 4, 5, 2, 6, 3};
    private float[] realNumbers = new float[15];
    private int len = numbers.length;

    public void reverseElements() {
        System.out.println("1. Реверс значений массива");
        int[] tmpNumbers = new int[len];
        int j = 0;
        for (int i = len - 1; i >= 0; i--) {
            tmpNumbers[j] = numbers[i];
            j++;
        }
        System.out.print("До реверса: ");
        System.out.println(Arrays.toString(numbers));
        System.out.print("После реверса: ");
        System.out.println(Arrays.toString(tmpNumbers));
    }

    public void multiplicationElements() {
        System.out.println("\n2. Произведение элементов массива");
        numbers = new int[10];
        int multiplicationNumbers = 1;
        len = numbers.length;
        for (int i = 0; i < len; i++) {
            numbers[i] = i;
            if (i > 1 && i < len - 1) {
                multiplicationNumbers *= i;
            }
        }
        for (int a : numbers) {
            if (a > 0 && a < len - 2) {
                System.out.print(a + " * ");
            } else if (a == 8){
                System.out.print(a + " = " + multiplicationNumbers);
            }
        }
    }

    private void outputResult() {
        for (int i = 0; i < realNumbers.length; i++) {
            if (i == 8) {
                System.out.println();
            }
            System.out.printf("%6.3f", realNumbers[i]);
        }
    }

    public void deleteElements() {
        System.out.println("\n\n3. Удаление элементов массива");
        len = realNumbers.length;
        for (int i = 0; i < len; i++) {
            realNumbers[i] = (float) Math.random();
        }
        System.out.println("Исходный массив");
        outputResult();
        int countZeros = 0;
        float compareNumber = realNumbers[len / 2];
        for (int i = 0; i < len; i++) {
            if (compareNumber < realNumbers[i]) {
                realNumbers[i] = 0;
                countZeros++;
            }
        }
        System.out.println("\nИзмененный массив");
        outputResult();
        System.out.println("\nКоличествно обнуленных ячеек: " + countZeros);
    }

    public void outputAlphabet() {
        System.out.println("\n4. Вывод алфавита лесенкой");
        len = 'Z' - 'A';
        char[] symbols = new char[len+1];
        char upperCase = 'Z';
        for (int i = 0; i <= len; i++) {
            symbols[i] = upperCase;
            upperCase--;
        }
        String stairsAlphabet = "";
        for (char s : symbols) {
            stairsAlphabet += s;
            System.out.println(stairsAlphabet);
        }
    }

    public void fillUniqueNumbers() {
        System.out.println("\n5. Заполнение массива уникальными числами");
        numbers = new int[30];
        len = numbers.length;
        int number = 60 + (int) (Math.random() * 40);
        for (int i = 0; i < len; i++) {
            if (numbers[i] == 0) {
                numbers[i] = number;
            }
            if (numbers[i] == number || numbers[0] == number) {
                number = 60 + (int) (Math.random() * 40);
                i = 0;
            }
        }
        Arrays.sort(numbers);
        for (int i = 0; i < len; i++) {
            if (i == 10 || i == 20) {
                System.out.println();
            }
            System.out.printf("%3d",numbers[i]);
        }
    }

    public static void main(String[] args) {
        ArraysTheme arraysTheme = new ArraysTheme();
        arraysTheme.reverseElements();
        arraysTheme.multiplicationElements();
        arraysTheme.deleteElements();
        arraysTheme.outputAlphabet();
        arraysTheme.fillUniqueNumbers();
    }
}
