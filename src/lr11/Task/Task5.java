package lr11.Task;

import java.util.List;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {

        String string = "Java Python JavaScript CSharp Kotlin JavaCore";
        List<String> strings = List.of(string.split(" "));

        System.out.println("\n" + "Исходный список строк: " + "\n");
        for (String e : strings) {
            System.out.println(e);
        }

        List<String> stringsAfter = filterStringsContainingSubstring(strings, "Java");

        System.out.println("\n" + "Строки с подстрокой Java: " + "\n");
        for (String e : stringsAfter) {
            System.out.println(e);
        }
    }

    public static List<String> filterStringsContainingSubstring(List<String> list, String substring) {
        return list.stream()
                .filter(s -> s.contains(substring))
                .collect(Collectors.toList());
    }
}
