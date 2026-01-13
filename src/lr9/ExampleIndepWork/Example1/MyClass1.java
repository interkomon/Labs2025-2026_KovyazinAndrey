package lr9.ExampleIndepWork.Example1;

public class MyClass1 {
    public static void main(String[] args) {
        System.out.println("Пример 1");
        printSequence(1);

        System.out.println("\n\nПример 2");
        printReverseSequence(1);

        System.out.println("\n\nПример 3");
        traceRecursion(3);

        System.out.println("\nПример 4");
        int n = 5;
        System.out.println("Factorial(" + n + ") = " + factorial(n));

        System.out.println("\nПример 5");
        int fibN = 6;
        System.out.println("Fibonacci(" + fibN + ") = " + fibonacci(fibN));
        System.out.println("Последовательность обхода дерева рекурсивных вызовов:");
        printFibTrace(fibN, 0);
    }

    private static void printSequence(int x) {
        if (x <= 5) {
            System.out.print(x + " ");
            printSequence(x + 1);
        }
    }

    private static void printReverseSequence(int x) {
        if (x <= 5) {
            printReverseSequence(x + 1);
            System.out.print(x + " ");
        }
    }

    private static void traceRecursion(int x) {
        System.out.println("Вызов traceRecursion(" + x + ")");
        if (x > 1) {
            traceRecursion(x - 1);
        }
        System.out.println("Завершение traceRecursion(" + x + ")");
    }

    private static int factorial(int x) {
        if (x <= 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    private static int fibonacci(int x) {
        if (x <= 1) {
            return x;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    private static void printFibTrace(int x, int level) {
        System.out.println(" ".repeat(level * 2) + "fib(" + x + ")");
        if (x > 1) {
            printFibTrace(x - 1, level + 1);
            printFibTrace(x - 2, level + 1);
        }
    }
}

