import java.util.*;

public class Pro29 {
    public static void main(String[] args) {
        TreeMap<Integer, String> users = new TreeMap<>();
        users.put(1, "Kanad");
        users.put(2, "Kamal");
        users.put(5, "Kashyap");
        users.put(3, "Keyur");
        users.put(4, "Karan");

        //users.remove(1);
        //System.out.println(users.remove(1));
        System.out.println(users.remove(11));

        for(Map.Entry user : users.entrySet()){
            System.out.println(user.getKey()+" "+user.getValue());
        }


    }
}
