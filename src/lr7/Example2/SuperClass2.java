package lr7.Example2;

public class SuperClass2 {
    private String text;

    SuperClass2(String t) {
        text = t;
    }

    public void setText(String t) {
        text = t;
    }

    public String getText() {
        return text;
    }


    public int getTextLength() {
        return text.length();
    }
}
