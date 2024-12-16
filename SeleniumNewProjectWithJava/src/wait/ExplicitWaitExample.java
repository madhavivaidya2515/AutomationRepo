package wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement firstAdElement = driver.findElement(By.xpath("//button[@title()='Close']"));
        wait.until(ExpectedConditions.elementToBeClickable(firstAdElement)).click();
        driver.close();
    }
}

