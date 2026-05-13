package timus.task_1051;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int m = in.nextInt();
        int n = in.nextInt();

        int result;

        if (m == 1 || n == 1) {
            result = (m * n + 1) / 2;
        } else if (m % 3 == 0 || n % 3 == 0) {
            result = 2;
        } else {
            result = 1;
        }

        System.out.println(result);
    }
}
