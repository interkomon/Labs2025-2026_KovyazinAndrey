package timus.task_1025;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int k = in.nextInt();
        int[] groups = new int[k];

        for (int i = 0; i < k; i++) {
            groups[i] = in.nextInt();
        }

        Arrays.sort(groups);

        int needGroups = k / 2 + 1;
        int answer = 0;

        for (int i = 0; i < needGroups; i++) {
            answer += groups[i] / 2 + 1;
        }

        System.out.println(answer);
    }
}
