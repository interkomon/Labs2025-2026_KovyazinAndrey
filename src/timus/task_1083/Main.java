package timus.task_1083;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String factorialSigns = in.next();

        int k = factorialSigns.length();
        long result = 1;

        for (int i = n; i > 0; i -= k) {
            result *= i;
        }

        System.out.println(result);
    }
}
