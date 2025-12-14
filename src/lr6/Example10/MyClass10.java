package lr6.Example10;

public class MyClass10 {
    public static int[] minMax(int... a) {
        int min = a[0];
        int max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] < min) min = a[i];
            if (a[i] > max) max = a[i];
        }

        int[] res = new int[2];
        res[0] = min;
        res[1] = max;
        return res;
    }
}

