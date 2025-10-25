package timus.task_1068;

import java.util.Scanner;

//Всё, что от вас требуется — найти сумму всех целых чисел, лежащих между 1 и N включительно.

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input n: ");
        int n = in.nextInt();

        int res;

        if(n > 0)
        {
            res = n * (n +1) / 2;
        }
        else
        {
            int k = -n;
            res = 1 - k * (k + 1) / 2;
        }

        System.out.println("Result: "+res);
        in.close();
    }
}
