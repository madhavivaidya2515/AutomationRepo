package alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlertToConfirm {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        driver.findElement(By.id("confirmbtn")).click();

        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);

        System.out.println(alert.getText());
        alert.dismiss();

        Thread.sleep(2000);

        driver.close();

    }
}
