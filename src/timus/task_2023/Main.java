package timus.task_2023;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String[] letters = new String[n];

        for (int i = 0; i < n; i++) {
            letters[i] = sc.nextLine();
        }

        String[] sorted = letters.clone();
        Arrays.sort(sorted);
        int[] order = new int[n];
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (sorted[j].equals(letters[i])) {
                    order[i] = j;
                    break;
                }
            }
        }
        int current = order[0];
        int ans = 0;

        for (int i = 1; i < n; i++) {
            int next = order[i];
            int diff = Math.abs(next - current);
            ans += Math.min(diff, n - diff);
            current = next;
        }

        System.out.println(ans);
    }
}