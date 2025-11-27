package lr5.Example5;

public class Main {
    public static void main(String[] args) {
        MyClass5 obj1 = new MyClass5();
        MyClass5 obj2 = new MyClass5(50);
        MyClass5 obj3 = new MyClass5(150);

        System.out.println(obj1.getValue());
        System.out.println(obj2.getValue());
        System.out.println(obj3.getValue());

        obj1.setValue(77);
        System.out.println(obj1.getValue());

        obj2.setValue(1000);
        System.out.println(obj2.getValue());

        obj3.setValue();
        System.out.println(obj3.getValue());
    }
}
