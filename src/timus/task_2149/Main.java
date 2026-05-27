package timus.task_2149;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = Integer.parseInt(in.nextLine());

        String line1 = in.nextLine();
        in.nextLine();
        in.nextLine();

        char[] pigeons = new char[n];

        for (int i = 0; i < n; i++) {
            int pos = i * 5;

            if (line1.charAt(pos) == '<') {
                pigeons[i] = 'L';
            } else {
                pigeons[i] = 'R';
            }
        }

        int answer = n;

        answer = Math.min(answer, countHalf(pigeons, 'L', 'R'));
        answer = Math.min(answer, countHalf(pigeons, 'R', 'L'));

        answer = Math.min(answer, countParity(pigeons, 'L', 'R'));
        answer = Math.min(answer, countParity(pigeons, 'R', 'L'));

        System.out.println(answer);
    }

    private static int countHalf(char[] pigeons, char leftDirection, char rightDirection) {
        int n = pigeons.length;
        int count = 0;

        for (int i = 0; i < n; i++) {
            char need;

            if (i < n / 2) {
                need = leftDirection;
            } else {
                need = rightDirection;
            }

            if (pigeons[i] != need) {
                count++;
            }
        }

        return count;
    }

    private static int countParity(char[] pigeons, char oddDirection, char evenDirection) {
        int count = 0;

        for (int i = 0; i < pigeons.length; i++) {
            char need;

            if ((i + 1) % 2 == 1) {
                need = oddDirection;
            } else {
                need = evenDirection;
            }

            if (pigeons[i] != need) {
                count++;
            }
        }

        return count;
    }
}
