package lr6.Example8;

public class MyClass8 {
    public static double average(int[] a) {
        long sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return (double) sum / a.length;
    }
}

