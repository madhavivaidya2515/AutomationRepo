package findelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi"); //find element never throw an exception it will
                                                                  //give you 0 output
        driver.manage().window().maximize();

        List<WebElement> allElements = driver.findElements(By.tagName("input"));

        System.out.println(allElements.size());

        driver.close();

    }
}
