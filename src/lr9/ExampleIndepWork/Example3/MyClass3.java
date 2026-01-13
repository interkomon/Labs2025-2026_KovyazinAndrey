package lr9.ExampleIndepWork.Example3;

import java.util.Scanner;

public class MyClass3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ввдите размер массива: ");
        int num = scanner.nextInt();

        if (num <= 0) {
            System.out.println("Ошибка: Размер может быть только положительным");
            scanner.close();
            return;
        }

        int[] array = new int[num];
        System.out.println("Введите элементы:");
        inputArray(scanner, array, 0);
        scanner.close();

        System.out.println("Элементы:");
        printArray(array, 0);
        System.out.println();
    }

    private static void inputArray(Scanner scanner, int[] array, int index) {
        if (index < array.length) {
            array[index] = scanner.nextInt();
            inputArray(scanner, array, index + 1);
        }
    }

    private static void printArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            printArray(array, index + 1);
        }
    }
}
