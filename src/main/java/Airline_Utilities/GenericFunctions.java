package Airline_Utilities;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

import java.io.IOException;
import java.util.Map;
import Generic_Functions.BaseClass;
import org.testng.Assert;


public class GenericFunctions extends BaseClass
{
    /*
    public static Map<String, Object> ReadJsonFile(String JsonFileName) throws IOException {
        //System.out.println("Read Json File - " + System.getenv("name"));
        String JsonFP = GetFilePath(JsonFileName);
        System.out.println("ReadJsonFile - " + JsonFP);
        ObjectMapper om2 = new ObjectMapper();
        Map<String, Object> data = om2.readValue(new File(JsonFP), new TypeReference<>(){});
        return data;
    }

    public static String GetFilePath(String FileName) throws IOException
    {

        //String str_ParentPath = System.getProperty("user.dir");
        //String str_FilePath = str_ParentPath + " ";
        //String str_FilePath = str_ParentPath + System.getProperty("FilePath");
        //System.out.println("FilePaths Path  - - - - - " + str_FilePath);
        ObjectMapper om = new ObjectMapper();

        System.out.println("Json File Path taken from Static function - " + BaseClass.str_FilePath);

        Map<String, String> data = om.readValue(new File(BaseClass.str_FilePath), new TypeReference<>(){});
        //System.out.println("File Name - -- - - - - " + data.get(FileName));


        String Path = (FileName.equals("FilePaths"))? (BaseClass.str_FilePath) : (BaseClass.str_RootPath + data.get(FileName));

        return Path;
    }
    */
}
