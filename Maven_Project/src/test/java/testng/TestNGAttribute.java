package testng;

import org.testng.annotations.Test;

public class TestNGAttribute {

    @Test(invocationCount = 100,invocationTimeOut = 100)
    public void testNGAttribute(){
        System.out.println("Test invocation Attribute");
    }
}
