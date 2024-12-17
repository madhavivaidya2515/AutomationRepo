package testing.Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void VerifySoftAsserExample() {
        SoftAssert softAssert = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement element = driver.findElement(By.id("bmwradio"));
        WebElement textbox  = driver.findElement(By.id("enabled-example-input"));

        Assert.assertFalse(element.isDisplayed(), "radio btn should displpay");
        Assert.assertFalse(textbox.isDisplayed(), "text box should display");
        softAssert.assertEquals(driver.getTitle(), "Practice page", "Practice page text should be display");
        softAssert.assertAll();
        driver.close();

    }
}


