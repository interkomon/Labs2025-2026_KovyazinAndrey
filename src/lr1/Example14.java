package lr1;

import java.util.Scanner;

public class Example14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input number: ");
        int number = in.nextInt();

        int numberminus = number - 1;
        int numbernumber = number;
        int numberplus = number + 1;
        int sum = numberminus + numbernumber + numberplus;
        int numbersqua = sum * sum;

        System.out.println("Number - 1: "+numberminus+","+"Input number: "+numbernumber+ ","
                +"Number + 1: "+","+numberplus+","+ "Squared amount: "+numbersqua);
        in.close();
    }
}
