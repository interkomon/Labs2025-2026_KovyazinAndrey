package lr3;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number the size of array: ");
        int num = in.nextInt();


        if (num <= 0) {
            System.out.println("Error: The size must be positive");
            return;
        }

        char[] a = new char[num];

        int filled = 0;

        for (char ch = 'A'; filled < num; ch++) {
            if (ch > 'Z') {
                ch = 'A';
            }
            if (ch != 'A' && ch != 'E' && ch != 'I') {
                a[filled] = ch;
                filled++;
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
