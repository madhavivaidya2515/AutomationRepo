package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.flipkart.com/");
        driver.manage().window().maximize();

        WebElement loginElement = driver.findElement(By.xpath("//span[text()='login']"));

        Actions actions = new Actions(driver);
        actions.moveToElement(loginElement)
                .pause(3000)
                .perform();

        driver.close();
    }
}
