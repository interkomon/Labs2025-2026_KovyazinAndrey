package lr7.Example4;

public class ClassB extends ClassA{
    public String text;

    ClassB(char ch, String text) {
        super(ch);
        this.text = text;
    }

    ClassB(ClassB obj) {          // конструктор копии
        super(obj.ch);
        this.text = obj.text;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n"
                + "ch = " + ch + "\n"
                + "text = " + text;
    }
}
