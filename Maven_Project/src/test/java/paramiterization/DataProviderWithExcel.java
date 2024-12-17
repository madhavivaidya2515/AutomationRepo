package paramiterization;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.FileInputStream;

//public class DataProviderWithExcel {

//    @DataProvider(name = "test-data")
//    public Object[][] dataFun() {
//        Object[][] arrObj = getExcelData()("D:\\rahul\\TestData.xlsx" , sheetName "Testing")
//
//        };
//    }
//
//    public String[][] getExcelData(String filePath,String sheetName){
//        FileInputStream file = new FileInputStream(filePath);
//        XSSFWorkbook wb = new XSSFWorkbook(file);
//        XSSFSheet sheet = wb.getSheet(sheetName);
//        XSSFRow row = sheet.getRow(0);
//        int noOfRows = sheet.getPhysicalNumberOfRows();
//        int noOfCol = row.getLastCellNum();
//
//        Cell cell;
//
//        String[][] data = new String[noOfRows - 1][noOfCol];
//         For (int i = 1 ,i < noOfRow, i++){
//         For(int J = 1 ,j < noOfRow, j++){
//           row = sheet.getRow(i);
//           cell = row.getCell(j);
//           data[i -1][j] = cell.getStringCellValues();
//    }
// }
//  return data;
//  }
//
//    @Test(dataProvider = "test-data")
//    public void VerifyGoodCourseFun(String courseName , String cityName) throws InterruptedException {
//        WebDriver driver = new ChromeDriver();
//        driver.navigate().to("https://www.google.com/");
//        driver.manage().window().maximize();
//
//        WebElement searchTextBox = driver.findElement(By.name("q"));
//        searchTextBox.sendKeys(courseName +"  "+ cityName);
//        searchTextBox.sendKeys(Keys.ENTER);
//
//        Thread.sleep(4000);
//
//        driver.close();
//    }
//}
