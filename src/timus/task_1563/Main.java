package timus.task_1563;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());
        HashSet<String> shops = new HashSet<>();
        int bayanCount = 0;

        for (int i = 0; i < n; i++) {
            String shop = in.nextLine();

            if (shops.contains(shop)) {
                bayanCount++;
            } else {
                shops.add(shop);
            }
        }

        System.out.println(bayanCount);
        in.close();
    }
}
