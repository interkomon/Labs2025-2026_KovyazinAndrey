package lr9.ExampleIndepWork.Example7;

import java.util.LinkedList;
import java.util.List;

public class MyClass7LinkedList {
    public static void main(String[] args) {
        int n = 10;
        int winner = findWinner(n);
        System.out.println("LinkedList. При N = " + n + " остается человек № " + winner);
    }

    public static int findWinner(int n) {
        List<Integer> people = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            people.add(i);
        }

        int index = 0;
        while (people.size() > 1) {
            index = (index + 1) % people.size();
            people.remove(index);
        }

        return people.get(0);
    }
}
