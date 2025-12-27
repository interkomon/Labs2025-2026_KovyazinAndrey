package lr7.Example3;
// подкласс
public class Class2 extends Class1 {
    protected char ch;

    Class2(int n, char c) {
        super(n);          // выхов конструктор суперкласса
        ch = c;
    }

    public void setValue(int n, char c) {
        num = n;
        ch = c;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n"
                + "num = " + num + "\n"
                + "ch = " + ch;
    }
}

