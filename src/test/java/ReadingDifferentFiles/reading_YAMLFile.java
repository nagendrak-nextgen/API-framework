package ReadingDifferentFiles;

import com.esotericsoftware.yamlbeans.YamlReader;
import org.yaml.snakeyaml.Yaml;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import static ReadingDifferentFiles.readingPropertyFile.readPropertyFiledata;

public class reading_YAMLFile {
    public static void main(String[] args) throws IOException {
        //read_yamlFile();
        readEntireYamlFile();
    }

    public static void read_yamlFile() throws IOException {

        
        String parentpath = System.getProperty("user.dir");
        String yamalfilepath = parentpath + readPropertyFiledata("yamlfilepath");
        //System.out.println(yamalfilepath);
        YamlReader ym = new YamlReader(new FileReader(yamalfilepath));
        Map<String, Object> td = (Map) ym.read();
        System.out.println(td);
        System.out.println(td.get("login"));
        List<Object> tcd = (List<Object>) td.get("login");
        //Map<String,Object> individualdata = new HashMap<>();
        Map<String,String> individualdata = (Map<String, String>) tcd.get(0);
        //System.out.println(individualdata.get("logicalname"));
        for(String s: individualdata.keySet())
        {
            System.out.println(s + " - " + individualdata.get(s));
        }
    }

    public static void readEntireYamlFile() throws IOException {


        String parentpath = System.getProperty("user.dir");
        String yamalfilepath = parentpath + readPropertyFiledata("yamlfilepath");
        //System.out.println(yamalfilepath);
        YamlReader ym = new YamlReader(new FileReader(yamalfilepath));
        Map<String, Object> td = (Map) ym.read();
        System.out.println(td);

        for (String s:td.keySet())
        {
           System.out.println("********** " + s + " **********");

            List<Object> completeTD = (List<Object>) td.get(s);
            for(int i = 0; i<completeTD.size();i++)
            {
                Map<String,Object> individualdata = (Map<String,Object>) completeTD.get(i);
                boolean lognameprinted = false;
                for(String ss:individualdata.keySet())

                    if (!lognameprinted) {
                        System.out.println("********** Test Data For - " + individualdata.get("logicalname") + " **********");
                        lognameprinted = true;
                    }
                    else
                    {
                        System.out.println(ss + "- - - - -" +individualdata.get(ss));
                    }
            }

        }

       /* System.out.println(td.get("login"));
        List<Object> tcd = (List<Object>) td.get("login");
        //Map<String,Object> individualdata = new HashMap<>();
        Map<String,String> individualdata = (Map<String, String>) tcd.get(0);
        //System.out.println(individualdata.get("logicalname"));
        for(String s: individualdata.keySet())
        {
            System.out.println(s + " - " + individualdata.get(s));
        }*/
    }

}
