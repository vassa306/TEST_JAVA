package Parametrization;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class TestNGParametrizationExcel {
    public static HSSFWorkbook workbook;
    public static HSSFSheet worksheet;
    public static String file_location = "C:\\FileWriting\\readExcel.xls";
    public static DataFormatter formatter = new DataFormatter();
    static String sheetName = "Sheet1";

    public TestNGParametrizationExcel() {


    }


    @Test(dataProvider = "getData")
    public void testData(String name, String password) {
        System.out.println("List of parameters is following: " + name + "---" + password);

    }
            @DataProvider
            public static Object[][] getData () throws IOException {
                FileInputStream fileInputStream = new FileInputStream(file_location); //Excel sheet file location get mentioned here
                HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream); //get my workbook
                worksheet = workbook.getSheet(sheetName);// get my sheet from workbook
                HSSFRow Row = worksheet.getRow(0);   //get my Row which start from 0
                int rowNum = worksheet.getLastRowNum();// count my number of Rows
                int colNum = Row.getLastCellNum(); // get last ColNum

                Object Data[][] = new Object[rowNum - 1][colNum]; // pass my  count data in array
                for (int i = 0; i < rowNum - 1; i++) //Loop work for Row
                {
                    HSSFRow row = worksheet.getRow(i + 1);
                    for (int j = 0; j < colNum; j++) //Loop work for colNum
                    {
                        if (row == null)
                            Data[i][j] = "";
                        else {
                            HSSFCell cell = row.getCell(j);
                            if (cell == null)
                                Data[i][j] = ""; //if it get Null value it pass no data
                            else {
                                String value = formatter.formatCellValue(cell);
                                Data[i][j] = value;
                            }
                        }
                    }
                }

                return Data;
            }
        }





