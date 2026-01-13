package lr8.Example5;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите имя файла => ");
        String fname = sc.nextLine();

        try {
            // Создается файл
            File fl = new File(fname);
            fl.createNewFile();    // файл создан

            System.out.println("Полный путь файла: " + fl.getAbsolutePath());

            System.out.print("Введите количество строк для записи в файл => ");
            int n = sc.nextInt();

            DataOutputStream dOut = new DataOutputStream(new FileOutputStream(fl));
            sc.nextLine();    // очистка буфера
            for (int i = 0; i < n; i++) {
                System.out.print("Введите строку для записи в файл => ");
                String s = sc.nextLine();
                dOut.writeUTF(s);
            }
            dOut.flush();
            dOut.close();

            // Чтение и вывод данных из созданного файла
            DataInputStream din = new DataInputStream(new FileInputStream(fl));
            while (true) {
                System.out.println(din.readUTF());
            }
        } catch (EOFException e) {
            // Конец файла
        } catch (Exception e) {
            System.out.println("" + e);
        }
    }
}
