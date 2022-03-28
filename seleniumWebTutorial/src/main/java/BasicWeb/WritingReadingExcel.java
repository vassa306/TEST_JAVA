package BasicWeb;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingReadingExcel {
    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet0 = workbook.createSheet("FirstSheet");
    Row row0 = sheet0.createRow(0);
    Cell cellA = row0.createCell(0);
    Cell cellB = row0.createCell(1);




}
