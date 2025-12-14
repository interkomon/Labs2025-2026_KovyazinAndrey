package lr6.Example10;

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
        in.close();

        int[] res = MyClass10.minMax(a);

        System.out.println("Минимум: " + res[0]);
        System.out.println("Максимум: " + res[1]);
    }
}
