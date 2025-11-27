package lr3;

import java.util.Random;
import java.util.Scanner;

public class Example9 {
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
        Random random = new Random();
        for (int i = 0; i < num; i++) {
            a[i] = random.nextInt(100);
        }
        int i = 0;
        while (i < num) {
            System.out.print(a[i]);
            if (i + 1 < num) System.out.print(" ");
            i++;
        }
        System.out.println();


        int min = a[0];
        for (int j = 1; j < num; j++) {
            if (a[j] < min) min = a[j];
        }
        System.out.println(min);
        boolean first = true;
        i = 0;
        while (i < num) {
            if (a[i] == min) {
                if (!first) System.out.print(" ");
                System.out.print(i);
                first = false;
            }
            i++;
        }
        System.out.println();
        in.close();
    }
}
