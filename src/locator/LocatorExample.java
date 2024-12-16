package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LocatorExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //By the id locator
        /*WebElement userNameTextBox = driver.findElement(By.id("login1"));
        userNameTextBox.sendKeys("madhavivaidya20@gmail.com");*/

        //By the class locator
        /*WebElement signinBtn = driver.findElement(By.className("signinbtn"));
        signinBtn.click();*/

        //By the name locator
      /*  WebElement passwordTextBox = driver.findElement(By.name("passwd"));
        passwordTextBox.sendKeys("madhavivaidya20@gmail.com");*/

        //By the linktext locator
       /* WebElement createNewAccountLink = driver.findElement(By.linkText("Create a new account"));
        createNewAccountLink.click();*/

        //By the partial linktext
       /* WebElement createNewAccountLink = driver.findElement(By.partialLinkText("Create a"));
        createNewAccountLink.click();*/

        //By the tagname
       /* List<WebElement> allTags = driver.findElements(By.tagName("input"));
        System.out.println(allTags.size());*/

        //By the css selector
       /* WebElement userNameTextBox = driver.findElement(By.cssSelector("input[id='login1']"));
        userNameTextBox.sendKeys("madhavivaidya20@gmail.com");*/

        //By the css selector with class attribute
       /* WebElement signinbtn = driver.findElement(By.cssSelector("input.signinbtn"));
        signinbtn.click();*/

        //By the absolute Xpath
       /* WebElement userNameTextBox = driver.findElement(By.xpath());
        userNameTextBox.sendKeys("madhavivaidya20@gmail.com");*/

        //By the relative Xpath


        Thread.sleep(2000);
        driver.close();

    }
}
