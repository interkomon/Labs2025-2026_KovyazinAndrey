package lr6.Example7;

public class MyClass7 {
    public static int[] toCodes(char[] a) {
        int[] codes = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            codes[i] = (int) a[i];
        }
        return codes;
    }
}

