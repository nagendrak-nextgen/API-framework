package ITestResults;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class itestresult_sample {
    @BeforeMethod
    public static void printthecalledtestname_before(ITestResult res) {
        System.out.println(res.getMethod().getMethodName().toUpperCase() + " - is Executing");
    }

    @AfterMethod
    public static void printthecalledtestname_after(ITestResult res) {
        System.out.println(res.getMethod().getMethodName().toUpperCase() + " - EXECUTED");
        /*System.out.println("GetName - " + res.getName());
        System.out.println("GetInstanceName - " + res.getInstanceName());
        System.out.println("GetClass - " + res.getClass());
        System.out.println("GetTestClass - " + res.getTestClass());
        System.out.println("GetStatus - " + res.getStatus());
        System.out.println("GetTestName - " + res.getTestName());*/
    }
}
