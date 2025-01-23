import java.util.*;

public class Pro27 {
    public static void main(String[] args) {
        HashMap<Integer, String> users = new HashMap<>();

        System.out.println(users.put(1, "Kanad"));
        System.out.println(users.put(2, "Kamal"));
        System.out.println(users.put(1, "Keyur"));
        System.out.println(users.putIfAbsent(3, "Kanad"));

        // Set set = users.entrySet();

        //users.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        users.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    }
}
