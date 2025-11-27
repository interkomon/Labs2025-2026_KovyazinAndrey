package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number the size of array: ");
        int num = in.nextInt();
        in.close();

        if (num <= 0) {
            System.out.println("Error: The size must be positive");
            return;
        }
        int[] a = new int[num];
        Random rnd = new Random();
        for (int i = 0; i < num; i++) {
            a[i] = rnd.nextInt(100);
        }

        for (int i = 0; i < num - 1; i++) {
            int max = i;
            for (int j = i + 1; j < num; j++) {
                if (a[j] > a[max]) {
                    max = j;
                }
            }
            if (max != i) {
                int t = a[i];
                a[i] = a[max];
                a[max] = t;
            }
        }
        int i = 0;
        while (i < num) {
            System.out.print(a[i]);
            if (i + 1 < num) System.out.print(" ");
            i++;
        }
        System.out.println();

        in.close();



    }
}
