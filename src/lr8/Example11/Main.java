package lr8.Example11;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            File dir = new File("E:\\My");
            dir.mkdirs();
            File src = new File("E:\\My\\source.bin");
            File dst = new File("E:\\My\\result.bin");
            src.createNewFile();
            dst.createNewFile();
            Scanner sc = new Scanner(System.in);
            //создаём исходный файл
            DataOutputStream out = new DataOutputStream(new FileOutputStream(src));
            System.out.println("Введите первую строку:");
            String s1 = sc.nextLine();
            System.out.println("Введите вторую строку:");
            String s2 = sc.nextLine();
            out.writeUTF(s1);
            out.writeUTF(s2);
            System.out.println("Введите 5 чисел типа double:");
            for (int i = 0; i < 5; i++) {
                out.writeDouble(sc.nextDouble());
            }
            out.flush();
            out.close();
            // читаем и пишем результат
            DataInputStream in = new DataInputStream(new FileInputStream(src));
            DataOutputStream res = new DataOutputStream(new FileOutputStream(dst));
            String r1 = in.readUTF();
            String r2 = in.readUTF();
            res.writeUTF(r2); // переписываем вторую строку
            for (int i = 0; i < 5; i++) {
                double x = in.readDouble();
                if (x > 0) res.writeDouble(x); // только положительные
            }
            res.flush();
            res.close();
            in.close();
            sc.close();
            System.out.println("Готово.");
            System.out.println("Исходный файл: " + src.getAbsolutePath());
            System.out.println("Результирующий файл: " + dst.getAbsolutePath());

        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        }
    }
}

