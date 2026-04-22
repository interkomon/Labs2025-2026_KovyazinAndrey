package timus.task_1197;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        int[] dx = {-2, -2, -1, -1, 1, 1, 2, 2};
        int[] dy = {-1, 1, -2, 2, -2, 2, -1, 1};

        for (int i = 0; i < n; i++) {
            String cell = in.next();

            int x = cell.charAt(0) - 'a';
            int y = cell.charAt(1) - '1';

            int count = 0;

            for (int j = 0; j < 8; j++) {
                int newX = x + dx[j];
                int newY = y + dy[j];

                if (newX >= 0 && newX < 8 && newY >= 0 && newY < 8) {
                    count++;
                }
            }

            System.out.println(count);
        }
    }
}