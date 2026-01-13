package timus.task_1319;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[][] matrix = new int[N][N];

        int currentNumber = 1;


        for (int d = -(N - 1); d <= N - 1; d++) {
            int startI = Math.max(1, 1 + d);
            int endI = Math.min(N, N + d);
            for (int i = startI; i <= endI; i++) {
                int j = i - d;
                matrix[i - 1][j - 1] = currentNumber++;
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matrix[i][j]);
                if (j != N - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
