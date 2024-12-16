package screenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class ScreenshotDemoExample {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.tcs.com/");
        driver.manage().window().maximize();

        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(f,new File("E:\\screenshots(319).png"));
        driver.close();

    }
}
