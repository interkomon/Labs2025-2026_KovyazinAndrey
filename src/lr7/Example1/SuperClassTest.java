package lr7.Example1;

public class SuperClassTest {
    private String str1;

    SuperClassTest() {

    }

    SuperClassTest(String strEx) {
        this.str1 = strEx;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }

    @Override
    public String toString() {
        return "Class name: " + this.getClass().getSimpleName() + "\n"
                + "str1 = " + this.str1;
    }
}
