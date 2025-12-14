package lr6.Example3;

public class MyClass3 {
    public static int max(int... a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > m) m = a[i];
        }
        return m;
    }

    public static int min(int... a) {
        int m = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] < m) m = a[i];
        }
        return m;
    }

    public static double avg(int... a) {
        long s = 0;
        for (int i = 0; i < a.length; i++) {
            s += a[i];
        }
        return (double) s / a.length;
    }
}

