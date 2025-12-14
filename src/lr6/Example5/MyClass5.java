package lr6.Example5;

public class MyClass5 {
    public static long sumSquares(int n) {
        long s = 0;
        for (int i = 1; i <= n; i++) {
            s += (long) i * i;
        }
        return s;
    }
}
