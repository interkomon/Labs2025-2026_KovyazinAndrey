package lr4;

public class Example3 {
    public static void main(String[] args) {
        int rows = 11;
        int cols = 23;
        int[][] array = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = 2;
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println();
        }
    }
}
