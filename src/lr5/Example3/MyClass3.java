package lr5.Example3;

public class MyClass3 {
    int a;
    int b;

    MyClass3(){
        a = 0;
        b = 0;
    }

    MyClass3(int value) {
         a = value;
         b = value;
    }
    MyClass3(int a, int b)
    {
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.println("a = " + a + "b = " + b);
    }


}
