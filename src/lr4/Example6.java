package lr4;

import java.util.Random;

public class Example6 {
    public static void main(String[] args) {
        int rows = 4;
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
        int delRow = rnd.nextInt(rows);
        int delCol = rnd.nextInt(cols);
        System.out.println("удаляемая строка: " + delRow);
        System.out.println("удаляемый столбец: " + delCol);
        int[][] b = new int[rows - 1][cols - 1];
        int ni = 0;
        for (int i = 0; i < rows; i++) {
            if (i == delRow)
                continue;
            int nj = 0;
            for (int j = 0; j < cols; j++) {
                if (j == delCol)
                    continue;
                b[ni][nj] = a[i][j];
                nj++;
            }
            ni++;
        }
        System.out.println("новый массив:");
        for (int i = 0; i < rows - 1; i++) {
            for (int j = 0; j < cols - 1; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }
}
