package lr5.Example1;

public class Main {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();
        obj.setChar('A');
        int code = obj.getCharCode();;
        System.out.println("Код символа: " + code);
        obj.printInfo();
    }
}
