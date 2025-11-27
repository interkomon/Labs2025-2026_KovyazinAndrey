package lr5.Example6;

public class Main {
    public static void main(String[] args) {
        MyClass6 obj1 = new MyClass6();
        obj1.print();

        obj1.setValues(5);
        obj1.print();

        obj1.setValues(-3, 10);
        obj1.print();

        MyClass6 obj2 = new MyClass6(7, 2);
        obj2.print();
    }
}
