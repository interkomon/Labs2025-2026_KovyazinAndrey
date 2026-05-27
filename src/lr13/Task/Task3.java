package lr13.Task;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            int n = Integer.parseInt(scanner.next());
            if (n <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным");
            }

            byte[] array = new byte[n];
            int sum = 0;

            System.out.println("Введите элементы массива типа byte:");
            for (int i = 0; i < n; i++) {
                int value = Integer.parseInt(scanner.next());
                if (value < Byte.MIN_VALUE || value > Byte.MAX_VALUE) {
                    throw new IllegalArgumentException("Значение выходит за диапазон типа byte");
                }
                array[i] = (byte) value;

                int newSum = sum + array[i];
                if (newSum < Byte.MIN_VALUE || newSum > Byte.MAX_VALUE) {
                    throw new ArithmeticException("Сумма выходит за диапазон типа byte");
                }
                sum = newSum;
            }

            System.out.println("Сумма элементов массива = " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введена строка вместо числа");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Ошибка вычисления: " + e.getMessage());
        } finally {
            System.out.println("Выполнение программы завершено");
            scanner.close();
        }
    }
}