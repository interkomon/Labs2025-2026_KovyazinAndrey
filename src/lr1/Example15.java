package lr1;

import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input 1 number: ");
        int firstnumber = in.nextInt();
        System.out.println("Input 2 number: ");
        int secontnumber = in.nextInt();

        int diff = firstnumber - secontnumber;

        System.out.println("Difference: "+diff);
        in.close();

    }
}
