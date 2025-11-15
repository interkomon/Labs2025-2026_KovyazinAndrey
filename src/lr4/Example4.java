package lr4;

public class Example4 {
    public static void main(String[] args) {
        int n = 10;
        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j <= i) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 1) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
