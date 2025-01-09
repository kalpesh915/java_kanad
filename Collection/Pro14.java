import java.util.*;

public class Pro14 {
    public static void main(String[] args) {
        HashSet<String> users = new HashSet<>();

        users.add("Kanad");
        users.add("Kamal");
        users.add("Keyur");
        users.add("Kapil");
        users.add("Krishil");
        users.add("Kanad");
        System.out.println(users.contains("Kamal"));
        users.remove("Kamal");
        System.out.println(users.contains("Kamal"));


        //System.out.println(users.size());

        //Iterator iterator = users.iterator();

        /*while (iterator.hasNext()){
            System.out.print(" "+iterator.next());
        }*/

        //System.out.println(users);
    }
}
