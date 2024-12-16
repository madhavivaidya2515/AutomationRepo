package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledDesabledExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        WebElement textBox = driver.findElement(By.id("enabled-example-input"));
        WebElement enabledBtn = driver.findElement(By.id("enabled-button"));
        WebElement disabledBtn = driver.findElement(By.id("disabled-button"));

        System.out.println(textBox.isEnabled()); //true
        disabledBtn.click();
        System.out.println(textBox.isEnabled()); //false
        enabledBtn.click();
        System.out.println(textBox.isEnabled()); //true

        driver.close();

    }
}
