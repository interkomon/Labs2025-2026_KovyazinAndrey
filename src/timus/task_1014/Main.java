package timus.task_1014;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        in.close();

        if (n == 0) {
            System.out.println(10);
            return;
        }
        if (n >= 1 && n <= 9) {
            System.out.println(n);
            return;
        }
        int[] digits = new int[20];
        int count = 0;

        for (int d = 9; d >= 2; d--) {
            while (n % d == 0) {
                n /= d;
                digits[count] = d;
                count++;
            }
        }

        if (n != 1) {
            System.out.println(-1);
            return;
        }
        Arrays.sort(digits, 0, count);
        for (int i = 0; i < count; i++) {
            System.out.print(digits[i]);
        }
        System.out.println();
    }

}
