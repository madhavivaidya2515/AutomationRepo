package testng;

import org.testng.annotations.Test;

public class SetOwnPriorityExample {

    @Test(priority = 1)
    public void priZ() {
        System.out.println("Priority Z");
    }

    @Test(priority = -2)
    public void priQ() {
        System.out.println("Priority Q");
    }

    @Test(priority = -3)
    public void priM() {
        System.out.println("Priority M");
    }

    @Test(priority = 4)
    public void priB() {
        System.out.println("Priority B");
    }

    @Test(priority = 5)
    public void priA() {
        System.out.println("Priority A");
    }
}


