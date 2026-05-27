package lr13.Task;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Введите количество строк: ");
            int rows = Integer.parseInt(scanner.next());
            System.out.print("Введите количество столбцов: ");
            int cols = Integer.parseInt(scanner.next());
            if (rows <= 0 || cols <= 0) {
                throw new IllegalArgumentException("Размеры матрицы должны быть положительными");
            }

            int[][] matrix = new int[rows][cols];
            System.out.println("Введите элементы матрицы:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = Integer.parseInt(scanner.next());
                }
            }

            System.out.print("Введите номер столбца: ");
            int columnNumber = Integer.parseInt(scanner.next());
            int columnIndex = columnNumber - 1;
            if (columnIndex < 0 || columnIndex >= cols) {
                throw new ArrayIndexOutOfBoundsException("Нет столбца с таким номером");
            }

            System.out.println("Столбец №" + columnNumber + ":");
            for (int i = 0; i < rows; i++) {
                System.out.println(matrix[i][columnIndex]);
            }
        } catch (NumberFormatException e) {
            System.out.println("Ошибка: введена строка вместо числа");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        } finally {
            System.out.println("Выполнение программы завершено");
            scanner.close();
        }
    }
}