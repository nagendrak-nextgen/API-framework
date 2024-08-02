package Airline_Utilities;

import Reporting_FrameworkLevel.ExtentReportManager;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

import java.util.HashMap;
import java.util.Map;

public class Airline_DependentFunctions
{
    private static RequestSpecification getRequestSpecification(String EndPoint, Object RequestPayLoad, Map<String, Object> headers)
    {
        return RestAssured.given()
                .baseUri(EndPoint)
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(RequestPayLoad);
    }

    private static void printRequestLogInReport(RequestSpecification rs)
    {
        QueryableRequestSpecification qrs = SpecificationQuerier.query(rs);
        ExtentReportManager.LogInfoDetails("Base URI - " + qrs.getBaseUri());
        ExtentReportManager.LogInfoDetails("Methods - " + qrs.getMethod());
        //ExtentReportManager.LogInfoDetails("Headers - " + qrs.getHeaders());
        ExtentReportManager.LogInfoDetails("Request Headers");
        ExtentReportManager.LogTableDetails(qrs.getHeaders().asList());
        //ExtentReportManager.LogInfoDetails("Body - " + qrs.getBody());
        ExtentReportManager.LogInfoDetails("Request Body");
        ExtentReportManager.LogJsonDetails(qrs.getBody());

    }

    private static void printResponseLogInReport(Response response)
    {
        ExtentReportManager.LogInfoDetails("Response Status - " + response.getStatusCode());
        //ExtentReportManager.LogInfoDetails("Headers - " + response.getHeaders());
        ExtentReportManager.LogInfoDetails("Response Headers");
        ExtentReportManager.LogTableDetails(response.getHeaders().asList());
        //ExtentReportManager.LogInfoDetails("Response Body - " + response.getBody().prettyPrint());
        ExtentReportManager.LogInfoDetails("Response Body");
        ExtentReportManager.LogJsonDetails(response.getBody().prettyPrint());
    }
    public static Response performpost(String EndPoint, String RequestPayLoad, HashMap<String, Object> headers)
    {
        /*System.out.println("********** String Function is called **********");
        Response res = RestAssured.given()
                .baseUri(EndPoint)
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(RequestPayLoad).post().then().log().all().statusCode(200).extract().response();
        return res;
        */

        // Above code is commented and re-return below to support extent report

        RequestSpecification rs = getRequestSpecification(EndPoint,RequestPayLoad,headers);
        Response res = rs.post();
        printRequestLogInReport(rs);
        printResponseLogInReport(res);
        return res;
    }

    public static Response performpost(String EndPoint, Map<String, Object> RequestPayLoad, HashMap<String, Object> headers)
    {
       /* System.out.println("********** HashMap Function is called **********");
        Response res = RestAssured.given()
                .baseUri(EndPoint)
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(RequestPayLoad).post().then().log().all().statusCode(200).extract().response();
        return res;
        */

        // Above code is commented and re-return below to support extent report

        RequestSpecification rs = getRequestSpecification(EndPoint,RequestPayLoad,headers);
        Response res = rs.post();
        printRequestLogInReport(rs);
        printResponseLogInReport(res);
        return res;
    }

    public static Response performpost(String EndPoint, Object RequestPayLoad, HashMap<String, Object> headers)
    {
        RequestSpecification rs = getRequestSpecification(EndPoint,RequestPayLoad,headers);
        Response res = rs.post();
        printRequestLogInReport(rs);
        printResponseLogInReport(res);
        return res;
    }
}
