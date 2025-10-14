package lr1;

import java.util.Scanner;

public class Example9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Name month: ");
        String namemonth = in.nextLine();

        System.out.println("Days in month: ");
        int dayinmonth = in.nextInt();

        System.out.println("Name month: " +namemonth+", "+ "Days in month: " +dayinmonth);
        in.close();

    }
}
