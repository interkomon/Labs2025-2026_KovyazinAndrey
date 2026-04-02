package lr10.Task.XML;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class IndXML {
    private static final String FILE_PATH = "src\\lr10\\Task\\XML\\songs.xml";

    public static void main(String[] args) {
        try {
            System.out.println("Содержимое XML-файла:");
            printAllSongs();

            addSong("Numb", "Linkin Park", "2003", "Nu Metal", "3:07");

            System.out.println("\nПоиск песен по исполнителю The Weeknd:");
            findByArtist("The Weeknd");

            System.out.println("\nПоиск песен по году 2017:");
            findByYear("2017");

            removeSongByTitle("Believer");

            System.out.println("\nСодержимое XML-файла после изменений:");
            printAllSongs();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static Document loadDocument() throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
        Document document = builder.parse(new File(FILE_PATH));
        document.getDocumentElement().normalize();
        return document;
    }

    private static void saveDocument(Document document) throws Exception {
        Transformer transformer = TransformerFactory.newInstance().newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.transform(new DOMSource(document), new StreamResult(new File(FILE_PATH)));
    }

    public static void printAllSongs() throws Exception {
        Document document = loadDocument();
        NodeList songs = document.getElementsByTagName("song");
        for (int i = 0; i < songs.getLength(); i++) {
            Element song = (Element) songs.item(i);
            printSong(song);
        }
    }

    public static void addSong(String title, String artist, String year, String genre, String duration) throws Exception {
        Document document = loadDocument();
        Element root = document.getDocumentElement();
        Element song = document.createElement("song");

        Element titleNode = document.createElement("title");
        titleNode.setTextContent(title);
        song.appendChild(titleNode);

        Element artistNode = document.createElement("artist");
        artistNode.setTextContent(artist);
        song.appendChild(artistNode);

        Element yearNode = document.createElement("year");
        yearNode.setTextContent(year);
        song.appendChild(yearNode);

        Element genreNode = document.createElement("genre");
        genreNode.setTextContent(genre);
        song.appendChild(genreNode);

        Element durationNode = document.createElement("duration");
        durationNode.setTextContent(duration);
        song.appendChild(durationNode);

        root.appendChild(song);
        saveDocument(document);
        System.out.println("\nДобавлена песня: " + title);
    }

    public static void findByArtist(String artist) throws Exception {
        Document document = loadDocument();
        NodeList songs = document.getElementsByTagName("song");
        for (int i = 0; i < songs.getLength(); i++) {
            Element song = (Element) songs.item(i);
            String currentArtist = song.getElementsByTagName("artist").item(0).getTextContent();
            if (artist.equalsIgnoreCase(currentArtist)) {
                printSong(song);
            }
        }
    }

    public static void findByYear(String year) throws Exception {
        Document document = loadDocument();
        NodeList songs = document.getElementsByTagName("song");
        for (int i = 0; i < songs.getLength(); i++) {
            Element song = (Element) songs.item(i);
            String currentYear = song.getElementsByTagName("year").item(0).getTextContent();
            if (year.equals(currentYear)) {
                printSong(song);
            }
        }
    }

    public static void removeSongByTitle(String title) throws Exception {
        Document document = loadDocument();
        NodeList songs = document.getElementsByTagName("song");
        for (int i = 0; i < songs.getLength(); i++) {
            Element song = (Element) songs.item(i);
            String currentTitle = song.getElementsByTagName("title").item(0).getTextContent();
            if (title.equalsIgnoreCase(currentTitle)) {
                Node parentNode = song.getParentNode();
                parentNode.removeChild(song);
                saveDocument(document);
                System.out.println("\nУдалена песня: " + title);
                return;
            }
        }
        System.out.println("\nПесня с названием '" + title + "' не найдена.");
    }

    private static void printSong(Element song) {
        System.out.println("Название: " + song.getElementsByTagName("title").item(0).getTextContent());
        System.out.println("Исполнитель: " + song.getElementsByTagName("artist").item(0).getTextContent());
        System.out.println("Год: " + song.getElementsByTagName("year").item(0).getTextContent());
        System.out.println("Жанр: " + song.getElementsByTagName("genre").item(0).getTextContent());
        System.out.println("Длительность: " + song.getElementsByTagName("duration").item(0).getTextContent());
        System.out.println();
    }
}

