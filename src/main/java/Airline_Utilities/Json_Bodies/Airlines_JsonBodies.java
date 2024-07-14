package Airline_Utilities.Json_Bodies;

import Generic_Functions.BaseClass;
import Generic_Functions.Enum_RandomDataTypeNames;
import Generic_Functions.GenericFunctions;
import com.github.javafaker.Faker;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.HashMap;
import java.util.Map;
import Generic_Functions.RandomDataGenerator;

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

    public static Map<String, Object> JsonBody_AirlinesPost_Map()
    {
        Map<String, Object> payload = new HashMap<>();
        Faker fakerObject = new Faker();
        payload.put("id",RandomDataGenerator.getRandomNumber(10));
        payload.put("name",RandomDataGenerator.getRandomDataFor(Enum_RandomDataTypeNames.FIRSTNAME));
        payload.put("country",RandomDataGenerator.getRandomDataFor(Enum_RandomDataTypeNames.COUNTRY));
        payload.put("logo", RandomDataGenerator.getRandomAlphabets(25));
        payload.put("slogan",RandomDataGenerator.getRandomAlphabets(20));
        payload.put("head_quaters",RandomDataGenerator.getRandomDataFor(Enum_RandomDataTypeNames.CITYNAME));
        payload.put("website","https://www." + RandomDataGenerator.getRandomAlphabets(10) + ".com");
        payload.put("established",RandomDataGenerator.getRandomNumber(1990,GenericFunctions.getcurrentyear()));

        return payload;
    }

    public static POJO_Airlines_Post JsonBody_AirlinesPost_json()
    {
        return POJO_Airlines_Post
                .builder()
                .id(Integer.parseInt(RandomDataGenerator.getRandomNumber(6)))
                .name(RandomDataGenerator.getRandomDataFor(Enum_RandomDataTypeNames.FIRSTNAME))
                .country(RandomDataGenerator.getRandomDataFor(Enum_RandomDataTypeNames.COUNTRY))
                .logo(RandomDataGenerator.getRandomAlphabets(25))
                .slogan(RandomDataGenerator.getRandomAlphabets(20))
                .head_quaters(RandomDataGenerator.getRandomDataFor(Enum_RandomDataTypeNames.CITYNAME))
                .website("https://www." + RandomDataGenerator.getRandomAlphabets(10) + ".com")
                .established(String.valueOf(RandomDataGenerator.getRandomNumber(1990,GenericFunctions.getcurrentyear())))
                .build();

    }
}

