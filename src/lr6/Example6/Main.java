package lr6.Example6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int n = in.nextInt();

        int[] a = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        System.out.print("Введите сколько первых элементов взять: ");
        int k = in.nextInt();

        in.close();

        int[] b = MyClass6.cutArray(a, k);

        System.out.println("Новый массив:");
        int i = 0;
        while (i < b.length) {
            System.out.print(b[i]);
            if (i + 1 < b.length) System.out.print(" ");
            i++;
        }
        System.out.println();
    }
}
