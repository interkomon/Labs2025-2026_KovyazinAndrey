package lr5.Example2;

public class MyClass2 {
    char start;
    char end;

    public void printRange() {
        char from = start;
        char to = end;


        if(from > to) {
            char temp = from;
            from = to;
            to = temp;
        }

        for(char c = from; c <= to; c++)
        {
            System.out.println(c + " ");
        }

    }
}
