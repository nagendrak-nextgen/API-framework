package Java_Programming;

import java.util.*;

public class ArrayListAssignments {
    public static void main(String[] args)
    {
        ArrayListAssignments alc = new ArrayListAssignments();
        alc.ReadingArrayListMethods();
    }

    public void ReadingArrayListMethods()
    {
        List<Integer> al = new ArrayList<>();
        List<Integer> al2 = new ArrayList<>();
        List<Integer> al3 = new ArrayList<>(Arrays.asList(5,2,7,12));

        //************ Adding Values ************
        al.add(5);
        al.add(2);
        al.add(7);
        al.add(12);
        al.add(6);
        al.add(22);
        al.add(18);
        al.add(1);
        al.add(32);
        al.add(23);

        al2.add(5);
        al2.add(2);
        al2.add(7);
        al2.add(12);
        al2.add(6);
        al2.add(23);

        al3.add(15); // Appends this value to an array
        al3.add(2,13); // inserts value in 2nd index
        System.out.println(al3);
        al3.remove(2); // removes 2nd index value
        System.out.println(al3);

        //************ Finding Length ************
        System.out.println(al.size());

        //************ Getting specific value ************
        System.out.println(al.get(5));
        System.out.println(al.getFirst());
        System.out.println(al.getLast());
        //************ Removing value ************
        //al.remove(3);
        //al.removeFirst();
        //al.removeLast();
        //al.remove(true);
        //al.removeIf(n -> (n%2==0)); // O/P - [5, 7, 1, 23] will remove all even numbers
        //al.removeAll(al2); // O/P - [22, 18, 1, 32] will remove all common numbers

        //************ Sorting methods ************
        System.out.println("***************** Sort ****************");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println(al);

        //************ Yet to Explore ************
        /* al.addAll();
        al.clear();
        al.contains();
        al.containsAll();
        al.isEmpty();
        al.iterator();
        al.listIterator();
        al.replaceAll();
        al.reversed();
        al.sort();
        al.spliterator();
        al.subList();
        al.equals();
        al.indexOf();
        al.lastIndexOf();
        al.set(); */

    }
}
