package lr4;

public class Example7 {
    public static void main(String[] args) {
        int rows = 6;
        int cols = 8;
        int[][] a = new int[rows][cols];
        int value = 1;

        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    a[i][j] = value;
                    value++;
                }
            } else {
                for (int j = cols - 1; j >= 0; j--) {
                    a[i][j] = value;
                    value++;
                }
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
