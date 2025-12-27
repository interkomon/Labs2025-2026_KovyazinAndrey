package lr7.Example5;

public class SuperClass5 {
    private String text;

    SuperClass5(String t) {
        text = t;
    }

    public String getText() {
        return text;
    }

    public void show() {
        System.out.println("Class name: " + this.getClass().getSimpleName());
        System.out.println("text = " + text);
        System.out.println();
    }
}
