import java.util.*;

public class Pro18 {
    public static void main(String[] args) {
        TreeSet<Integer> values = new TreeSet<>();

        values.add(45);
        values.add(35);
        values.add(11);
        values.add(98);
        values.add(55);
        values.add(15);

        System.out.println(values);
        System.out.println(values.pollFirst());
        System.out.println(values.pollLast());
        System.out.println(values);
        System.out.println(values.isEmpty());
        System.out.println(values.size());
    }
}
