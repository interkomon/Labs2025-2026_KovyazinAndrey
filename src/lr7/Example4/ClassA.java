package lr7.Example4;

public class ClassA {
    public char ch;

    ClassA(char ch) {
        this.ch = ch;
    }

    ClassA(ClassA obj) {          // конструктор копии
        this.ch = obj.ch;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n"
                + "ch = " + ch;
    }
}
