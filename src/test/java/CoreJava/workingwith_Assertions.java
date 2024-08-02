package CoreJava;

import org.testng.Assert;

public class workingwith_Assertions {
    public static void main(String[] args) {
        comparetwovalues("A","A");
        reportcomparisonresult(5,5);
    }

    public static void comparetwovalues(String val1, String val2) {
        Assert.assertEquals(val1,val2);
        System.out.println("Executed First Function");
    }

    public static void reportcomparisonresult(int val1, int val2) {
        Assert.assertTrue(val1 > val2,"The First Value is less than second value");
        System.out.println("Executed Second Function");
    }
}
