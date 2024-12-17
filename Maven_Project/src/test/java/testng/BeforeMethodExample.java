package testng;

import org.openqa.selenium.json.JsonOutput;
import org.testng.annotations.*;
import testng.failscriptexecution.FailScriptExecutor;

public class BeforeMethodExample {

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class Example");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class Example");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    public void test_1(){
        System.out.println("Test 1");
    }

    @Test
    public void test_2(){
        System.out.println("Test 2");
}

    @Test(groups = "smoke")
    public void test_3() {
        System.out.println("Test 3");

    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");}
}
