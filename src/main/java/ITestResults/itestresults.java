package ITestResults;

import Reporting_FrameworkLevel.ExtentReportManager;
import org.testng.annotations.Test;

public class itestresults extends itestresult_sample{
    //@Test(priority = 1)
    @Test
    public static void aUnderstanding1() {
        System.out.println("Print Message - 1");
        ExtentReportManager.LogPassDetails("Test Case 'Understanding1' passed");
    }

    //@Test(priority = 2)
    @Test
    public static void cUnderstanding2() {
        System.out.println("Print Message - 2");
        ExtentReportManager.LogPassDetails("Test Case 'Understanding2' passed");
    }
    //@Test(priority = 3)
    @Test
    public static void bUnderstanding3() {
        System.out.println("Print Message - 3");
        ExtentReportManager.LogPassDetails("Test Case 'Understanding3' passed");
    }
    //@Test(priority = 4)
    @Test
    public static void dUnderstanding4() {
        System.out.println("Print Message - 4");
        ExtentReportManager.LogPassDetails("Test Case 'Understanding4' passed");
    }
}
