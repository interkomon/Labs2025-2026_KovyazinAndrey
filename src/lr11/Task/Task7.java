package lr11.Task;

import java.util.List;
import java.util.stream.Collectors;

public class Task7 {
    public static void main(String[] args) {

        String string = "кот автомобиль дом университет Java программирование";
        List<String> strings = List.of(string.split(" "));

        System.out.println("\n" + "Исходный список строк: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterLongStrings(strings, 5);

        System.out.println("\n" + "Строки длиной больше 5: " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterLongStrings(List<String> list, int minLength) {
        return list.stream()
                .filter(s -> s.length() > minLength)
                .collect(Collectors.toList());
    }
}
