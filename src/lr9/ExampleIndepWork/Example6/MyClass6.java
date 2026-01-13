package lr9.ExampleIndepWork.Example6;

import java.util.HashMap;
import java.util.Map;

public class MyClass6 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "apple");
        map.put(1, "banana");
        map.put(2, "kiwi");
        map.put(3, "orange");
        map.put(4, "melon");
        map.put(5, "grape");
        map.put(6, "apricot");
        map.put(7, "plum");
        map.put(8, "cherry");
        map.put(9, "lemon");

        System.out.println("Исходный HashMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        System.out.println("\nСтроки, у которых ключ > 5:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                System.out.println(entry.getValue());
            }
        }

        System.out.println("\nСтрока при ключе = 0:");
        StringBuilder zeroKeyValues = new StringBuilder();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() == 0) {
                if (zeroKeyValues.length() > 0) {
                    zeroKeyValues.append(", ");
                }
                zeroKeyValues.append(entry.getValue());
            }
        }
        System.out.println(zeroKeyValues);

        long product = 1;
        boolean found = false;
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getValue().length() > 5) {
                product *= entry.getKey();
                found = true;
            }
        }

        System.out.println("\nПроизведение всех ключей, где длина строки > 5:");
        if (found) {
            System.out.println(product);
        } else {
            System.out.println("Таких элементов нет");
        }
    }
}

