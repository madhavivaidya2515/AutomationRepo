package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropDown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.letskodeit.com/practice");
        driver.manage().window().maximize();

        Thread.sleep(1000);

        WebElement dropDown = driver.findElement(By.id("multiple-select-example"));

        Select select = new Select(dropDown);


        //deselect by Index method
        select.deselectByIndex(2);
        Thread.sleep(2000);

        //deselect by value
        select.deselectByValue("Orange");
        Thread.sleep(2000);


        //deselect by visible text
        select.deselectByVisibleText("Apple");
        Thread.sleep(2000);

       /* List<WebElement> allElements = select.getAllSelectedOptions();
        for (WebElement e : allElements){
            System.out.println(e.getText());
        }*/

        driver.close();
    }
}
