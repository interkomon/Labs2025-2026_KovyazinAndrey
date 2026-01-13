package lr8.Example12;

import java.io.*;
import java.util.Scanner;

public class Main {
    static boolean isRussianVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'а' || c == 'е' || c == 'ё' || c == 'и' || c == 'о' ||
                c == 'у' || c == 'ы' || c == 'э' || c == 'ю' || c == 'я';
    }
    static boolean isRussianLetter(char c) {
        c = Character.toLowerCase(c);
        return (c >= 'а' && c <= 'я') || c == 'ё';
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите путь к исходному текстовому файлу (UTF-8): ");
        String inPath = sc.nextLine();
        System.out.print("Введите путь к результирующему файлу (UTF-8): ");
        String outPath = sc.nextLine();
        sc.close();
        BufferedReader br = null;
        PrintWriter pw = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(inPath), "UTF-8"));
            pw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(outPath), "UTF-8"));
            String line;
            int lineNum = 0;
            while ((line = br.readLine()) != null) {
                lineNum++;

                String[] words = line.split("\\s+");
                int count = 0;
                pw.print(lineNum + ": ");
                for (int i = 0; i < words.length; i++) {
                    String w = words[i].replaceAll("[^А-Яа-яЁё]", "");
                    if (w.length() == 0) continue;

                    char first = w.charAt(0);
                    if (isRussianLetter(first) && !isRussianVowel(first)) {
                        if (count > 0) pw.print(" ");
                        pw.print(w);
                        count++;
                    }
                }
                pw.println(" (количество: " + count + ")");
            }
            System.out.println("Готово: " + outPath);
        } catch (Exception e) {
            System.out.println("Ошибка: " + e);
        } finally {
            try {
                if (br != null) br.close();
                if (pw != null) {
                    pw.flush();
                    pw.close();
                }
            } catch (IOException e) {
                System.out.println("Ошибка закрытия: " + e);
            }
        }
    }
}

