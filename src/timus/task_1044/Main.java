package timus.task_1044;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int half = n / 2;

        int[] count = new int[37];
        count[0] = 1;

        for (int i = 0; i < half; i++) {
            int[] next = new int[37];

            for (int sum = 0; sum <= 36; sum++) {
                for (int digit = 0; digit <= 9; digit++) {
                    if (sum + digit <= 36) {
                        next[sum + digit] += count[sum];
                    }
                }
            }

            count = next;
        }

        int result = 0;

        for (int sum = 0; sum <= 36; sum++) {
            result += count[sum] * count[sum];
        }

        System.out.println(result);
    }
}
