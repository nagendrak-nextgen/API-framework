package Airlines;

import Airline_Utilities.Json_Bodies.POJO_Airlines_Post;
import Generic_Functions.BaseClass;
import Generic_Functions.Enum_RandomDataTypeNames;
import Generic_Functions.RandomDataGenerator;
import Reporting_FrameworkLevel.AssertionUtils;
import Reporting_FrameworkLevel.ExtentReportManager;
import com.fasterxml.jackson.databind.ObjectMapper;
import groovy.transform.stc.POJO;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import Airline_Utilities.Airline_DependentFunctions;
import Airline_Utilities.Json_Bodies.Airlines_JsonBodies;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import Generic_Functions.GenericFunctions;

public class AirlinesTest {
    @Test(priority = 1)
    public static void GetAirlinesDetails()
    {
        Response res = RestAssured.given()
                .baseUri("https://api.instantwebtools.net/v1/airlines")
                .contentType(ContentType.JSON)
                .get().then().extract().response();

        System.out.println("*********************************");
        System.out.println(res);
        ExtentReportManager.LogInfoDetails("Test Case 'AirlinesTest' executed successfully");
    }
    @Test(priority = 2)

    public static void PostAirline() throws IOException {
        //String name = System.getProperty("user.dir") == "nag"? "Nagendra Kumar" : "Ujji";
        //System.out.println("PostAirline - " + BaseClass.str_FilePath);
        //System.out.println(System.getProperty("FilePath"));

        Map<String, Object> JD_EndPoints = GenericFunctions.ReadJsonFile("EndPoints");
        String BaseURL = (String) JD_EndPoints.get("Airlines_Post");
        //System.out.println("Base URI - " + BaseURL);

       // String ModifiedBody = Airlines_JsonBodies.JsonBody_AirlinesPost_String("19755","UNK", "India", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png", "From India", "Bangalore", "www.indianairlines.com", "1990");
        //Map<String, Object> ModifiedBody = Airlines_JsonBodies.JsonBody_AirlinesPost_Map("19753","Nagendra Kumar U", "India", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png", "From India", "Bangalore", "www.indianairlines.com", "1990");
        //Map<String, Object> ModifiedBody = Airlines_JsonBodies.JsonBody_AirlinesPost_Map();
        //POJO_Airlines_Post ModifiedBody = Airlines_JsonBodies.JsonBody_AirlinesPost_json();
        //POJO_Airlines_Post ModifiedBody = new POJO_Airlines_Post();
        //POJO_Airlines_Post ModifiedBody = POJO_Airlines_Post.builder().name("Nagendra").build();
        // ****** Comment - This Json parsor (with name as 'Nagendra') will fail because this will update only name field and renaining fields will be null
        //To resolve this NULL issue we need change the code in both above line and also in POJO class


        POJO_Airlines_Post ModifiedPayload = new POJO_Airlines_Post().toBuilder().name("Nagendra").country("India").build();
        //String s = new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(ModifiedPayload);
        //System.out.println(s);

        Response r = Airline_DependentFunctions.performpost(BaseURL,ModifiedPayload, new HashMap<>());
        Assert.assertEquals(r.statusCode(),200);

        //Method 1 - to compare the response value on 'name' field
        Assert.assertEquals(r.jsonPath().getString("name"),ModifiedPayload.getName());

        //Method 2 - to compare the response values on all the JSON fields(name, id, country, website etc)
        ObjectMapper om = new ObjectMapper();
        POJO_Airlines_Post POJO_AfterLoadingResponse = om.readValue(r.getBody().asString(),ModifiedPayload.getClass());
        Assert.assertEquals(POJO_AfterLoadingResponse,ModifiedPayload);
    }

    @Test(priority = 3)
    public static void PostAirline_With_DetailedVerificationReport() throws IOException {
        System.out.println("Test 'PostAirline_With_DetailedVerificationReport' is executed");
        String BaseURL = BaseClass.str_BaseURI;
        POJO_Airlines_Post requestPayload = new POJO_Airlines_Post();
        Response res = Airline_DependentFunctions.performpost(BaseURL,requestPayload, new HashMap<>());

        //ObjectMapper om = new ObjectMapper();
        //POJO_Airlines_Post POJO_AfterLoadingResponse = om.readValue(res.getBody().asString(),requestPayload.getClass());
        //Assert.assertEquals(POJO_AfterLoadingResponse,requestPayload);

        Map<String, Object> expectedvalueMap = new HashMap<>();
        expectedvalueMap.put("id", requestPayload.getId());
        expectedvalueMap.put("name", requestPayload.getName());
        expectedvalueMap.put("country", requestPayload.getCountry());
        expectedvalueMap.put("logo", requestPayload.getLogo());
        expectedvalueMap.put("slogan", requestPayload.getSlogan());
        expectedvalueMap.put("head_quaters", requestPayload.getHead_quaters());
        expectedvalueMap.put("website", requestPayload.getWebsite());
        expectedvalueMap.put("established", requestPayload.getEstablished());

        AssertionUtils.assertExpectedValueWithJsonPath(res, expectedvalueMap);

    }

}

