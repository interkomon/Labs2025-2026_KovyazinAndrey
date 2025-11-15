package lr4;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        int figure = 11;
        int i;
        int j;
        int z;

        for (i = 1; i <= figure; i++) {
            System.out.println("номер строки: "+ i + " ");
            z = 0;
            for (j = -12; j < figure; j++) {
                z = z + 1;
            }
            System.out.println(" Количество символов в строке "+ z);
        }


    }
}
