package lr6.Example9;

public class MyClass9 {
    public static void reversePairs(char[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            char t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }
}

