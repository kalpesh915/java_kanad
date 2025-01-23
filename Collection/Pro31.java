import java.util.*;

public class Pro31 {
    public static void main(String[] args) {
        NavigableMap<Integer, String> users = new TreeMap<>();
        users.put(1, "Kanad");
        users.put(2, "Kamal");
        users.put(5, "Kashyap");
        users.put(3, "Keyur");
        users.put(4, "Karan");

        //System.out.println(users);
        //System.out.println(users.descendingMap());
        //System.out.println(users.headMap(3));
        //System.out.println(users.headMap(3, true));
        //System.out.println(users.tailMap(3));
        System.out.println(users.subMap(1, true, 3, false));
    }
}
