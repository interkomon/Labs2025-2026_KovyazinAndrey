package timus.task_1638;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int d = in.nextInt();
    int p = in.nextInt();
    int start = in.nextInt();
    int end = in.nextInt();


    int result = 2 * p * Math.abs(start - end);

    System.out.println(result);
    }
}