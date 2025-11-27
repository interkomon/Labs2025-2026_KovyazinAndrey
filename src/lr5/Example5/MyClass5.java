package lr5.Example5;

public class MyClass5 {
    private int value;

    public MyClass5() {
        setValue();
    }

    public MyClass5(int value) {
        setValue(value);
    }


    public void setValue() {
        this.value = 0;
    }

    public void setValue(int value) {
        if (value > 100) {
            this.value = 100;
        } else {
            this.value = value;
        }
    }

    public int getValue() {
        return value;
    }
}
