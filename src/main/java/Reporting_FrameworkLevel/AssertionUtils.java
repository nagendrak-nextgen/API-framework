package Reporting_FrameworkLevel;

import Airline_Utilities.ExtentReportManager;
import Airline_Utilities.Json_Bodies.POJO_AssertionKeys;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import io.restassured.response.Response;

import javax.swing.text.html.Option;
import java.util.*;

public class AssertionUtils {
    public static void assertExpectedValueWithJsonPath(Response res, Map<String, Object> expectedValueMap) {
        List<POJO_AssertionKeys> actualValueMap = new ArrayList<>();
        actualValueMap.add(new POJO_AssertionKeys("JSON_PATH","EXPECTED_VALUE","ACTUAL_VALUE","RESULT"));

        boolean allMatched = true;
        Set<String> Expected_jsonField_Names = expectedValueMap.keySet();
        for (String x : Expected_jsonField_Names) {
            System.out.println("Value of X - " + x);
            Optional<Object> FieldNameInResponseBody = Optional.ofNullable(res.jsonPath().get(x));
            if(FieldNameInResponseBody.isPresent())
            {
                Object Actiual_jsonField_Value = FieldNameInResponseBody.get();
                Object Expected_jsonField_Falue = expectedValueMap.get(x);

                if (Actiual_jsonField_Value.equals(Expected_jsonField_Falue))
                {
                    actualValueMap.add(new POJO_AssertionKeys(x,Expected_jsonField_Falue, Actiual_jsonField_Value, "MATCHED"));
                }
                else
                {
                    allMatched = false;
                    actualValueMap.add(new POJO_AssertionKeys(x,Expected_jsonField_Falue, Actiual_jsonField_Value, "NOT_MATCHED"));
                }
            }
            else {
                allMatched = false;
                //System.out.println("Expected X Value - " + expectedValueMap.get(x));
                actualValueMap.add(new POJO_AssertionKeys(x, expectedValueMap.get(x), "This Field not found in Response body", "NOT_MATCHED"));
                //System.out.println(expectedValueMap.values());
            }
        }


        if(allMatched)
            ExtentReportManager.LogPassDetails("All assertions are passed. 😊😊😊😊");
        else
            ExtentReportManager.LogFailDetails("All assertions did not passed. 😒😒😒😒");
        //System.out.println(actualValueMap);
        String[][] arrFinalAssertionsMap = actualValueMap.stream().map(aa -> new String[] {aa.getJsonFieldName(), String.valueOf(aa.getExpectedValue()), String.valueOf(aa.getActualValue()), aa.getResult()}).toArray(String[][] :: new);
        Setup.et.get().info(MarkupHelper.createTable(arrFinalAssertionsMap));
    }

    }
