package lr5.Example1;

class MyClass1 {
    private char ch;


    public void setChar(char c) {
        ch = c;
    }


    public int getCharCode() {
        return ch;
    }

    public void printInfo() {
        System.out.println("Символ: " + ch + ", код: " + (int)ch);
    }
}
