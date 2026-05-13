package timus.task_1149;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        String result = getA(1) + "+" + n;

        for (int i = 2; i <= n; i++) {
            result = "(" + result + ")" + getA(i) + "+" + (n - i + 1);
        }

        System.out.println(result);
    }

    public static String getA(int n) {
        StringBuilder result = new StringBuilder();

        for (int i = 1; i <= n; i++) {
            result.append("sin(").append(i);

            if (i < n) {
                if (i % 2 == 1) {
                    result.append("-");
                } else {
                    result.append("+");
                }
            }
        }

        for (int i = 1; i <= n; i++) {
            result.append(")");
        }

        return result.toString();
    }
}