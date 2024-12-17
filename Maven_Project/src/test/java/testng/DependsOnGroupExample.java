package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {

    @Test(groups = "smoke")
    public void verifyPayments(){
        Assert.assertTrue(false);
        System.out.println("verify payments");
    }

    @Test(dependsOnGroups = "smoke")
    public void verifyTrasactions(){
        System.out.println("verify Transactions");
    }

    @Test
    public void verifyDetails(){
        System.out.println("verify Details");
    }
}
