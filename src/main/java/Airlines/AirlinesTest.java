package Airlines;

import com.fasterxml.jackson.databind.ObjectMapper;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import Airline_Utilities.Airline_DependentFunctions;
import Airline_Utilities.Json_Bodies.Airlines_JsonBodies;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import Airline_Utilities.GenericFunctions;
public class AirlinesTest {

    public static void GetAirlinesDetails()
    {
        Response res = RestAssured.given()
                .baseUri("https://api.instantwebtools.net/v1/airlines")
                .contentType(ContentType.JSON)
                .get().then().extract().response();

        System.out.println("*********************************");
        System.out.println(res);
    }
    @Test

    public static void PostAirline() throws IOException {
        //String name = System.getProperty("user.dir") == "nag"? "Nagendra Kumar" : "Ujji";
        //System.out.println(name);
        Map<String, String> JD_EndPoints = GenericFunctions.ReadJsonFile("EndPoints");
        String BaseURL = JD_EndPoints.get("Airlines_Post");


        String ModifiedBody = Airlines_JsonBodies.JsonBody_AirlinesPost_String("19753","Nagendra Kumar Ujji", "India", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png", "From India", "Bangalore", "www.indianairlines.com", "1990");
        //Map<String, Object> ModifiedBody = Airlines_JsonBodies.JsonBody_AirlinesPost_Map("19753","Nagendra Kumar U", "India", "https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png", "From India", "Bangalore", "www.indianairlines.com", "1990");
        Response r = Airline_DependentFunctions.performpost(BaseURL,ModifiedBody, new HashMap<>());
        System.out.println("************ PostAirLine ************");
        System.out.println(r.asString());
        System.out.println("************ Status Code Validation ************");
        Assert.assertEquals(r.statusCode(),200);
    }
}

