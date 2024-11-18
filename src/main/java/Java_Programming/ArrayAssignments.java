package Java_Programming;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayAssignments {
    public static void main(String[] args)
    {
        ArrayAssignments as = new ArrayAssignments();
        //as.FindLongestCommonPrefix();
        //as.FindLongestCommonSufix();
        as.findClosestString();

    }

    public void FindLongestCommonPrefix()
    {
        String[] arr = {"geeksforgeeks", "geeks", "geek", "geezer"};
        String ss;
        String smallestString = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if (smallestString.length() > arr[i].length())
            {
                smallestString = arr[i];
            }
        }

        String compareString = "";
        boolean b=true;
        for (int i = smallestString.length(); i>0; i--)
        {
            b = true;
            compareString = smallestString.substring(0,i);
            System.out.println("Prefix String - " + compareString);
            for (int j = 0;j<arr.length;j++)
            {
                if (arr[j].indexOf(compareString) == -1)
                {
                    b = false;
                    break;
                }
            }

            if (b)
            {
                System.out.println("Longest Common Prefix " + compareString);
                break;
            }
        }

        if (!b)
        {
            System.out.println("No Common Prefix ");
        }


    }

    public void FindLongestCommonSufix()
    {
        String[] arr = {"gereksforgeek", "forgeek", "geek", "sergeek"};
        String ss;
        String smallestString = arr[0];
        for(int i=1;i<arr.length;i++)
        {
            if (smallestString.length() > arr[i].length())
            {
                smallestString = arr[i];
            }
        }

        String compareString = "";
        boolean b = true;
        for (int i = smallestString.length(); i>0; i--)
        {
            b = true;
            compareString = smallestString.substring(0,i);

            for (int j = 0;j<arr.length;j++)
            {
                int pos = arr[j].indexOf(compareString);
                if ((pos+ compareString.length()) != arr[j].length())
                {
                    b = false;
                    break;
                }
            }

            if (b)
            {
                System.out.println("Longest Common Sufix " + compareString);
                break;
            }
        }
        if (!b)
        {
            System.out.println("No Common Sufix " + compareString);
        }
    }

    public void findClosestString()
    {
        /* String[] s = {"the", "quick", "brown", "fox", "quick"};
        String word1 = "the";
        String word2 = "fox";
        */

        String[] s = {"geeks", "for", "geeks", "contribute", "practice"};
        String word1 = "geeks";
        String word2 = "practice";

        int sIndex = 0;
        int eIndex = 0;
        for (int i = 0;i<s.length;i++)
        {
            if (s[i].equals(word1))
            {
                sIndex = i+1;
            }
            else if(s[i].equals(word2))
            {
                eIndex = i+1;
            }
        }

        System.out.println(eIndex-sIndex);
    }
}
