package basicsofselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChromeDriverInitialization {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver(); //upcasting
        //ChromeDriver driver = new ChromeDriver();
        //WebDriver driver = new FirefoxDriver();
        /*ChromeOptions ChromOptions = new ChromeOptions();
        ChromOptions.SetBinary("URL");*/ //this method is for run the test caese in different vrsion of browser

        //WebDriver driver = new EdgeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //String title = driver.getTitle();
        String PageSource = driver.getPageSource();

        System.out.println(PageSource);

        Thread.sleep(1000);

        driver.close();
    }
}
