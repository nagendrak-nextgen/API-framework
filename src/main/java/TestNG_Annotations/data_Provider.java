package TestNG_Annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class data_Provider {

    @Test(dataProvider = "testdata")
    public void printuserdetails(String col1, int col2)
    {
        //System.out.println(col1 + "- - - - - " + col2);
    }

    @DataProvider
    public Object[][] testdata() {
        Object[][] a = new Object[4][2];
        a[0][0] = "nag1";
        a[0][1] = 49;
        a[1][0] = "san1";
        a[1][1] = 39;
        a[2][0] = "sam1";
        a[2][1] = 13;
        a[3][0] = "Sai";
        a[3][1] = 9;
        return a;
    }

}
