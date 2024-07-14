package POJO_Javers_Example;

import org.javers.core.Javers;
import org.javers.core.JaversBuilder;
import org.javers.core.diff.Diff;
import org.javers.core.diff.ListCompareAlgorithm;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JaversTest {
    public static void main(String[] args){
        //******************** Example 1 ********************
  /*
        Student s1 = new Student();
        s1.setId(1);
        s1.setName("Nag");

        Student s2 = new Student();
        s2.setId(2);
        s2.setName("Nag");
        Javers jvr = JaversBuilder.javers().build();
        Diff result = jvr.compare(s1,s2);
        System.out.println(result.prettyPrint());
        System.out.println(result.getChanges());
*/
        //******************** Example 2 ********************

        //in this example we add 2 different address to address class and then
        // those two address will be added to Student class using s2.SetAddress(Arrays.asList() method

        Address a1 = new Address();
        a1.setAddress("address1");
        a1.setId(11);

        Address a2 = new Address();
        a2.setAddress("address2");
        a2.setId(22);


        Student s1 = new Student();
        //s1.setId(1);
        s1.setName("Nag");
        s1.setAddress(Arrays.asList(a1,a2));


        Student s2 = new Student();
        //s2.setId(1);
        s2.setName("Nag");
        s2.setAddress(Arrays.asList(a2,a1));


        Javers jvr = JaversBuilder.javers().withListCompareAlgorithm(ListCompareAlgorithm.AS_SET).build();
        Diff result = jvr.compare(s1,s2);
        System.out.println(result.prettyPrint());
        System.out.println(result.getChanges());
    }

}
