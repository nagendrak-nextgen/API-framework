package Java_Programming;

public class StringAssignments {

    public static void main(String[] args)
    {
        StringAssignments sa = new StringAssignments();
        //sa.ReadingStringValues("Nagendra Kumar Ujji");
        //sa.ReversingAString("Nagendra");
        //sa.DisplayUniqueValue("Nagendra");
        //sa.ExtractSubString("Nagendra Kumar Ujji",5,14);
        //sa.ReplaceSubString("Nagendra Kumar U","Kumar","K");
        //System.out.println("nagendra".indexOf("ndr"));
        sa.convertStringToCharacterArray("Nagendra");
    }

    public void ReadingStringValues(String s)
    {
        //String s = "Nagendra";

        for(int i= 0; i<s.length();i++)
        {
            System.out.println(i);
            System.out.println(s.charAt(i));

        }
    }

    public void ReversingAString (String s)
    {
        //************ Method - 1 ************
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        System.out.println("********************");
        System.out.println(sb.reverse());
        System.out.println("********************");

        //************ Method - 2 ************
        String rs = "";
        for(int i= 0; i<s.length();i++)
        {
           rs = s.charAt(i) + rs;

        }

        System.out.printf(rs);
    }

    public void DisplayUniqueValue (String s)
    {
        //s = "Nagendra";
        String rs = "";
        for(int i= 0; i<s.length();i++)
        {

            //if (!rs.contains(String.valueOf(s.charAt(i))))
            if (!rs.toUpperCase().contains(String.valueOf(s.toUpperCase().charAt(i))))
            {
                rs = rs + s.charAt(i);
            }

        }

        System.out.printf(rs);
    }

    public void ExtractSubString(String s, int StartIndex, int EndIndex)
    {
        System.out.println(s.substring(StartIndex-1,EndIndex));
    }

    public void ReplaceSubString(String s, String stringToReplace,String StringToReplaceWith)
    {
        //************ Method - 1 ************
        String temp = s.replace(stringToReplace, StringToReplaceWith);
        System.out.println("New String Length - " + temp.length());
        System.out.println(temp);

        //************ Method - 2 ************
        int index = s.indexOf(stringToReplace);
        int newIndex = index+ stringToReplace.length();
        //System.out.println(newIndex);

        String newString = s.substring(0,index) + StringToReplaceWith + s.substring(newIndex,s.length());
        System.out.println(newString);

        System.out.println("New String Length - " + temp.length());

    }

    public void convertStringToCharacterArray(String s)
    {

        char[] ca = s.toCharArray();
        for(char r:ca)
        {
            System.out.println(r);
        }
    }
}
