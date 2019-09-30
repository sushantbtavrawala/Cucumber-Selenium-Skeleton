package ExcelReader;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {

    @Test(dataProvider = "test1")
    public void test1(String username, String password, String email)
    {
        System.out.println(username+"|"+password+"|"+email+"|");
    }


    @DataProvider(name="test1")
    public Object[][] getData()
    {
        String projectPath = System.getProperty("user.dir");
        String excelPath = projectPath+"/Excel/LoginDetail.xlsx";

        Object data[][] = testData(excelPath, "Sheet1");
        return data;
    }


    public Object[][] testData(String excelPath, String sheetName)
    {
        ExcelUtils excel = new ExcelUtils(excelPath,sheetName);

        int rowCount = excel.getRowCount();
        int colCount = excel.getColCount();

        Object data[][] = new Object[rowCount-1][colCount];

        for (int i=1;i < rowCount; i++) {
            for(int j=0;j < colCount; j++) {

                String cellData = excel.convertColToString(i,j);
                data[i-1][j] = cellData;
            }
        }
        return data;
    }
}


