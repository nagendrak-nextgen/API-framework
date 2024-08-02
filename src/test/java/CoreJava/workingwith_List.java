package CoreJava;

import java.sql.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class workingwith_List {
    public static void main(String[] args) {
        workingwith_List wwl = new workingwith_List();
        wwl.workingwithArrya();
        wwl.workingwith_ArrayList();
        wwl.workingwith_LinkedList();

    }

    public void workingwithArrya() {
        //********** Array Declaration **********
        String[] arr = new String[5];
        arr[0] = "Nagendra Kumar";
        arr[1] = "Naga Sandhya";
        arr[2] = "Samhita";
        arr[3] = "Sai Suhrut";
        arr[4] = "Ujji";
        System.out.println("*********** Out Put of Array ***********");
        for (int i = 0; i< arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    public void workingwith_ArrayList() {
        List<String> arrList = new ArrayList<String>();
        arrList.add("Nagendra Kumar");
        arrList.add("Naga Sandhya");
        arrList.add("Samhita");
        arrList.add("Sai Suhrut");

        System.out.println("*********** Out Put of Array List ***********");
        for(int i = 0; i<arrList.size();i++)
        {
            System.out.println(arrList.get(i));
        }
    }

    public void workingwith_LinkedList() {
        List<String> linList = new LinkedList<String>();
        linList.add("Nagendra Kumar");
        linList.add("Naga Sandhya");
        linList.add("Samhita");
        linList.add("Sai Suhrut");

        System.out.println("*********** Out Put of Linked List ***********");

        for(int i = 0; i<linList.size();i++)
        {
            System.out.println(linList.get(i));
        }
    }
}
