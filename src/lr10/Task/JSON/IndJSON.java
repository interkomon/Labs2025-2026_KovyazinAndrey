package lr10.Task.JSON;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Iterator;

public class IndJSON {
    private static final String FILE_PATH = "src\\lr10\\Task\\JSON\\songs.json";

    public static void main(String[] args) {
        try {
            System.out.println("Содержимое JSON-файла:");
            printAllSongs();

            addSong("Numb", "Linkin Park", 2003, "Nu Metal", "3:07");

            System.out.println("\nПоиск песен по исполнителю Imagine Dragons:");
            findByArtist("Imagine Dragons");

            removeSongByTitle("Blinding Lights");

            System.out.println("\nСодержимое JSON-файла после изменений:");
            printAllSongs();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static JSONObject loadJson() throws Exception {
        JSONParser parser = new JSONParser();
        return (JSONObject) parser.parse(new FileReader(FILE_PATH));
    }

    private static void saveJson(JSONObject jsonObject) throws Exception {
        try (FileWriter writer = new FileWriter(FILE_PATH)) {
            writer.write(jsonObject.toJSONString());
        }
    }

    public static void printAllSongs() throws Exception {
        JSONObject jsonObject = loadJson();
        JSONArray songs = (JSONArray) jsonObject.get("songs");
        for (Object obj : songs) {
            JSONObject song = (JSONObject) obj;
            printSong(song);
        }
    }

    public static void findByArtist(String artist) throws Exception {
        JSONObject jsonObject = loadJson();
        JSONArray songs = (JSONArray) jsonObject.get("songs");

        for (Object obj : songs) {
            if (obj instanceof JSONObject) {
                JSONObject song = (JSONObject) obj;

                if (artist.equals(String.valueOf(song.get("artist")))) {
                    printSong(song);
                }
            }
        }
    }

    public static void addSong(String title, String artist, int year, String genre, String duration) throws Exception {
        JSONObject jsonObject = loadJson();
        JSONArray songs = (JSONArray) jsonObject.get("songs");
        JSONObject newSong = new JSONObject();
        newSong.put("title", title);
        newSong.put("artist", artist);
        newSong.put("year", year);
        newSong.put("genre", genre);
        newSong.put("duration", duration);
        songs.add(newSong);
        saveJson(jsonObject);
        System.out.println("\nДобавлена песня: " + title);
    }

    public static void removeSongByTitle(String title) throws Exception {
        JSONObject jsonObject = loadJson();
        JSONArray songs = (JSONArray) jsonObject.get("songs");
        Iterator<?> iterator = songs.iterator();
        while (iterator.hasNext()) {
            JSONObject song = (JSONObject) iterator.next();
            if (title.equals(song.get("title"))) {
                iterator.remove();
                saveJson(jsonObject);
                System.out.println("\nУдалена песня: " + title);
                return;
            }
        }
        System.out.println("\nПесня с названием '" + title + "' не найдена.");
    }

    private static void printSong(JSONObject song) {
        System.out.println("Название: " + song.get("title"));
        System.out.println("Исполнитель: " + song.get("artist"));
        System.out.println("Год: " + song.get("year"));
        System.out.println("Жанр: " + song.get("genre"));
        System.out.println("Длительность: " + song.get("duration"));
        System.out.println();
    }
}
