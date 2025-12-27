package lr7.Example1;

public class Main {
    public static void main(String[] args) {

        // объект суперкласса
        SuperClassTest superObj = new SuperClassTest("передал в конструктор суперкласса");
        System.out.println(superObj.toString());

        // объект подкласса (1 парам)
        SubClassTest subObj1 = new SubClassTest("передал в конструктор подкласса");
        System.out.println(subObj1.toString());

        // объект подкласса (2 парам)
        SubClassTest subObj2 = new SubClassTest(
                "передал в конструктор подкласса",
                "где два параметра"
        );
        System.out.println(subObj2.toString());
    }
}
