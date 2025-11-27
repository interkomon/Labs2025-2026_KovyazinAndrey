package lr5.Example6;

public class MyClass6 {
    private int min;
    private int max;

    public MyClass6() {
        min = 0;
        max = 0;
    }
    public MyClass6(int a, int b) {
        setValues(a, b);
    }

    public void setValues(int a) {
        int curMin = Math.min(min, max);
        int curMax = Math.max(min, max);

        min = Math.min(curMin, a);
        max = Math.max(curMax, a);
    }


    public void setValues(int a, int b) {
        int curMin = Math.min(min, max);
        int curMax = Math.max(min, max);

        int newMin = curMin;
        int newMax = curMax;

        newMin = Math.min(newMin, Math.min(a, b));
        newMax = Math.max(newMax, Math.max(a, b));

        min = newMin;
        max = newMax;
    }

    public void print() {
        System.out.println("min = " + min + ", max = " + max);
    }
}
