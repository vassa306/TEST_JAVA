package Parametrization;


import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtils {

        public FileInputStream fi;
        public FileOutputStream fo;
        public HSSFWorkbook workbook;
        public HSSFSheet sheet;
        public HSSFRow row;
        public HSSFCell cell;
        public CellStyle style;
        String path;

        ExcelUtils(String path)
        {
            this.path=path;
        }

        public int getRowCount(String sheetName) throws IOException
        {
            fi=new FileInputStream(path);
            workbook=new HSSFWorkbook(fi);
            sheet=workbook.getSheet(sheetName);
            int rowcount=sheet.getLastRowNum();
            workbook.close();
            fi.close();
            return rowcount;
        }

        public int getColumnCount(String sheetname){
            row = sheet.getRow(0);
            if (row == null){
                return -1;
            }
            return row.getLastCellNum();
        }


        public int getCellCount(String sheetName,int rownum) throws IOException
        {
            fi=new FileInputStream(path);
            workbook= new HSSFWorkbook(fi);
            sheet=workbook.getSheet(sheetName);
            row=sheet.getRow(rownum);
            int cellcount=row.getLastCellNum();
            workbook.close();
            fi.close();
            return cellcount;
        }


        public String getCellData(String sheetName,int rownum,int colnum) throws IOException
        {
            fi=new FileInputStream(path);
            workbook= new HSSFWorkbook(fi);
            sheet=workbook.getSheet(sheetName);
            row=sheet.getRow(rownum);
            cell=row.getCell(colnum);

            DataFormatter formatter = new DataFormatter();
            String data;
            try{
                data = formatter.formatCellValue(cell); //Returns the formatted value of a cell as a String regardless of the cell type.
            }
            catch(Exception e)
            {
                e.printStackTrace();
                data="";
            }

            return data;
        }

        public void setCellData(String sheetName,int rownum,int colnum,String data) throws IOException
        {
            File xlfile=new File(path);
            if(!xlfile.exists())    // If file not exists then create new file
            {
                workbook= new HSSFWorkbook();
                fo=new FileOutputStream(path);
                workbook.write(fo);
            }

            fi=new FileInputStream(path);
            workbook= new HSSFWorkbook(fi);

            if(workbook.getSheetIndex(sheetName)==-1) // If sheet not exists then create new Sheet
                workbook.createSheet(sheetName);

            sheet=workbook.getSheet(sheetName);

            if(sheet.getRow(rownum)==null)   // If row not exists then create new Row
                sheet.createRow(rownum);
            row=sheet.getRow(rownum);

            cell=row.createCell(colnum);
            cell.setCellValue(data);
            fo=new FileOutputStream(path);
            workbook.write(fo);
            workbook.close();
            fi.close();
            fo.close();
        }


        public void fillGreenColor(String sheetName,int rownum,int colnum) throws IOException
        {
            fi=new FileInputStream(path);
            workbook= new HSSFWorkbook(fi);
            sheet=workbook.getSheet(sheetName);

            row=sheet.getRow(rownum);
            cell=row.getCell(colnum);

            style=workbook.createCellStyle();

            style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            cell.setCellStyle(style);
            workbook.write(fo);
            workbook.close();
            fi.close();
            fo.close();
        }


        public void fillRedColor(String sheetName,int rownum,int colnum) throws IOException
        {
            fi=new FileInputStream(path);
            workbook= new HSSFWorkbook(fi);
            sheet=workbook.getSheet(sheetName);
            row=sheet.getRow(rownum);
            cell=row.getCell(colnum);

            style=workbook.createCellStyle();

            style.setFillForegroundColor(IndexedColors.RED.getIndex());
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);

            cell.setCellStyle(style);
            workbook.write(fo);
            workbook.close();
            fi.close();
            fo.close();
        }

    }







