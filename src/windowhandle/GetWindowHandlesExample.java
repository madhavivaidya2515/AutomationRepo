package windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetWindowHandlesExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        String windowId = driver.getWindowHandle();
        Thread.sleep(2000);
        System.out.println(windowId);
        driver.findElement(By.id("openwindow")).click();
        Set<String> allwindow = driver.getWindowHandles();
        for (String s : allwindow){
            if(!s.equals(windowId)){
                driver.switchTo().window(s);
                Thread.sleep(2000);
                driver.findElement(By.linkText("INTERVIEW")).click();
                Thread.sleep(2000);
                System.out.println(driver.getTitle());
                driver.close();
            }
        }


        driver.switchTo().window(windowId);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
