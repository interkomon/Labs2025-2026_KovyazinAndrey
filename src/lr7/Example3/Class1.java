package lr7.Example3;

// суперкласс
public class Class1 {
    public int num;

    Class1(int n) {
        num = n;
    }

    public void setValue(int n) {
        num = n;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n"
                + "num = " + num;
    }
}
