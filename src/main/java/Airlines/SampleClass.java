package Airlines;
import Generic_Functions.Excel_Utils;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class SampleClass {
        public static void main(String[] args) throws IOException {
        //System.out.println("Executed Sample Script");
        List<Map> test_data = Excel_Utils.getdatafromexcel("CreateAirlineData","Create_AirLine");
        //Excel_Utils.getExcelDataAsListOfMap("CreateAirlineData","Create_AirLine");
        int cnt = test_data.size();

        for (Map x:test_data)
        {
            System.out.println("***********************");
            System.out.println(x.get("ID"));
            System.out.println(x.get("Country"));
            System.out.println(x.get("Name"));
        }
    }
}
