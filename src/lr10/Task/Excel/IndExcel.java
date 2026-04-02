package lr10.Task.Excel;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class IndExcel {
    public static void main(String[] args) {
        readExcelFile("src\\lr10\\Task\\Excel\\songs.xlsx", "Песни");
    }

    public static void readExcelFile(String filePath, String sheetName) {
        File file = new File(filePath);
        if (!file.exists()) {
            System.out.println("Ошибка: файл не найден. Проверьте путь: " + filePath);
            return;
        }

        try (FileInputStream inputStream = new FileInputStream(file);
             XSSFWorkbook workbook = new XSSFWorkbook(inputStream)) {

            XSSFSheet sheet = workbook.getSheet(sheetName);
            if (sheet == null) {
                System.out.println("Ошибка: лист '" + sheetName + "' отсутствует в файле.");
                System.out.println("Рекомендация: проверьте название листа и повторно запустите программу.");
                return;
            }

            for (Row row : sheet) {
                for (Cell cell : row) {
                    System.out.print(cell.toString() + "\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Ошибка при чтении Excel-файла: " + e.getMessage());
            System.out.println("Рекомендация: убедитесь, что файл имеет корректный формат XLSX.");
        }
    }
}