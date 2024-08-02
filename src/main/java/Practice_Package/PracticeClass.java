package Practice_Package;

import Reporting_FrameworkLevel.ExtentReportManager;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.SpecificationQuerier;
import org.testng.annotations.Test;

import java.io.File;

public class PracticeClass {
    //public static void main(String[] args) {
    @Test
    public void abcd() {

        ExtentReportManager.LogInfoDetails("Sample Script Execution Started");
        String ScreenshotPath = "C:\\Family\\Nagendra\\2024-06-19\\Intellij Scripts\\API\\API_Framework_FromScratch\\Execution Results\\Sample_Screenshot.png";
        ExtentReportManager.LogScrenshotToExtentReport(ScreenshotPath,"Login Failed");
        //File f = new File("C:\\Family\\Nagendra\\2024-06-19\\Intellij Scripts\\API\\API_Framework_FromScratch\\Sample Folder");
        //f.mkdirs();
        System.out.println("Practice Class Execution done");
    }
}
