import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeStruct {
    public static void main(String[] args){
// tree data structures are data structures which stores data in oder.
        // The example for tree structures is given here

        Set<Integer> treeset = new TreeSet<>();
        treeset.add(1);
        treeset.add(200); // treeset do not contain duplicate
        treeset.add(321);
        treeset.add(560);
        System.out.println(treeset);
        treeset.add(1);
        System.out.println(treeset);
        // The string are added in alphabetic orders. se example.
        Set<String> worSet = new TreeSet<>(Comparator.comparing(String::length));
        worSet.add("Welcome");
        worSet.add("to");
        worSet.add("Java");
        worSet.add("Programming");
        System.out.println(worSet);
        // removing elements.
        worSet.remove("Welcome");
        System.out.println("After deletion:" + worSet);




    }
}
