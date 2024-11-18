package Java_Programming;

import java.util.HashMap;
import java.util.Map;

public class MapsAssignments {
    public static void main(String[] args)
    {
        workingWithHashMaps();
    }

    public static void workingWithHashMaps()
    {
        Map<String, Integer> mp = new HashMap<>();

        //************ Adding Values ************
        System.out.println("************ Adding Key & Value ************");
        mp.put("nagendra",1975);
        mp.put("Sandhya",1985);
        mp.put("Samhita",2010);
        mp.put("Sai",2016);

        //************ Reading Values ************
        System.out.println("************ Reading Key and Value ************");
        System.out.println(mp.keySet().size());
        String key;
        int value;
        for(String x:mp.keySet())
        {
            key = x;
            value = mp.get(x);
            System.out.println(key + " " + value);
        }

        //************ Modifying Existing value ************
        System.out.println("************ Modifying Existing value ************");
        System.out.println(mp.get("nagendra"));
        mp.put("nagendra",2000); //Put method if add if the key is not present. it will modify the value if it is already present
        mp.replace("nagendra",1900); // Replace method will replace/modify only if the key exist
        System.out.println(mp.get("nagendra"));

        //************ Checking the existence of the specific key ************
        System.out.println("************ Check if the key exist ************");
        System.out.println("nagendra exist - " + mp.containsKey("nagendra"));
        System.out.println("kumar exist - " + mp.containsKey("kumar"));
        System.out.println("1975 exist - " + mp.containsValue(1975));
        System.out.println("1900 exist - " + mp.containsValue(1900));

        //************ Add if the key is not present ************
        System.out.println("************ Add Key if it is not present ************");
        System.out.println(mp);
        mp.putIfAbsent("nagendra",1975);
        mp.putIfAbsent("kumar",1975);
        System.out.println(mp);

        //************ Removing specific key ************
        System.out.println("************ Removing specific key ************");
        System.out.println(mp);
        mp.remove("kumar");
        System.out.println(mp);
    }
}
