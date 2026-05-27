package timus.task_1517;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[][] next;
    static int[] link;
    static int[] length;
    static int size;
    static int last;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String first = br.readLine();
        String second = br.readLine();

        buildAutomaton(first);

        int current = 0;
        int currentLength = 0;
        int bestLength = 0;
        int bestPosition = 0;

        for (int i = 0; i < n; i++) {
            int c = second.charAt(i) - 'A';

            if (next[current][c] != -1) {
                current = next[current][c];
                currentLength++;
            } else {
                while (current != -1 && next[current][c] == -1) {
                    current = link[current];
                }

                if (current == -1) {
                    current = 0;
                    currentLength = 0;
                } else {
                    currentLength = length[current] + 1;
                    current = next[current][c];
                }
            }

            if (currentLength > bestLength) {
                bestLength = currentLength;
                bestPosition = i;
            }
        }

        System.out.println(second.substring(bestPosition - bestLength + 1, bestPosition + 1));
    }

    static void buildAutomaton(String s) {
        int maxStates = s.length() * 2;

        next = new int[maxStates][26];
        link = new int[maxStates];
        length = new int[maxStates];

        for (int i = 0; i < maxStates; i++) {
            Arrays.fill(next[i], -1);
        }

        link[0] = -1;
        size = 1;
        last = 0;

        for (int i = 0; i < s.length(); i++) {
            addCharacter(s.charAt(i) - 'A');
        }
    }

    static void addCharacter(int c) {
        int current = size++;
        length[current] = length[last] + 1;

        int p = last;

        while (p != -1 && next[p][c] == -1) {
            next[p][c] = current;
            p = link[p];
        }

        if (p == -1) {
            link[current] = 0;
        } else {
            int q = next[p][c];

            if (length[p] + 1 == length[q]) {
                link[current] = q;
            } else {
                int clone = size++;

                length[clone] = length[p] + 1;
                link[clone] = link[q];
                next[clone] = next[q].clone();

                while (p != -1 && next[p][c] == q) {
                    next[p][c] = clone;
                    p = link[p];
                }

                link[q] = clone;
                link[current] = clone;
            }
        }

        last = current;
    }
}