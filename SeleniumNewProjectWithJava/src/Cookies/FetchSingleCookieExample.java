package Cookies;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class FetchSingleCookieExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.tcs.com/");
        driver.manage().window().maximize();

        Cookie adCookie = new Cookie("company","Edso Services");
        driver.manage().addCookie(adCookie);

        System.out.println("//-------------fetch the single Cookie of company------------//");
        driver.manage().getCookieNamed("company");
        Set<Cookie> allCookies1 = driver.manage().getCookies();
        for (Cookie c : allCookies1) {
            System.out.println(c);
        }
        System.out.println("//------------fetch the Cookie of company after delet the Cookie----------");
        driver.manage().deleteCookieNamed("company");

        Set<Cookie> allCookies2 = driver.manage().getCookies();
        for (Cookie c : allCookies2){
            System.out.println(c);
    }
        driver.close();
    }
}
