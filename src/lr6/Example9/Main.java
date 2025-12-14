package lr6.Example9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();
        in.close();
        char[] a = s.toCharArray();
        MyClass9.reversePairs(a);
        int i = 0;
        while (i < a.length) {
            System.out.print(a[i]);
            i++;
        }
        System.out.println();
    }
}

