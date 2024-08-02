package Regression;

import Reporting_FrameworkLevel.ExtentReportManager;
import org.junit.Assert;
import org.testng.annotations.Test;

public class Regression_Suite {
    @Test
    public void Regression_Suite_method1 ()
    {
        System.out.println("Executed 'Regression_Suite_method1'");
        //Assert.fail("Intensionally Failed");
        //ExtentReportManager.LogJsonDetails(qrs.getBody());
        ExtentReportManager.LogInfoDetails("Executed 'Regression_Suite_method1'");
        String ScreenshotPath = "C:\\Family\\Nagendra\\2024-06-19\\Intellij Scripts\\API\\API_Framework_FromScratch\\Execution Results\\Sample_Screenshot.png";
        ExtentReportManager.LogScrenshotToExtentReport(ScreenshotPath,"Login Failed");
    }
    @Test
    public void Regression_Suite_method2 ()
    {
        System.out.println("Executed 'Regression_Suite_method2'");
       ExtentReportManager.LogInfoDetails("Executed 'Regression_Suite_method2'");
    }
    @Test
    public void Regression_Suite_method3 ()
    {
        System.out.println("Executed 'Regression_Suite_method3'");
        ExtentReportManager.LogInfoDetails("Executed 'Regression_Suite_method3'");

    }
}
