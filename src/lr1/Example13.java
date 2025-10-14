package lr1;

import java.util.Scanner;

public class Example13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input 1 number: ");
        int firstnumber = in.nextInt();
        System.out.println("Input 2 number: ");
        int secondnumber = in.nextInt();
        int sum = firstnumber + secondnumber;

        System.out.println("Calculate number: "+sum);
        in.close();


    }
}
