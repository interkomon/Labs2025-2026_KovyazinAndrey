package timus.task_1023;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();

        int answer = 0;

        for (int d = 3; d * d <= k; d++) {
            if (k % d == 0) {
                answer = d - 1;
                break;
            }
        }

        if (answer == 0) {
            if (k % 2 == 0 && k / 2 >= 3) {
                answer = k / 2 - 1;
            } else {
                answer = k - 1;
            }
        }

        System.out.println(answer);
    }
}