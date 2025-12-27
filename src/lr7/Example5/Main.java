package lr7.Example5;

public class Main {
    public static void main(String[] args) {

        SuperClass5 a = new SuperClass5("Текст суперкласса");
        a.show();

        SubClass5Int b = new SubClass5Int("Текст подкласса 1", 100);
        b.show();

        SubClass5Char c = new SubClass5Char("Текст подкласса 2", 'Z');
        c.show();

        // ссылка суперкласса на объект подкласса
        SuperClass5 ref;

        ref = b;
        ref.show();

        ref = c;
        ref.show();
    }
}
