package Java_Programming;

import java.util.*;

public class LinkedListAssignments {
    public static void main(String[] args)
    {
        LinkedListAssignments llc = new LinkedListAssignments();
        llc.workingWithLinkedList();

    }

    public void workingWithLinkedList()
    {
        List<Integer> al = new LinkedList<>();
        List<Integer> al2 = new LinkedList<>();
        List<Integer> al3 = new LinkedList<>(Arrays.asList(5,2,7,12));

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
        al.add(7);

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
        System.out.println("************ Finding Length ************");
        System.out.println(al.size());

        //************ Getting specific value ************
        System.out.println("************ Getting specific value ************");
        System.out.println(al.get(5));
        System.out.println(al.getFirst());
        System.out.println(al.getLast());

        //************ Sorting methods ************
        System.out.println("************ Sorting methods ************");
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        //Collections.sort(al,Collections.reverseOrder());
        al.sort(Collections.reverseOrder());
        System.out.println(al);


        //************ Getting Sub List ************
        System.out.println("************ Getting Sub List ************");
        System.out.println(al);
        System.out.println(al.subList(2,5));

        //************ Index Of ************
        System.out.println("************ Getting index of specific value ************");
        System.out.println(al);
        System.out.println(al.indexOf(7));
        System.out.println(al.lastIndexOf(7));

        //************ Equal Method ************
        System.out.println("************ Use of Equal Method ************");
        System.out.println(al);
        System.out.println(al2);
        System.out.println(al.equals(al2));

        //************ Using Contains Method ************
        System.out.println("************ Using Contains Method ************");
        System.out.println(al);
        System.out.println(al.contains(7));
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
        al.remove(3);
        System.out.println(al);
        al.removeFirst();
        System.out.println(al);
        al.removeLast();
        System.out.println(al);
        al.remove(true);
        System.out.println(al);
        al.removeIf(n -> (n%2==0)); // O/P - [5, 7, 1, 23] will remove all even numbers
        System.out.println(al);
        //al.removeAll(al2); // O/P - [22, 18, 1, 32] will remove all common numbers

        //************ Clearing Array Content ************
        System.out.println("************ Clearing Array Content ************");
        System.out.println(al3);
        al3.clear();
        System.out.println(al3);
    }

}
