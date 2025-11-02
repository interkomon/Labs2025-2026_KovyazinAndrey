package lr3;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number the size of array: ");
        int num = in.nextInt();


        if (num <= 0) {
            System.out.println("Error: The size must be positive");
            return;
        }

        char[] a = new char[num];
        for (int i = 0; i < num; i++) {
            a[i] = (char) ('a' + (2 * i) % 26);
        }

        int i = 0;
        while (i < num) {
            System.out.print(a[i]);
            if (i + 1 < num) System.out.print(" ");
            i++;
        }
        System.out.println();

        i = num - 1;
        while (i >= 0) {
            System.out.print(a[i]);
            if (i > 0) System.out.print(" ");
            i--;
        }
        System.out.println();
        in.close();
    }
}


