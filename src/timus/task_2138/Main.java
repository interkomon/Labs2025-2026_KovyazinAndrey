package timus.task_2138;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String type = in.nextLine();
        long v = Long.parseLong(in.nextLine());

        long b1 = v % 256;
        v = v / 256;

        long b2 = v % 256;
        v = v / 256;

        long b3 = v % 256;
        v = v / 256;

        long b4 = v % 256;

        long answer = b1 * 256 * 256 * 256
                + b2 * 256 * 256
                + b3 * 256
                + b4;

        System.out.println(answer);
    }
}
