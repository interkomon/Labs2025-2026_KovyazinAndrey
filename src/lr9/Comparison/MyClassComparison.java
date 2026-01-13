package lr9.Comparison;

import java.util.*;

public class MyClassComparison {

    private static final int N = 10_000_000;
    private static final long INDEX_TEST_N = 10_000_000_000L;

    public static void main(String[] args) {
        System.out.println("Вариант 10: HashSet, LinkedHashMap, ArrayList");
        System.out.println("Количество элементов в коллекции: " + N);
        System.out.println("Количество элементов для вычисления скорости получения по индексу: " + INDEX_TEST_N);
        System.out.println();

        benchmarkAdd();
        System.out.println();
        benchmarkRemove();
        System.out.println();
        benchmarkGetByIndex();
    }

    private static void benchmarkAdd() {
        System.out.println("Таблица 1. Сравнение времени выполнения операции добавления");
        System.out.println("ArrayList:");
        System.out.println("  в начало коллекции = " + timeArrayListAddAtBeginning() + " мс");
        System.out.println("  в середину коллекции = " + timeArrayListAddAtMiddle() + " мс");
        System.out.println("  в конец коллекции = " + timeArrayListAddAtEnd() + " мс");

        System.out.println("HashSet:");
        System.out.println("  в начало коллекции = не поддерживается");
        System.out.println("  в середину коллекции = не поддерживается");
        System.out.println("  в конец коллекции = не поддерживается");

        System.out.println("LinkedHashMap:");
        System.out.println("  в начало коллекции = не поддерживается");
        System.out.println("  в середину коллекции = не поддерживается");
        System.out.println("  в конец коллекции = не поддерживается");
    }

    private static void benchmarkRemove() {
        System.out.println("Таблица 2. Сравнение времени выполнения операции удаления");
        System.out.println("ArrayList:");
        System.out.println("  в начале коллекции = " + timeArrayListRemoveAtBeginning() + " мс");
        System.out.println("  в середине коллекции = " + timeArrayListRemoveAtMiddle() + " мс");
        System.out.println("  в конце коллекции = " + timeArrayListRemoveAtEnd() + " мс");

        System.out.println("HashSet:");
        System.out.println("  в начале коллекции = не поддерживается");
        System.out.println("  в середине коллекции = не поддерживается");
        System.out.println("  в конце коллекции = не поддерживается");

        System.out.println("LinkedHashMap:");
        System.out.println("  в начале коллекции = не поддерживается");
        System.out.println("  в середине коллекции = не поддерживается");
        System.out.println("  в конце коллекции = не поддерживается");
    }

    private static void benchmarkGetByIndex() {
        System.out.println("Таблица 3. Сравнение времени выполнения операции получения элемента по индексу");
        System.out.println("ArrayList = " + timeArrayListGetByIndex() + " мс");
        System.out.println("HashSet = не поддерживается");
        System.out.println("LinkedHashMap = не поддерживается");
    }

    private static ArrayList<Integer> createArrayList() {
        ArrayList<Integer> list = new ArrayList<>(N);
        for (int i = 0; i < N; i++) {
            list.add(i);
        }
        return list;
    }

    private static long timeArrayListAddAtBeginning() {
        ArrayList<Integer> list = createArrayList();
        long start = System.currentTimeMillis();
        list.add(0, -1);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long timeArrayListAddAtMiddle() {
        ArrayList<Integer> list = createArrayList();
        long start = System.currentTimeMillis();
        list.add(list.size() / 2, -1);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long timeArrayListAddAtEnd() {
        ArrayList<Integer> list = createArrayList();
        long start = System.currentTimeMillis();
        list.add(-1);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long timeArrayListRemoveAtBeginning() {
        ArrayList<Integer> list = createArrayList();
        long start = System.currentTimeMillis();
        list.remove(0);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long timeArrayListRemoveAtMiddle() {
        ArrayList<Integer> list = createArrayList();
        long start = System.currentTimeMillis();
        list.remove(list.size() / 2);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long timeArrayListRemoveAtEnd() {
        ArrayList<Integer> list = createArrayList();
        long start = System.currentTimeMillis();
        list.remove(list.size() - 1);
        long end = System.currentTimeMillis();
        return end - start;
    }

    private static long timeArrayListGetByIndex() {
        ArrayList<Integer> list = createArrayList();
        long start = System.currentTimeMillis();
        int value = list.get(list.size() / 2);
        long end = System.currentTimeMillis();
        if (value == -1) {
            System.out.println("Невозможное значение");
        }
        return end - start;
    }
}