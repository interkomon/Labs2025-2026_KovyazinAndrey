package lr6.Example7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        in.close();

        char[] chars = s.toCharArray();
        int[] codes = MyClass7.toCodes(chars);

        System.out.println("Коды символов:");
        int i = 0;
        while (i < codes.length) {
            System.out.print(codes[i]);
            if (i + 1 < codes.length) System.out.print(" ");
            i++;
        }
        System.out.println();
    }
}

