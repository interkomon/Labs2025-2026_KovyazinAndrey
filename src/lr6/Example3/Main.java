package lr6.Example3;

public class Main {
    public static void main(String[] args) {
        // числа
        System.out.println(MyClass3.max(3, 7, -2, 10));
        System.out.println(MyClass3.min(3, 7, -2, 10));
        System.out.println(MyClass3.avg(3, 7, -2, 10));

        // массив
        int[] a = {5, 1, 9, 2};
        System.out.println(MyClass3.max(a));
        System.out.println(MyClass3.min(a));
        System.out.println(MyClass3.avg(a));
    }
}
