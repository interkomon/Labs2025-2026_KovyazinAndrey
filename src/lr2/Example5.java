package lr2;

import java.util.Scanner;

public class Example5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int num = in.nextInt();


        int res = (num / 1000) % 10;

        System.out.println("Result: "+ res);

        in.close();

    }
}
