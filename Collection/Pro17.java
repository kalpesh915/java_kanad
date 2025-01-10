import java.util.*;

public class Pro17 {
    public static void main(String[] args) {
        TreeSet<String> users = new TreeSet<>();

        users.add("Ajay");
        users.add("Kanad");
        users.add("Kanad");
        users.add("Kamal");
        users.add("Kapil");
        users.add("Kashyap");
        users.add("Bimal");
        users.add("Sumit");
        users.add("Dhairya");

        //Iterator iterator = users.iterator();
        Iterator iterator = users.descendingIterator();
        while (iterator.hasNext()){
            System.out.print(" "+iterator.next());
        }
    }
}
