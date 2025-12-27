package lr7.Example3;

public class Main {
    public static void main(String[] args) {

        Class1 a = new Class1(10);
        System.out.println(a.toString());

        Class2 b = new Class2(20, 'B');
        System.out.println(b.toString());

        Class3 c = new Class3(30, 'C', "Text");
        System.out.println(c.toString());

        // проверка перегруженных методов
        c.setValue(100);
        c.setValue(200, 'Z');
        c.setValue(300, 'X', "Привет");
        System.out.println(c.toString());
    }
}
