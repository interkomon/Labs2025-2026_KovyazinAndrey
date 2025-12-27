package lr7.Example5;

public class SubClass5Int extends SuperClass5{
    protected int number;

    SubClass5Int(String t, int n) {
        super(t);
        number = n;
    }

    @Override
    public void show() {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("text = " + getText());
        System.out.println("number = " + number);
        System.out.println();
    }
}
