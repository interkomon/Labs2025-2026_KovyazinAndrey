package timus.task_1349;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        if (n == 0) {
            System.out.println("-1");
        } else if (n == 1) {
            System.out.println("1 2 3");
        } else if (n == 2) {
            for (int a = 1; a <= 100; a++) {
                for (int b = 1; b <= 100; b++) {
                    for (int c = 1; c <= 100; c++) {
                        if (a != b && a != c && b != c) {
                            if (a * a + b * b == c * c) {
                                System.out.println(a + " " + b + " " + c);
                                return;
                            }
                        }
                    }
                }
            }

            System.out.println("-1");
        } else {
            System.out.println("-1");
        }
    }
}
