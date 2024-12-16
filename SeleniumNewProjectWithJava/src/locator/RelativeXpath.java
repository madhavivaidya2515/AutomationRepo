package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //RelativeXpath with attribute value
       /* WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='login1']"));
        userNameTextBox.sendKeys("madhavivaidya20@gmail.com");*/

        //Relative Xpath with text() function
        /*WebElement rediffMailLink = driver.findElement(By.xpath("//a[text()='rediff.com']"));
        rediffMailLink.click();*/

        // xpath with AND /OR attribute
        /*WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='login1' and @name='login']"));
        userNameTextBox.sendKeys("madhavivaidya20@gmail.com");*/

        //Xpath with start function
        WebElement createNewAccount = driver.findElement(By.xpath("//u[starts-with(text(),'Create a')]"));
        createNewAccount.click();

        //for follwing path
        //input[@id='login1']//following::input

        //for amazon app select all lamguage tab
        //input[@type='radio'][2]



        Thread.sleep(2000);
        driver.close();
    }
}
