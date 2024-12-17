package paramiterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NeedOfParameterization {

    @Test
    public void VerifyGoodCourseFun() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement searchTextBox = driver.findElement(By.name("q"));
        searchTextBox.sendKeys("java" + "Delhi");
        searchTextBox.sendKeys(Keys.ENTER);

        Thread.sleep(4000);

        driver.close();
    }
}
