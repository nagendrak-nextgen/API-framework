package CoreJava;

import com.google.gson.JsonObject;
import groovy.json.JsonParser;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class creatingJsonFile {
    public static void main(String[] args) throws FileNotFoundException {
        creatingJsonFile cjf = new creatingJsonFile();
        cjf.createAJsonFile();

    }
    public void createAJsonFile() throws FileNotFoundException {
        // This code is implemented by importing JSON.Simple dependency
        JSONObject login1 = new JSONObject();
        login1.put("username","Nag1");
        login1.put("password","pwd1");
        login1.put("errmsgexpected","yes");
        login1.put("errmessage","The user name is wrong");

        JSONObject login2 = new JSONObject();
        login2.put("username","Nag2");
        login2.put("password","pwd2");
        login2.put("errmsgexpected","yes");
        login2.put("errmessage","The password is wrong");

        JSONObject login3 = new JSONObject();
        login3.put("username","Nag1");
        login3.put("password","pwd1");
        login3.put("errmsgexpected","no");
        login3.put("errmessage","");

        //System.out.println(login1);
    //*********** Phase 1 - add 'Login' and 'create user' test data ***********
        JSONObject createuser1 = new JSONObject();
        createuser1.put("lastname","kumar1");
        createuser1.put("firstname","nag1");
        createuser1.put("emailid","nag1@gmail.com");
        createuser1.put("phonenumber","1111");

        JSONObject createuser2 = new JSONObject();
        createuser2.put("lastname","kumar2");
        createuser2.put("firstname","nag2");
        createuser2.put("emailid","nag2@gmail.com");
        createuser2.put("phonenumber","2222");

        //*********** Phase 2 - assign all login data to 'log_in' array and create user data to 'create_user' array ***********
        JSONArray log_in = new JSONArray();
        log_in.add(login1);
        log_in.add(login2);
        log_in.add(login3);

        JSONArray create_user = new JSONArray();
        create_user.add(createuser1);
        create_user.add(createuser2);

        //*********** Phase 3 - Tag/assigne Login data to login title and create user data to createuser title ***********
        JSONObject  log = new JSONObject();
        log.put("login",log_in);

        JSONObject cu = new JSONObject();
        cu.put("createuser",create_user);

        //*********** Phase 4 - assign login and create user details to 'testdata' title ***********
        JSONArray test_data = new JSONArray();
        test_data.add(log);
        test_data.add(cu);
        JSONObject td = new JSONObject();
        td.put("testdata",test_data);

        //*********** Phase 5 - Print the final json ***********
        System.out.println(td.toJSONString());

    }
}
