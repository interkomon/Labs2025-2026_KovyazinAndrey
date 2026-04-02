package timus.task_1545;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        String[] words = new String[n];

        for (int i = 0; i < n; i++) {
            words[i] = in.next();
        }

        String letter = in.next();

        for (int i = 0; i < n; i++) {
            if (words[i].startsWith(letter)) {
                System.out.println(words[i]);
            }
        }
    }
}
