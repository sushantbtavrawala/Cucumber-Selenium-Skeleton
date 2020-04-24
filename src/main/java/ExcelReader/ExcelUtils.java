package ExcelReader;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {


    static XSSFWorkbook workbook;
    static XSSFSheet sheet;

// Create a constructor

    public ExcelUtils(String excelPath, String sheetName) {
        try {
            workbook = new XSSFWorkbook(excelPath);
            sheet = workbook.getSheet(sheetName);
        }

        catch (Exception exp)
        {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
    }

    public int getRowCount()  {
        int rowCount =0;

        try {
            rowCount = sheet.getPhysicalNumberOfRows();
            System.out.println("Total Row:"+rowCount);
        }
        catch(Exception exp)
        {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
        return rowCount;
    }

    public int getColCount()  {
        int colCount=0;
        try {
            colCount = sheet.getRow(0).getPhysicalNumberOfCells();
            System.out.println("Total Col:"+colCount);
        }
        catch(Exception exp)
        {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
        return colCount;
    }

    public String convertColToString(int rowNumber, int colNumber)
    {
        String cellDataString=null;
        try{

            if (sheet.getRow(rowNumber).getCell(colNumber).getCellType() == CellType.STRING) {
                cellDataString = sheet.getRow(rowNumber).getCell(colNumber).getStringCellValue();
            } else
                cellDataString = Integer.toString(Double.valueOf(sheet.getRow(rowNumber).getCell(colNumber).getNumericCellValue()).intValue());
        }
        catch(Exception exp)
        {
            System.out.println(exp.getCause());
            System.out.println(exp.getMessage());
            exp.printStackTrace();
        }
        return cellDataString;
    }
}
