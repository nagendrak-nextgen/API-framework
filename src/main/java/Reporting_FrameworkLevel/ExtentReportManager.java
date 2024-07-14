package Airline_Utilities;

import Reporting_FrameworkLevel.Setup;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.markuputils.CodeLanguage;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.restassured.http.Header;

import java.text.Format;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ExtentReportManager
{
    public static ExtentReports er;
    public static ExtentReports CreateReportInstances(String ResultFileFullPath, String reportName, String documentTitle)
    {
        //URL for Reference - https://extentreports.com/docs/versions/4/java/

        ExtentSparkReporter esr = new ExtentSparkReporter(ResultFileFullPath);
        esr.config().setReportName(reportName);
        esr.config().setDocumentTitle(documentTitle);
        esr.config().setTheme(Theme.DARK);
        esr.config().setEncoding("Utf-8");
        er = new ExtentReports();
        er.attachReporter(esr);
        return er;

    }
    public static String CreateResultFileNameWithTimeStamp()
    {
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("yyyy_MM_dd_mm_ss");
        LocalDateTime ldt = LocalDateTime.now();
        String FormatedTime = dateTimeFormat.format(ldt);
        return "TestReport_" + FormatedTime + ".html";
    }

    public static void LogPassDetails(String log)
    {
        Setup.et.get().pass(MarkupHelper.createLabel(log, ExtentColor.GREEN));
    }

    public static void LogFailDetails(String log)
    {
        Setup.et.get().fail(MarkupHelper.createLabel(log, ExtentColor.RED));
    }

    public static void LogExceptionDetails(String log)
    {
        Setup.et.get().fail(log);
    }

    public static void LogInfoDetails(String log)
    {
        Setup.et.get().info(MarkupHelper.createLabel(log, ExtentColor.BLACK));
    }

    public static void LogWarningDetails(String log)
    {
        Setup.et.get().warning(MarkupHelper.createLabel(log, ExtentColor.ORANGE));
    }

    public static void LogJsonDetails(String Json)
    {
        Setup.et.get().info(MarkupHelper.createCodeBlock(Json, CodeLanguage.JSON));
    }

    public static void LogTableDetails(List<Header> HeadersList)
    {
        String[][] arrHeaders = HeadersList.stream().map(header -> new String[] {header.getName(),header.getValue()})
                        .toArray(String[][] :: new);
        Setup.et.get().info(MarkupHelper.createTable(arrHeaders));
    }}
