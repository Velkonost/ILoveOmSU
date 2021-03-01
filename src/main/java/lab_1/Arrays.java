package lab_1;

import java.util.Scanner;

/**
 * Created by Intelij IDEA
 * User: Velkonost
 */
public class Arrays {

    public static void startAll() {

        int[] arr = readArray();
        printArray(arr);

        thirdQuestion(arr);
        forthQuestion(arr);
        fifthQuestion(arr);
        sixthQuestion(arr);
        seventhQuestion(arr);
    }

    public static void selectQuestion() {
        int[] arr = readArray();
        printArray(arr);

        Scanner in = new Scanner(System.in);
        int number;
        do {
            System.out.print("Введите номер задания (или 0 для выхода): ");
            number = in.nextInt();

            switch (number) {
                case 1:
                    printArray(arr);
                    break;
                case 2:
                    arr = readArray();
                    break;
                case 3:
                    thirdQuestion(arr);
                    break;
                case 4:
                    forthQuestion(arr);
                    break;
                case 5:
                    fifthQuestion(arr);
                    break;
                case 6:
                    sixthQuestion(arr);
                    break;
                case 7:
                    seventhQuestion(arr);
                    break;

            }
        } while (number != 0);
    }

    public static int[] readArray() {
        System.out.println("Введите количество элементов в массиве:");

        Scanner s = new Scanner(System.in);
        int n;
        n = s.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i<n; i++) {
            System.out.printf("Введите значение %d элемента\n", i);
            arr[i] = s.nextInt();
        }

        return arr;
    }

    public static void printArray(int[] array) {
        System.out.println("Вывод элементов массива на экран");

        for (int value : array) {
            System.out.print(value);
            System.out.print(" ");
        }

        System.out.print("\n");
    }

    public static void thirdQuestion(int[] array) {
        System.out.println("Сумма всех элементов массива");

        int sum = 0;
        for (int value : array) {
            sum = sum + value;
        }

        System.out.printf("Сумма элементов в массиве: %d\n", sum);
    }

    public static void forthQuestion(int[] array) {
        System.out.println("Количество четных чисел в массиве");
        int amount = 0;

        for (int value : array) {
            if (value % 2 == 0) {
                amount++;
            }
        }

        System.out.printf("Количество чётных чисел в массиве: %d\n", amount);
    }

    public static void fifthQuestion(int[] array) {
        System.out.println("Количество элементов массива, принадлежащих отрезку [a; b]");

        Scanner s = new Scanner(System.in);
        int a, b;

        System.out.println("Введите границы отрезка");

        a = s.nextInt();
        b = s.nextInt();

        int amount = 0;
        for (int value : array) {
            if (value >= a && value <= b) {
                amount++;
            }
        }
        System.out.printf("Количество элементов массива принадлежащих отрезку [a; b]: %d\n", amount);
    }

    public static void sixthQuestion(int[] array) {
        System.out.println("Проверка - все ли элементы массива положительные");
        boolean isAllPositive = true;

        for (int i = 0; i < array.length && isAllPositive; i++) {
            if (array[i] <= 0) isAllPositive = false;
        }

        if (!isAllPositive) System.out.print("Нет, не все элементы в массиве положительны\n");
        else System.out.print("Да, все элементы в массиве положительны\n");
    }

    public static void seventhQuestion(int[] array) {
        System.out.println("Переставьте в массиве элементы в обратном порядке");

        int i = 0;

        int j = array.length - 1;
        int tmp;

        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;

            j--;
            i++;
        }

        printArray(array);
    }
}