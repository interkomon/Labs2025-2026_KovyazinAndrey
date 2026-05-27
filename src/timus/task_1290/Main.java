package timus.task_1290;

import java.io.BufferedInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();

        int n = in.nextInt();
        int[] count = new int[25001];

        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            count[x]++;
        }

        StringBuilder result = new StringBuilder();

        for (int i = 25000; i >= 1; i--) {
            for (int j = 0; j < count[i]; j++) {
                result.append(i).append('\n');
            }
        }

        System.out.print(result);
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
