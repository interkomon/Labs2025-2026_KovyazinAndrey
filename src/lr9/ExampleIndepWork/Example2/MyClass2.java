package lr9.ExampleIndepWork.Example2;

import java.util.Scanner;

public class MyClass2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();
        scanner.close();

        if (number < 0) {
            System.out.print("-");
            number = Math.abs(number);
        }
        System.out.print("Двоичное представление: ");
        if (number == 0) {
            System.out.print(0);
        } else {
            toBinary(number);
        }
        System.out.println();
    }

    private static void toBinary(int number) {
        if (number > 1) {
            toBinary(number / 2);
        }
        System.out.print(number % 2);
    }
}

