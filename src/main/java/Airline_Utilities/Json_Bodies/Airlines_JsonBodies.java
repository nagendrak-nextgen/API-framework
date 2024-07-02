package Airline_Utilities.Json_Bodies;

import java.util.HashMap;
import java.util.Map;

public class Airlines_JsonBodies
{
    public static String JsonBody_AirlinesPost_String(String id, String name, String country, String logo, String slogan, String headquarters, String website, String established)
    {
        String Body = """
            {
                "id": "%s",
                "name": "%s",
                "country": "%s",
                "logo": "%s",
                "slogan": "%s",
                "head_quaters": "%s",
                "website": "%s",
                "established": "%s"
            }
            """;
        return String.format(Body, id, name, country, logo, slogan, headquarters, website, established);

        //return formattedBody;
    }

    public static Map<String, Object> JsonBody_AirlinesPost_Map(String id, String name, String country, String logo, String slogan, String headquarters, String website, String established)
    {
        Map<String, Object> payload = new HashMap<>();
        payload.put("id",id);
        payload.put("name",name);
        payload.put("country",country);
        payload.put("logo",logo);
        payload.put("slogan",slogan);
        payload.put("head_quaters",headquarters);
        payload.put("website",website);
        payload.put("established",established);

        return payload;
    }
}
