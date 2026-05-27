package timus.task_1313;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = in.nextInt();
            }
        }

        StringBuilder result = new StringBuilder();

        for (int sum = 0; sum <= 2 * n - 2; sum++) {
            int rowStart = Math.min(sum, n - 1);
            int rowEnd = Math.max(0, sum - n + 1);

            for (int i = rowStart; i >= rowEnd; i--) {
                int j = sum - i;
                result.append(a[i][j]).append(" ");
            }
        }

        System.out.println(result.toString().trim());
    }
}
