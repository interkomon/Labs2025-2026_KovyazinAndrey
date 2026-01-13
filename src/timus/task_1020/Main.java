package timus.task_1020;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int N = Integer.parseInt(scanner.next().replace(',', '.'));
        double R = Double.parseDouble(scanner.next().replace(',', '.'));

        double[] x = new double[N];
        double[] y = new double[N];
        for (int i = 0; i < N; i++) {
            x[i] = Double.parseDouble(scanner.next().replace(',', '.'));
            y[i] = Double.parseDouble(scanner.next().replace(',', '.'));
        }
        scanner.close();


        double perimeter = 0.0;
        for (int i = 0; i < N; i++) {
            int next = (i + 1) % N;
            double dx = x[next] - x[i];
            double dy = y[next] - y[i];
            perimeter += Math.sqrt(dx * dx + dy * dy);
        }


        double length = perimeter + 2 * Math.PI * R;


        System.out.printf("%.2f\n", length);
    }
}
