package lr7.Example5;

public class SubClass5Char extends SuperClass5{
    protected char symbol;

    SubClass5Char(String t, char c) {
        super(t);
        symbol = c;
    }

    @Override
    public void show() {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("text = " + getText());
        System.out.println("symbol = " + symbol);
        System.out.println();
    }
}
