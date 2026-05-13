package lr12.Task;


import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) throws InterruptedException {
        int[] array = {45, 12, 78, 3, 91, 25, 64, 7, 100, 56, 34, 89, 11, 67};

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Количество ядер процессора: " + Runtime.getRuntime().availableProcessors());
        System.out.println("Сумма элементов массива: " + findSum(array));
    }

    public static long findSum(int[] array) throws InterruptedException {
        int threadsCount = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[threadsCount];
        long[] localSums = new long[threadsCount];

        for (int i = 0; i < threadsCount; i++) {
            int threadIndex = i;
            int start = i * array.length / threadsCount;
            int end = (i + 1) * array.length / threadsCount;

            threads[i] = new Thread(() -> {
                long localSum = 0;

                for (int j = start; j < end; j++) {
                    localSum += array[j];
                }

                localSums[threadIndex] = localSum;
            });

            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        long sum = 0;
        for (long value : localSums) {
            sum += value;
        }

        return sum;
    }
}

