package lr7.Example2;

public class SubClass2 extends SuperClass2 {
    public int number;

    // конструктор подкласса с двумя параметрами
    SubClass2(String t, int n) {
        super(t);
        number = n;
    }



    // без параметров
    public void setValue() {
        setText("Пусто");
        number = 0;
    }

    // с текстовым параметром
    public void setValue(String t) {
        setText(t);
    }

    // с целочисленным параметром
    public void setValue(int n) {
        number = n;
    }

    //  с текстовым и целочисленным параметром
    public void setValue(String t, int n) {
        setText(t);
        number = n;
    }

    // с целочисленным и текстовым параметром
    public void setValue(int n, String t) {
        number = n;
        setText(t);
    }

    public void print() {
        System.out.println("text = " + getText() + ", number = " + number);
    }
}
