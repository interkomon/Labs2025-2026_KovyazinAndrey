package timus.task_1079;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> tests = new ArrayList<>();
        int maxN = 0;

        while (true) {
            int n = in.nextInt();
            if (n == 0) {
                break;
            }
            tests.add(n);
            if (n > maxN) {
                maxN = n;
            }
        }

        in.close();

        int[] a = new int[maxN + 2];
        int[] max = new int[maxN + 2];

        a[0] = 0;
        a[1] = 1;
        max[0] = 0;
        max[1] = 1;

        for (int i = 2; i <= maxN; i++) {
            if (i % 2 == 0) {
                a[i] = a[i / 2];
            } else {
                a[i] = a[i / 2] + a[i / 2 + 1];
            }

            if (a[i] > max[i - 1]) {
                max[i] = a[i];
            } else {
                max[i] = max[i - 1];
            }
        }

        for (int n : tests) {
            System.out.println(max[n]);
        }
    }
}