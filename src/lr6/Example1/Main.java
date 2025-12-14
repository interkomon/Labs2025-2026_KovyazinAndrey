package lr6.Example1;

public class Main {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();

        obj.setValue('A');
        obj.print();

        obj.setValue("Hello");
        obj.print();

        char[] a = {'B'};
        obj.setValue(a);
        obj.print();

        char[] b = {'J', 'a', 'v', 'a'};
        obj.setValue(b);
        obj.print();
    }
}

