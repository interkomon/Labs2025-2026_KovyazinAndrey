package lr3;

import java.util.Scanner;

public class Example6 {
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
        for (int i = 0; i < num; i++) {
            a[i] = 2 + 5 * i;
        }

//        for (int i = 0; i < num; i++) {
//            System.out.print(a[i]);
//            if (i + 1 < num) System.out.print(" ");
//        }

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
