package lr3;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input total quantity:");
        int num = in.nextInt();


        long sum = 0;
        int count = 0;

        boolean first = true;
//        for (int i = 1; count < num; i++) {
//            if (i % 5 == 2 || i % 3 == 1) {
//                if (!first) System.out.print(" ");
//                System.out.print(i);
//                first = false;
//
//                sum += i;
//                count++;
//            }
//        }
        int i = 1;
        while (count < num) {
            if (i % 5 == 2 || i % 3 == 1) {
                if (!first) System.out.print(" ");
                System.out.print(i);
                first = false;

                sum += i;
                count++;
            }
            i++;
        }

        System.out.println();
        System.out.println(sum);

        in.close();
    }
}
