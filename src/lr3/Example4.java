package lr3;

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input 2 numbers: ");
        int one = in.nextInt();
        int two = in.nextInt();


        int min = Math.min(one,two);
        int max = Math.max(one,two);


//        for(int i = min; i <= max; i++) {
//            System.out.println(i);
//        }

        int n = min;
        while(n <= max)
        {
            System.out.println(n);
            n++;
        }


        in.close();
    }
}
