package timus.task_2142;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        long A = in.nextLong();
        long B = in.nextLong();
        long C = in.nextLong();

        long X = in.nextLong();
        long Y = in.nextLong();
        long Z = in.nextLong();


        long needRed = Math.max(0, X - A);
        long needBlue = Math.max(0, Y - B);

        if (needRed + needBlue > C) {
            System.out.println("There are no miracles in life");
            return;
        }


        long leftRed = Math.max(0, A - X);
        long leftBlue = Math.max(0, B - Y);
        long leftC = C - (needRed + needBlue);


        if (leftRed + leftBlue + leftC >= Z) {
            System.out.println("It is a kind of magic");
        } else {
            System.out.println("There are no miracles in life");
        }
    }
}

