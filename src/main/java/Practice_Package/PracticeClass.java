package Practice_Package;

import Reporting_FrameworkLevel.ExtentReportManager;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.SpecificationQuerier;
import org.testng.ITestContext;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;

public class PracticeClass {
    //public static void main(String[] args) {

    public void abcd() {

        ExtentReportManager.LogInfoDetails("Sample Script Execution Started");
        String ScreenshotPath = "C:\\Family\\Nagendra\\2024-06-19\\Intellij Scripts\\API\\API_Framework_FromScratch\\Execution Results\\Sample_Screenshot.png";
        ExtentReportManager.LogScrenshotToExtentReport(ScreenshotPath,"Login Failed");
        //File f = new File("C:\\Family\\Nagendra\\2024-06-19\\Intellij Scripts\\API\\API_Framework_FromScratch\\Sample Folder");
        //f.mkdirs();
        System.out.println("Practice Class Execution done");
    }

    @Test(groups = {"smoke","regression","browgroup1"})
    public void atempmethod1(ITestContext itc) {
        int len = itc.getAllTestMethods().length;
        System.out.println("Executed Test 'tempmethod1' from 'PracticeClass' class and 'Practive_Package' package");
        String[] gnames= itc.getAllTestMethods()[0].getGroups();
        for(String x:gnames)
        {
            System.out.println(x);
        }


    }

    @Test(groups = {"smoke","regression","browgroup2"})
    public void ctempmethod2(ITestContext itc) {
        int len = itc.getAllTestMethods().length;
        System.out.println("Executed Test 'tempmethod2' from 'PracticeClass' class and 'Practive_Package' package");
        String[] gnames= itc.getAllTestMethods()[0].getGroups();
        for(String x:gnames)
        {
            System.out.println(x);
        }
    }

    @Test(groups = {"sanity"})
    public void btempmethod3(ITestContext itc) {
        int len = itc.getAllTestMethods().length;
        System.out.println("Executed Test 'tempmethod3' from 'PracticeClass' class and 'Practive_Package' package");
        String[] gnames= itc.getAllTestMethods()[0].getGroups();
        for(String x:gnames)
        {
            System.out.println(x);
        }
    }
}
