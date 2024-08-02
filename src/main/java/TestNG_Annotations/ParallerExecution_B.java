package TestNG_Annotations;

import org.testng.annotations.Test;

public class ParallerExecution_B {
    @Test (priority = 1)
    public void Paraller_Execution_B_Medhod1 () throws InterruptedException {
        System.out.println("Executed 'Paraller_Execution_B_Medhod1 START'");
        Thread.sleep(2000);
        System.out.println("Executed 'Paraller_Execution_B_Medhod1 STOP'");
    }
    @Test (priority = 2)
    public void Paraller_Execution_B_Medhod2 () throws InterruptedException {
        System.out.println("Executed 'Paraller_Execution_B_Medhod2 START'");
        Thread.sleep(2000);
        System.out.println("Executed 'Paraller_Execution_B_Medhod2 STOP'");
    }
    @Test (priority = 3)
    public void Paraller_Execution_B_Medhod3 () throws InterruptedException {
        System.out.println("Executed 'Paraller_Execution_B_Medhod3 START'");
        Thread.sleep(2000);
        System.out.println("Executed 'Paraller_Execution_B_Medhod3 STOP'");
    }
}
