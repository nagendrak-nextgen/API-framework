package Airline_Utilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

public class Airline_DependentFunctions
{
    public static Response performpost(String EndPoint, String RequestPayLoad, HashMap<String, String> headers)
    {
        System.out.println("********** String Function is called **********");
        Response res = RestAssured.given()
                .baseUri(EndPoint)
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(RequestPayLoad).post().then().log().all().statusCode(200).extract().response();
        return res;
    }

    public static Response performpost(String EndPoint, Map<String, Object> RequestPayLoad, HashMap<String, String> headers)
    {
        System.out.println("********** HashMap Function is called **********");
        Response res = RestAssured.given()
                .baseUri(EndPoint)
                .headers(headers)
                .contentType(ContentType.JSON)
                .body(RequestPayLoad).post().then().log().all().statusCode(200).extract().response();
        return res;
    }
}
