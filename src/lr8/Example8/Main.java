package lr8.Example8;

import java.io.*;
import java.net.URL;

class InConvertInText {
    public static void readAllByByte(Reader in) throws IOException {
        while (true) {
            int oneByte = in.read(); // читаем 1 байт
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "конец ");
                break;
            }
        }
    }
}
public class Main {
    public static void main(String[] args) {
        try {
            // С потоком связан файл
            InputStream inFile = new FileInputStream("E:\\MyFile1.txt");
            Reader rFile = new InputStreamReader(inFile, "cp1251");
            InConvertInText.readAllByByte(rFile);
            System.out.print("\n\n");
            inFile.close();
            rFile.close();
            // С потоком связана интернет-страница
            InputStream inUrl = new URL("http://google.com").openStream();
            Reader rUrl = new InputStreamReader(inUrl, "cp1251");
            InConvertInText.readAllByByte(rUrl);
            System.out.print("\n\n");
            inUrl.close();
            rUrl.close();

            // С потоком связан массив символов byte
            InputStream inArray = new ByteArrayInputStream(new byte[]{5, 8, 3, 9, 11});
            Reader rArray = new InputStreamReader(inArray, "cp1251");
            InConvertInText.readAllByByte(rArray);
            System.out.print("\n\n");
            inArray.close();
            rArray.close();

        } catch (IOException e) {
            System.out.println("Ошибка: " + e);
        }
    }
}

