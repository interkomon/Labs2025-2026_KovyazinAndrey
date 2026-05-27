package lr13.Examples;

public class Example2 {
    public static void main(String[] args) {
        try {
            System.out.println("0");
            generateException();
            System.out.println("1");
        } catch (Exception e) {
            System.out.println("2 " + e);
        }
        System.out.println("3");
    }

    private static void generateException() {
        throw new RuntimeException("Непроверяемая ошибка");
    }
}