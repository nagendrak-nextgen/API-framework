package Smoke;

import org.testng.annotations.Test;

public class Smoke_Suite {
    @Test(priority = 1)
    public void Smoke_Suite_method1 ()
    {
        System.out.println("Executed 'Smoke_Suite_method1'");

    }
    @Test(priority = 2)
    public void Smoke_Suite_method2 ()
    {
        System.out.println("Executed 'Smoke_Suite_method2'");

    }
    @Test(priority = 3)
    public void Smoke_Suite_method3 ()
    {
        System.out.println("Executed 'Smoke_Suite_method3'");
    }
}
