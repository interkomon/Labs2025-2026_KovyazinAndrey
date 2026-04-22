package lr11.Task;

import java.util.List;
import java.util.stream.Collectors;

public class Task9 {
    public static void main(String[] args) {

        String string = "Java Hello123 Привет test! StreamAPI код";
        List<String> strings = List.of(string.split(" "));

        System.out.println("\n" + "Исходный список строк: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterOnlyLetters(strings);

        System.out.println("\n" + "Строки, содержащие только буквы: " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterOnlyLetters(List<String> list) {
        return list.stream()
                .filter(s -> s.matches("[a-zA-Zа-яА-Я]+"))
                .collect(Collectors.toList());
    }
}
