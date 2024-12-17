package paramiterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    @DataProvider(name = "test-data")
    public Object[][] dataFun() {
        return new Object[][]{
                {"java", "Delhi"}, {"selenium" ,"mumbai"}

    };
}

    @Test(dataProvider = "test-data")
    public void VerifyGoodCourseFun(String courseName , String cityName) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys(courseName +"  "+ cityName);
        searchTextBox.sendKeys(Keys.ENTER);

        Thread.sleep(4000);

        driver.close();
    }
}
