package testing.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void VerifyHardAssertExample(){
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("bmwradio"));
        WebElement textbox = driver.findElement(By.id("enabled-example-input"));

        Assert.assertFalse(element.isDisplayed(),"radio btn should displpay");
        Assert.assertTrue(element.isDisplayed(),"text box should display");

        driver.close();
    }
}
