package lr5.Example4;

public class MyClass4 {
    char ch;
    int num;


    MyClass4(int num, char ch) {
        this.num = num;
        this.ch = ch;
    }

    MyClass4(double value){
        int intP = (int) value;
        this.ch = (char) intP;

        int number = (int) (Math.abs(value * 100)) % 100;
        this.num = number;
    }

    void print() {
        System.out.println("ch = "+ ch + "( " + (int) ch + ")  num = "+ num);
    }

}
