package lr8.Example10;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter out = null;
        try {
            // Создание потоков
            br = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("E:\\MyFile1.txt"), "cp1251"));

            out = new PrintWriter("E:\\MyFile2.txt", "cp1251");
            // Переписывание информации из одного файла в другой
            int lineCount = 0;
            String s;

            while ((s = br.readLine()) != null) {
                lineCount++;
                out.println(lineCount + ": " + s);
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!");
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            out.flush();
            out.close();
        }
    }
}
