package lr7.Example4;

public class ClassC extends ClassB {
    public int num;

    ClassC(char ch, String text, int num) {
        super(ch, text);
        this.num = num;
    }

    ClassC(ClassC obj) {          // конструктор копии
        super(obj.ch, obj.text);
        this.num = obj.num;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n"
                + "ch = " + ch + "\n"
                + "text = " + text + "\n"
                + "num = " + num;
    }
}
