package lr12.Task;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {45, 12, 78, 3, 91, 25, 64, 7, 100, 56, 34, 89, 11, 67};

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Количество ядер процессора: " + Runtime.getRuntime().availableProcessors());
        System.out.println("Максимальный элемент массива: " + findMax(array));
    }

    public static int findMax(int[] array) throws InterruptedException {
        if (array.length == 0) {
            throw new IllegalArgumentException("Массив не должен быть пустым");
        }

        int threadsCount = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[threadsCount];
        int[] localMaxValues = new int[threadsCount];

        for (int i = 0; i < threadsCount; i++) {
            int threadIndex = i;
            int start = i * array.length / threadsCount;
            int end = (i + 1) * array.length / threadsCount;

            threads[i] = new Thread(() -> {
                int localMax = Integer.MIN_VALUE;

                for (int j = start; j < end; j++) {
                    if (array[j] > localMax) {
                        localMax = array[j];
                    }
                }

                localMaxValues[threadIndex] = localMax;
            });

            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        int max = localMaxValues[0];
        for (int value : localMaxValues) {
            if (value > max) {
                max = value;
            }
        }

        return max;
    }
}

