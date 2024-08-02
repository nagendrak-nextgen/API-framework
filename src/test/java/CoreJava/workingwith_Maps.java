package CoreJava;

import java.util.*;

public class workingwith_Maps {

    public static void main(String[] args) {
        workingwith_Maps wwm = new workingwith_Maps();
        wwm.workingwith_HashMap();

    }

    public void workingwith_HashMap() {
        Map<String,Object> hMap = new HashMap<>();
        hMap.put("father","Nagendra Kumar");
        hMap.put("mother","Naga Sandhya");
        hMap.put("myself","Samhita");
        hMap.put("brother","Sai Suhrut");
        hMap.put("age",20);

        System.out.println("*********** Out Put of Hash Map ***********");
        for(String s: hMap.keySet())
        {
            System.out.println(s + " - " + hMap.get(s));
        }
    }
}
