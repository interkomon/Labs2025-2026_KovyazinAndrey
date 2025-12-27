package lr7.Example4;

public class Main {
    public static void main(String[] args) {

        ClassA a1 = new ClassA('A');
        ClassA a2 = new ClassA(a1);              // копия
        System.out.println(a1.toString());
        System.out.println(a2.toString());

        ClassB b1 = new ClassB('B', "Text");
        ClassB b2 = new ClassB(b1);              // копия
        System.out.println(b1.toString());
        System.out.println(b2.toString());

        ClassC c1 = new ClassC('C', "Привет", 123);
        ClassC c2 = new ClassC(c1);              // копия
        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}
