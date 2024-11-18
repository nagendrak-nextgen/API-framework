package Java_Programming;

import java.util.*;

public class LinkedHashSetAssignment
{
    public static void main(String[] args)
    {

    }

    public void workingWithLinkedHashSet()
    {
        Set<Integer> hs = new HashSet<>();
        Set<Integer> hs2 = new HashSet<>();
        Set<Integer> hs3 = new HashSet<>(Arrays.asList(5,2,7,12));

        //************ Adding Values ************
        hs.add(5);
        hs.add(2);
        hs.add(7);
        hs.add(12);
        hs.add(6);
        hs.add(22);
        hs.add(18);
        hs.add(15);
        hs.add(32);
        hs.add(23);
        hs.add(7);

        hs2.add(5);
        hs2.add(2);
        hs2.add(7);
        hs2.add(12);
        hs2.add(6);
        hs2.add(23);

        hs.add(15); // Appends this value to a set
        hs.add(13);

        //************ Displaying Values of Hash Set ************
        System.out.println(hs);

        //************ Finding Length ************
        System.out.println("************ Finding Length ************");
        System.out.println(hs.size());

        //************ Getting specific value ************
        System.out.println("************ Getting specific value ************");
        System.out.println();
        Iterator<Integer> itr = hs.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //************ Sorting methods ************
        System.out.println("************ Sorting methods ************");
        System.out.println(hs);
        List<Integer> hsl = new ArrayList<>(hs);
        Collections.sort(hsl); //Sorts in Assending Order
        System.out.println(hsl);
        Collections.sort(hsl,Collections.reverseOrder()); //Sorts in Decending Order
        System.out.println(hsl);
        hsl.sort(Collections.reverseOrder());
        System.out.println(hs);


        //************ Getting Sub List ************
        System.out.println("************ Getting Sub List ************");
        System.out.println(hs);
        List<Integer> hsl2 = new ArrayList<>(hs);
        System.out.println(hsl2.subList(2,5));
        System.out.println(hsl2);

        //************ Converting List to Set, adding new values and printing the values ************
        Set<Integer> hsl21 = new HashSet<>(hsl2.subList(2,5));
        System.out.println(hsl21);
        hsl21.add(99);

        itr = hs.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //************ Index Of ************
        System.out.println("************ Getting index of specific value ************");
        System.out.println("No Code for Set Interface");


        //************ Equal Method ************
        System.out.println("************ Use of Equal Method ************");
        System.out.println(hs);
        System.out.println(hs2);
        System.out.println(hs.equals(hs2));

        //************ Using Contains Method ************
        System.out.println("************ Using Contains Method ************");
        System.out.println(hs);
        System.out.println(hs.contains(7));
        //************ Yet to Explore ************
        /* al.addAll();
        al.containsAll();
        al.isEmpty();
        al.iterator();
        al.listIterator();
        al.replaceAll();
        al.reversed();
        al.sort();
        al.spliterator();
        al.set(); */

        //************ Removing value ************
        System.out.println("************ Removing value ************");
        System.out.println(hs);
        hs.remove(3);
        System.out.println(hs);
        hs.removeIf(n -> (n%2==0)); // O/P - [5, 7, 1, 23] will remove all even numbers
        System.out.println(hs);
        //al.removeAll(al2); // O/P - [22, 18, 1, 32] will remove all common numbers

        //************ Clearing Array Content ************
        System.out.println("************ Clearing Array Content ************");
        System.out.println(hs3);
        hs3.clear();
        System.out.println(hs3);
    }
}
