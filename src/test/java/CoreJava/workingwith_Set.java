package CoreJava;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class workingwith_Set {
    public static void main(String[] args) {
        workingwith_Set wws = new workingwith_Set();
        wws.workingwith_HashSet();

    }

    public void workingwith_HashSet() {
        HashSet<Object> hSet = new HashSet<>();
        hSet.add("Nagendra Kumar");
        hSet.add("Naga Sandhya");
        hSet.add("Samhita");
        hSet.add("Sai Suhrut");
        hSet.add(20);

        System.out.println("*********** Out Put of Hash Set ***********");
        //*********** Method 1 to print values of Has Set ***********
            //System.out.println(hSet);

        //*********** Method 2 to print values of Has Set ***********
        Iterator<Object> i = hSet.iterator();
        while (i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
