package Airline_Utilities.Json_Bodies;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class POJO_AssertionKeys {
    private String jsonFieldName;
    private Object expectedValue;
    private Object actualValue;
    private String result;
}
