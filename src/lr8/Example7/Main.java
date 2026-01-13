package lr8.Example7;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        BufferedWriter out = null;

        try {
            // Создание буферизированных символьных потоков для чтения и записи
            br = new BufferedReader(new FileReader("E:\\MyFile1.txt"), 1024);
            out = new BufferedWriter(new FileWriter("E:\\MyFile2.txt"));

            int lineCount = 0;
            String s;

            // Переписывание информации из одного файла в другой
            while ((s = br.readLine()) != null) {
                lineCount++;
                System.out.println(lineCount + ": " + s);
                out.write(s);
                out.newLine();
            }
        } catch (IOException e) {
            System.out.println("Ошибка !!!!!!!");
        } finally {
            br.close();
            out.flush();
            out.close();
        }
    }
}
