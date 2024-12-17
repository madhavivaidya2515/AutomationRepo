package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodExample {

    public static WebDriver driver;

    @BeforeMethod
    public void preRequisite() {
        driver = new ChromeDriver();
    }
    @Test
    public void testScriptForTestNG() {
        driver.navigate().to("https://testng.org/");
        driver.manage().window().maximize();

    }

    @Test
    public void testScriptForFlipkart() {
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void testScriptForFacebook() {
        driver.navigate().to("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void postRequisite(){
        driver.close();
    }

}


