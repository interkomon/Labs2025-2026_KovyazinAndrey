package lr1;

import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input day week: ");
        String dayweek = in.nextLine();

        System.out.println("Input name month: ");
        String namemonth = in.nextLine();

        System.out.println("Input date (number day): ");
        int date = in.nextInt();

        System.out.println("Day week: " +dayweek + "," +"Name month: "+namemonth+ ","
                +"Date (number day): "+date);
        in.close();

    }
}
