package lr7.Example3;

// подкласс от подкласса
public class Class3 extends Class2 {
    public String text;

    Class3(int n, char c, String t) {
        super(n, c);
        text = t;
    }

    public void setValue(int n, char c, String t) {
        num = n;
        ch = c;
        text = t;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n"
                + "num = " + num + "\n"
                + "ch = " + ch + "\n"
                + "text = " + text;
    }
}
