package testng;

import org.testng.annotations.Test;

public class PriorityExample {

    @Test
    public void priZ() {
        System.out.println("Priority Z");
    }

    @Test
    public void priQ() {
        System.out.println("Priority Q");
    }

    @Test
    public void priM() {
        System.out.println("Priority M");
    }

    @Test
    public void priB() {
        System.out.println("Priority B");
    }

    @Test
    public void priA() {
        System.out.println("Priority A");
    }
}


