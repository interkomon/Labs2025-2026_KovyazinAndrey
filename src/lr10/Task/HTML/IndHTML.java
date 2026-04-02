package lr10.Task.HTML;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class IndHTML {
    private static final String URL = "http://fat.urfu.ru/index.html";
    private static final String OUTPUT_FILE = "src\\lr10\\Task\\HTML";

    public static void main(String[] args) {
        int attempts = 0;
        while (attempts < 3) {
            try {
                Document doc = Jsoup.connect(URL).get();
                Elements titles = doc.getElementsByClass("blocktitle");
                Elements dates = doc.getElementsByClass("blockdate");

                try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
                    int count = Math.min(titles.size(), dates.size());
                    for (int i = 0; i < count; i++) {
                        String title = titles.get(i).text();
                        String date = dates.get(i).text();
                        writer.write("Тема: " + title);
                        writer.newLine();
                        writer.write("Дата: " + date);
                        writer.newLine();
                        writer.newLine();
                    }
                }

                System.out.println("Данные успешно сохранены в файл " + OUTPUT_FILE);
                return;
            } catch (IOException e) {
                attempts++;
                System.out.println("Ошибка при получении HTML-кода страницы. Попытка " + attempts);
                if (attempts == 3) {
                    System.out.println("Не удалось подключиться к сайту после нескольких попыток.");
                }
            }
        }
    }
}
