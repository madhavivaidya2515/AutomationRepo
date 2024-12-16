package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementExample {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.manage().window().maximize();

        //sendkeys() method
        WebElement userNameTextBox = driver.findElement(By.xpath("//input[@id='login1']"));
        userNameTextBox.sendKeys("madhavivaidya20@gmail.com");
        System.out.println(userNameTextBox.getTagName());
        System.out.println(userNameTextBox.getAttribute("id"));
        Thread.sleep(1000);

        //clear() method
       /* userNameTextBox.clear();
        Thread.sleep(2000);*/

        //submit() method
       /* WebElement signinBtn = driver.findElement(By.className("signinbtn"));
        signinBtn.submit();*/

        //Thread.sleep(2000);
        driver.close();

    }

}
