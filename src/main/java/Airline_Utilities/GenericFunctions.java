package Airline_Utilities;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

import java.io.IOException;
import java.util.Map;


public class GenericFunctions
{
    public static Map<String, String> ReadJsonFile(String JsonFileName) throws IOException {
        String JsonFP = GetFilePath(JsonFileName);

        ObjectMapper om = new ObjectMapper();
        Map<String, String> data = om.readValue(new File(JsonFP), new TypeReference<>(){});
        return data;
    }

    public static String GetFilePath(String FileName) throws IOException {
        ObjectMapper om = new ObjectMapper();
        String str_ParentPath = System.getProperty("user.dir");
        String str_FilePath = str_ParentPath + "\\src\\main\\java\\Airline_Resources\\FilePaths.json";
        System.out.println("FilePaths Path  - - - - - " + str_FilePath);
        Map<String, String> data = om.readValue(new File(str_FilePath), new TypeReference<>(){});
        System.out.println("File Name - -- - - - - " + data.get(FileName));
        return str_ParentPath + "\\" + data.get(FileName);
    }
}
