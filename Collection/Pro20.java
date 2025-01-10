import java.util.*;

public class Pro20 {
    public static void main(String[] args) {
        PriorityQueue<String> users = new PriorityQueue<>();
        users.add("Kanad");
        users.add("Kenil");
        users.add("Karan");
        users.add("Keyur");
        users.add("Kamal");

        //users.clear();
        //System.out.println(users.element());
        //System.out.println(users.peek());

        //System.out.println(users.remove());
        //System.out.println(users.element());
        //System.out.println(users.peek());
        System.out.println(users);
        users.remove();
        System.out.println(users);
        users.remove();
        System.out.println(users);
    }
}
