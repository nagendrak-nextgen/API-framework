package ReadingDifferentFiles;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.JSONObject;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class readingJsonFile {
    public static void main(String[] args) throws IOException, ParseException {
       readingJsonFile rjf = new readingJsonFile();
       //JSONObject .readJsonFile("login","log125");
       JSONObject td_value = rjf.readJsonFile("createuser","cu125");
       if (td_value!=null) System.out.println(td_value.toJSONString());
    }

    public JSONObject readJsonFile(String scenario_Name, String testdata_logicalname) throws IOException, ParseException {
        JSONObject jo = null;
        String parentPath = System.getProperty("user.dir");
        String sampleJsonPath = parentPath + "\\src\\test\\resources\\testdata\\testdata.json";
        FileReader fr = new FileReader(sampleJsonPath);
        JSONParser jp = (JSONParser) new JSONParser();
        JSONObject jObject = (JSONObject) jp.parse(fr);
        //System.out.println(jObject.toJSONString());

        JSONArray ja = (JSONArray) jObject.get(scenario_Name);
        boolean bln_dataExist = false;
        for (int i=0;i<ja.size();i++)
        {

            jo = (JSONObject) ja.get(i);
            String logical_Name = (String) jo.get("logicalname");
            if (logical_Name.equals(testdata_logicalname))
            {
                bln_dataExist = true;
                break;
            }
        }
        if (!bln_dataExist) {
            System.out.println("expected data doesnot exist");
            jo = null;
        }
        else
        {
            Set<String> ks = jo.keySet();
            Iterator<String> i = ks.iterator();
            while(i.hasNext())
            {
                String colName = i.next();
                String colValue = (String) jo.get(colName);
                System.out.println(colName + " - " + colValue);
            }
        }


        return jo;
    }
}
