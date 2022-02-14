package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int lesson;

        Scanner input = new Scanner(System.in);
        System.out.println("Задачи:\n" +
                "[1] Вывод указанного числа Фибоначчи\n" +
                "[2] Пузырьковая сортировка\n" +
                "[3] Сколько чисел меньше текущего\n" +
                "[4] Скользящая сумма\n" +
                "[5] Предложения с большим количеством слов\n" +
                "[6] Отзеркаливание слова\n" +
                "[7] Fizz Buzz\n" +
                "[8] Анаграммы \n");
        System.out.println("Введите номер запускаемой задачи: ");
        lesson = input.nextInt();

        if (lesson == 1) {
            fibonacciLesson();
        } else if (lesson == 2) bubbleLesson();
        else if (lesson == 3) smallerNumbersLesson();
        else if (lesson == 4) runningSumLesson();
        else if (lesson == 5) sentencesLesson();
        else if (lesson == 6) reverseWordLesson();
        else if (lesson == 7) fizzbuzzLesson();
        else if (lesson == 8) anagramLesson();

    }

    private static void fibonacciLesson() {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = input.nextInt();
        System.out.println(number + " по счёту число фибоначчи = " + FibonacciLinear.compute(number));
        System.out.println("И " + FibonacciRecurrent.compute(number));
    }

    private static void bubbleLesson() {
        System.out.println("Укажите размерность массива: ");
        Scanner lengthInput = new Scanner(System.in);
        int length = lengthInput.nextInt();

        System.out.println("Введите элементы массива: ");
        Scanner arrayInput = new Scanner(System.in);

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = arrayInput.nextInt();
        }

        System.out.println("Будем сортировать такой массив: ");
        ArrayPrinter.print(array);


        System.out.println("Результат сортировки:");
        ArrayPrinter.print(BubbleSorter.sorter(array));
    }


    private static void smallerNumbersLesson() {
        System.out.println("Укажите размерность массива: ");
        Scanner lengthInput = new Scanner(System.in);
        int length = lengthInput.nextInt();

        System.out.println("Введите элементы массива: ");
        Scanner arrayInput = new Scanner(System.in);

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = arrayInput.nextInt();
        }

        System.out.println("Результат: ");
        ArrayPrinter.print(LeetCode.smallerNumbersThanCurrent_1365(array));

    }

    private static void runningSumLesson() {
        System.out.println("Укажите размерность массива: ");
        Scanner lengthInput = new Scanner(System.in);
        int length = lengthInput.nextInt();

        System.out.println("Введите элементы массива: ");
        Scanner arrayInput = new Scanner(System.in);

        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = arrayInput.nextInt();
        }

        System.out.println("Результат: ");
        ArrayPrinter.print(LeetCode.runningSum_1480(array));
        ArrayPrinter.print(LeetCode.runningSum_1480_linear(array));
    }

    private static void sentencesLesson() {
        System.out.println("Укажите количество предложений: ");
        Scanner lengthInput = new Scanner(System.in);
        int length = lengthInput.nextInt();

        System.out.println("Введите предложения: ");
        Scanner arrayInput = new Scanner(System.in);

        String[] array = new String[length];
        for (int i = 0; i < length; i++) {
            array[i] = arrayInput.nextLine();
        }

        System.out.println("Результат: ");
        System.out.println(LeetCode.mostWordsFound_2114(array));

    }

    private static void reverseWordLesson() {
        System.out.println("Введите слово: ");
        Scanner inputWord = new Scanner(System.in);
        String word = inputWord.nextLine();

        System.out.println("Результат: ");
        ArrayPrinter.print(LeetCode.reverseString_344(word));

    }

    private static void fizzbuzzLesson() {
        System.out.println("Введите число: ");
        Scanner inputValue = new Scanner(System.in);
        int value = inputValue.nextInt();

        System.out.println(LeetCode.fizzBuzz_412(value));
    }

    private static void anagramLesson() {
        System.out.println("Введите первое слово: ");
        Scanner inputWord1 = new Scanner(System.in);
        String word1 = inputWord1.nextLine();

        System.out.println("Введите второе слово: ");
        Scanner inputWord2 = new Scanner(System.in);
        String word2 = inputWord2.nextLine();

        System.out.println("Являются ли эти слова анаграммами");
        System.out.println(LeetCode.validAnagram_242(word1, word2));
    }

}