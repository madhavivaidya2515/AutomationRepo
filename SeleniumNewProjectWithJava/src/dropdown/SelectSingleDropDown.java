package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectSingleDropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        WebElement dropDown = driver.findElement(By.id("carselect"));

        Select select = new Select(dropDown);

        //select by Index method
        select.selectByIndex(2);
        Thread.sleep(2000);

        //select by value
        select.selectByValue("benz");
        Thread.sleep(2000);

        //select by visible text
        select.selectByVisibleText("BMW");
        Thread.sleep(2000);

       driver.close();

    }
}
