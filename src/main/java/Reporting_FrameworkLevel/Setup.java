package Reporting_FrameworkLevel;

import Airline_Utilities.ExtentReportManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestListener;
import org.testng.ITestNGMethod;

import java.util.Arrays;

public class Setup implements ITestListener
{
    private static ExtentReports er;
    public static ThreadLocal<ExtentTest> et = new ThreadLocal<>();
    public static String name = "Nagendra";

    public void onStart(org.testng.ITestContext context)
    {
       String fileName = ExtentReportManager.CreateResultFileNameWithTimeStamp();
       String RestultFullPath = System.getProperty("user.dir") + "\\Execution Results\\" + fileName;
       er = ExtentReportManager.CreateReportInstances(RestultFullPath,"Test API Automation Report","Test Execution Report");
    }
    public void onFinish(org.testng.ITestContext context)
    {
        if (er !=null)
        {
            er.flush();
        }
    }

    public void onTestStart(org.testng.ITestResult result) {
        String TestPackageName = result.getTestClass().getName();
        String TestMethodName = result.getMethod().getMethodName();
        String TestName = "Test Name_" + TestPackageName + "_" + TestMethodName;
        ExtentTest test =  er.createTest(TestName);
        et.set(test);
    }

    public void onTestFailure(org.testng.ITestResult result) {
        ExtentReportManager.LogFailDetails(result.getThrowable().getMessage());
        String FailureDetails = Arrays.toString(result.getThrowable().getStackTrace());
        FailureDetails = FailureDetails.replaceAll(",", "<br>");
        String Formated_FailureDetails = """
                                        "<details>"
                                            "<summary>Click Hear To See Detailed Failure Report </summary>"
                                            %s
                                        "</details>"
                                        """;
        Formated_FailureDetails = String.format(Formated_FailureDetails, FailureDetails);
        ExtentReportManager.LogExceptionDetails(Formated_FailureDetails);

    }
}