package timus.task_1494;

import java.io.BufferedInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();

        int n = in.nextInt();
        int[] stack = new int[n];
        int top = -1;
        int nextBall = 1;

        boolean cheater = false;

        for (int i = 0; i < n; i++) {
            int need = in.nextInt();

            while (nextBall <= n && (top == -1 || stack[top] != need)) {
                top++;
                stack[top] = nextBall;
                nextBall++;
            }

            if (top != -1 && stack[top] == need) {
                top--;
            } else {
                cheater = true;
            }
        }

        if (cheater) {
            System.out.println("Cheater");
        } else {
            System.out.println("Not a proof");
        }
    }

    static class FastScanner {
        private final BufferedInputStream input = new BufferedInputStream(System.in);
        private final byte[] buffer = new byte[1 << 16];
        private int len = 0;
        private int ptr = 0;

        private int read() throws IOException {
            if (ptr >= len) {
                len = input.read(buffer);
                ptr = 0;

                if (len <= 0) {
                    return -1;
                }
            }

            return buffer[ptr++];
        }

        int nextInt() throws IOException {
            int c;

            do {
                c = read();
            } while (c <= ' ' && c != -1);

            int value = 0;

            while (c > ' ') {
                value = value * 10 + (c - '0');
                c = read();
            }

            return value;
        }
    }
}