package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class ClickAndHoldExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
        driver.manage().window().maximize();

        WebElement elementA = driver.findElement(By.xpath("//li[text()='A']"));

        Actions actions = new Actions(driver);
        actions.clickAndHold(elementA)
                .pause(Duration.ofSeconds(10))
                .release(elementA)
                .build()
                .perform();

        Thread.sleep(2000);

        driver.close();
    }
}
