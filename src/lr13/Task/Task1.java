package lr13.Task;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите размер массива: ");
            int n = Integer.parseInt(scanner.next());
            if (n <= 0) {
                throw new IllegalArgumentException("Размер массива должен быть положительным");
            }

            int[] array = new int[n];
            int sum = 0;
            int count = 0;

            System.out.println("Введите элементы массива:");
            for (int i = 0; i < n; i++) {
                String value = scanner.next();
                if (value.contains(".") || value.contains(",")) {
                    throw new InputMismatchException("Введено число другого типа данных");
                }
                array[i] = Integer.parseInt(value);
                if (array[i] > 0) {
                    sum += array[i];
                    count++;
                }
            }

            if (count == 0) {
                throw new IllegalArgumentException("Положительные элементы отсутствуют");
            }

            double average = (double) sum / count;
            System.out.println("Среднее значение положительных элементов = " + average);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введена строка вместо целого числа");
        } catch (InputMismatchException e) {
            System.out.println("Ошибка: несоответствие числового типа данных");
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Выполнение программы завершено");
            scanner.close();
        }
    }
}