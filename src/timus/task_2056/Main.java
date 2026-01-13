package timus.task_2056;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int sum = 0;
        boolean hasThree = false;
        boolean allFive = true;

        for (int i = 0; i < n; i++) {
            int mark = in.nextInt();
            sum += mark;

            if (mark == 3) {
                hasThree = true;
            }

            if (mark != 5) {
                allFive = false;
            }
        }

        if (hasThree) {
            System.out.println("None");
        } else if (allFive) {
            System.out.println("Named");
        } else if ((double) sum / n >= 4.5) {
            System.out.println("High");
        } else {
            System.out.println("Common");
        }

        in.close();
    }
}
