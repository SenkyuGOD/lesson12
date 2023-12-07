package edu.training.lesson13.task1;

import java.util.Scanner;
import java.util.Random;

public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = createArray(sc);
        int element = initElement(sc);
        int position = initPosition(sc);


        int[] mas = addElementInArrayAtPosition(array, element, position);

        showArray(mas);
    }
    public static int initElement(Scanner scanner) {
        System.out.print("Введите число которе хотите добавит в массив: ");
        int element = scanner.nextInt();
        return element;
    }

    public static int[] createArray(Scanner scanner) {
        System.out.print("Сколько элементов будет в массиве: ");
       int[] array = new int[scanner.nextInt()];

        System.out.println("Вы хотите чтобы массив заполнился самостоятельно? y/n");
        String answer = scanner.next();
        switch (answer) {
            case "y":
                initArray(array);
                break;
            default:
                return array;
        }
        return array;
    }

    public static void initArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(15);
        }
    }

    public static int initPosition(Scanner scanner) {
        System.out.print("На какую позицию вы хотите поставить ваше число? ");
        int position = scanner.nextInt();
        position--;
        return position;
    }

    public static int[] addElementInArrayAtPosition(int[] array, int element, int position) {
        int[] arr = new int[array.length + 1];

        for (int i = 0; i < position; i++) {
            arr[i] = array[i];
        }
        arr[position] = element;

        for (int i = position + 1; i < arr.length; i++) {
            arr[i] = array[i - 1];
        }

        return arr;
    }

    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
