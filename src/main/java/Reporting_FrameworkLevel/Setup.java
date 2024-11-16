package Reporting_FrameworkLevel;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestListener;

import java.io.File;
import java.sql.SQLOutput;
import java.util.Arrays;

public class Setup implements ITestListener
{
    private static ExtentReports er;
    public static ThreadLocal<ExtentTest> et = new ThreadLocal<>();
    public static String name = "Nagendra";

    public void onStart(org.testng.ITestContext context)
    {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String datetime = ExtentReportManager.CreateResultFileNameWithTimeStamp();
       String fileName = "TestReport_" + datetime + ".html";
       String ResultFolderPath = System.getProperty("user.dir") + "\\Execution Results\\Result_" + datetime;
       String Result_ScreenshotPath = ResultFolderPath + "\\Screenshots";
        File f = new File(Result_ScreenshotPath);
        f.mkdirs();
       String RestultFilePath = ResultFolderPath + "\\" + fileName;
        System.out.println("Time Stamp - " + datetime);
        //readingPropertyFile rpf = new readingPropertyFile();
        //readPropertyFiledata("executionname");
        //System.getProperty("executionname");

       er = ExtentReportManager.CreateReportInstances(RestultFilePath,"Test API Automation Report","Test Execution Report");

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
        //String TestName = "Test Name_" + TestPackageName + "_" + TestMethodName;
        String TestName = TestMethodName;
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