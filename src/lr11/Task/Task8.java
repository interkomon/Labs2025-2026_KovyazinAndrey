package lr11.Task;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Task8 {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Random random = new Random();

        System.out.println("\n" + "Исходный список чисел: " + "\n");

        for (int i = 0; i < 10; i++) {
            integers.add(random.nextInt(100));
            System.out.println(integers.get(i));
        }

        List<Integer> integersAfter = filterGreaterNumbers(integers, 50);

        System.out.println("\n" + "Числа больше 50: " + "\n");

        for (Integer i : integersAfter) {
            System.out.println(i);
        }
    }

    public static List<Integer> filterGreaterNumbers(List<Integer> list, int limit) {
        return list.stream()
                .filter(x -> x > limit)
                .collect(Collectors.toList());
    }
}
