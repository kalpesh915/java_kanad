import java.util.*;

public class Pro19 {
    public static void main(String[] args) {
        TreeSet<String> values = new TreeSet<>();

        values.add("A");
        values.add("B");
        values.add("C");
        values.add("D");
        values.add("E");

        System.out.println(values);
        System.out.println(values.descendingSet());
        //System.out.println(values.headSet("C", true));
        //System.out.println(values.subSet("A", false, "C", true));
        //System.out.println(values.tailSet("C", true));
        System.out.println(values.tailSet("C", false));

    }
}
