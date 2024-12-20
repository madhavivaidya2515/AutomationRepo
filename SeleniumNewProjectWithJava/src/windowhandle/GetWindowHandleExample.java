package windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetWindowHandleExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        String windowId = driver.getWindowHandle();
        Thread.sleep(2000);

        System.out.println(windowId);

        driver.findElement(By.id("openwindow")).click();

        Set<String> allwindow = driver.getWindowHandles();
        System.out.println(allwindow);

        driver.quit();
    }
}
