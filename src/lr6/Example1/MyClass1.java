package lr6.Example1;

public class MyClass1 {
    private char ch;
    private String text;


    public void setValue(char c) {
        ch = c;
    }

    public void setValue(String s) {
        text = s;
    }

    public void setValue(char[] arr) {
        if (arr.length == 1) {
            ch = arr[0];
        } else {
            text = new String(arr);
        }
    }

    public void print() {
        System.out.println("Символ = " + ch);
        System.out.println("Текст = " + text);
    }
}
