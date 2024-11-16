package SamplePackage;

import org.testng.annotations.Test;

import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SampleJava
{
    //@Test
    //public static void printout()
    //{
    //System.out.println("How are you");
    //}
    public static void  main(String[] args) {
        SampleJava sj = new SampleJava();
        //sj.ConcatinatingEndNumbers("12345");
        //int int_FinalProfit = sj.BuyAndSellShareWithMaximProfit();
        //System.out.println("Final Profit - " + int_FinalProfit);

        int a = 12345;
        String b = "2";
        String c = "3";

        //System.out.println(b+c);
        //System.out.println(String.valueOf( b)+String.valueOf(c));
        //String c = Integer.toString(a);
        //System.out.println(c.length());
        HashSet<String> ss= new HashSet<>();
        System.out.println(ss.size());
        ss.add("25");
        ss.add("26");
        System.out.println(ss.size());
        ss.add("25");
        ss.add("28");
        ss.add("21");
        //Iterator i = new Iterator(ss);

        System.out.println(ss.size());



    }



    public int BuyAndSellShareWithMaximProfit()
    {
        int[] a = {2,7, 8,9,6};
        int int_Profit = 0;
        int int_Min = a[0];
        int int_Max = a[0];
        int int_MaxProfit = 0;
        for(int i=0;i<a.length;i++)
        {
            if (int_Min>a[i])
            {
                int_Min = a[i];
            }
            else if (int_Max<a[i])
            {
                int_Max = a[i];
            }

            int_Profit = int_Max - int_Min;
            if (int_MaxProfit < int_Profit)
            {
                int_MaxProfit = int_Profit;
                //System.out.println(int_MaxProfit);
            }
        }
        return int_MaxProfit;
    }

    public void ConcatinatingEndNumbers(String str_String)
    {
        String s = str_String;
        int c = s.length();
        String op = "";
        int p = 0;

        while(c>1)
        {
            op = String.valueOf(s.charAt(p))+String.valueOf(s.charAt(s.length()-p-1));
            System.out.println(op);
            c = c-2;
            p = p+1;
        }

        if (c==1)
        {
            System.out.println(s.charAt(p));
        }

      /*
        if (c%2 > 0) {
            System.out.println("Odd Number");
            int endvalue = c/2;

        }
        else{
            System.out.println("even Number");
        }


        //char[] a = s.toCharArray();
        //a.length

        //int[] b = new int[] {1,2,3,4,5};
*/
    }

}


