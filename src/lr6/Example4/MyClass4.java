package lr6.Example4;

public class MyClass4 {
    public static long doubleFactorial(int n) {
        long res = 1;
        for (int i = n; i > 0; i -= 2) {
            res *= i;
        }
        return res;
    }
}

