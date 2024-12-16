import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class BasicSelenium {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/downloads");
        driver.manage().window().maximize();
        //Thread.sleep(2000);
        driver.close();



    }
}
