package lr6.Example6;

public class MyClass6 {
    public static int[] cutArray(int[] a, int k) {
        if (k >= a.length) {
            k = a.length;
        }

        int[] b = new int[k];
        for (int i = 0; i < k; i++) {
            b[i] = a[i];
        }
        return b;
    }
}

