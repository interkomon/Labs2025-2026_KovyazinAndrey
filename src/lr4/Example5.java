package lr4;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 5;

        int[][] a = new int[rows][cols];
        Random rnd = new Random();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                a[i][j] = rnd.nextInt(10);
            }
        }
        System.out.println("исходный массив:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        int[][] b = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                b[j][i] = a[i][j];
            }
        }

        System.out.println("массив: строки и столбцы меняются местами:");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
