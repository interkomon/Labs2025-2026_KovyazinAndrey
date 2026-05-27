package timus.task_1102;

import java.io.BufferedInputStream;
import java.io.IOException;

public class Main {
    static String[] words = {"out", "output", "puton", "in", "input", "one"};

    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();

        int n = Integer.parseInt(in.next());
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String s = in.next();

            if (isDialog(s)) {
                answer.append("YES\n");
            } else {
                answer.append("NO\n");
            }
        }

        System.out.print(answer);
    }

    private static boolean isDialog(String s) {
        int len = s.length();
        boolean[] dp = new boolean[len + 1];

        dp[0] = true;

        for (int i = 0; i < len; i++) {
            if (!dp[i]) {
                continue;
            }

            for (String word : words) {
                if (matches(s, i, word)) {
                    dp[i + word.length()] = true;
                }
            }
        }

        return dp[len];
    }

    private static boolean matches(String s, int pos, String word) {
        if (pos + word.length() > s.length()) {
            return false;
        }

        for (int i = 0; i < word.length(); i++) {
            if (s.charAt(pos + i) != word.charAt(i)) {
                return false;
            }
        }

        return true;
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

        String next() throws IOException {
            StringBuilder sb = new StringBuilder();
            int c;

            do {
                c = read();
            } while (c <= ' ' && c != -1);

            while (c > ' ') {
                sb.append((char) c);
                c = read();
            }

            return sb.toString();
        }
    }
}
