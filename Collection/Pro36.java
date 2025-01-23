import java.util.*;
public class Pro36 {
    public static void main(String[] args) {
        List<String> users = new ArrayList<>();
        users.add("Kanad");
        users.add("Kamal");
        users.add("Krsihan");
        users.add("Krishil");
        users.add("Krutarth");
        users.add("Keyur");

        System.out.println(users);

        Collections.sort(users, Comparator.reverseOrder());
        System.out.println(users);

        Collections.sort(users);
        System.out.println(users);
    }
}
