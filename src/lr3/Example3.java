package lr3;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input number sequence: ");
        int num = in.nextInt();
        if(num <= 0)
        {
            System.out.println("Error: Number cannot be <= 0");
            return;
        }
        int a = 1;
        int b = 1;
        if (num == 1) {
            System.out.println(a);
            return;
        }

//        System.out.print(a + " " + b);
//        for (int i = 3; i <= num; i++) {
//            int c = a + b;
//            System.out.print(" " + c);
//            a = b;
//            b = c;
//        }
//        System.out.println();
        int i = 1;
        while (i <= num) {
            if (i == 1) {
                System.out.print(a);
            } else if (i == 2) {
                System.out.print(" " + b);
            } else {
                int c = a + b;
                System.out.print(" " + c);
                a = b;
                b = c;
            }
            i++;
        }
        System.out.println();

        in.close();

    }
}
