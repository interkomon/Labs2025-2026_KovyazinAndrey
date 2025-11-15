package lr4;

public class Example2 {
    public static void main(String[] args) {
        int figure = 10;
        int i;
        int j;
        int z;

        for (i = 1; i <= figure; i++) {
            System.out.println("номер строки: "+ i + " ");
            z = 0;
            for (j = 0; j < i; j++) {
                z = z + 1;
            }
            System.out.println(" Количество символов в строке "+ z);
        }


    }
}
