import java.util.*;

public class Pro21 {
    public static void main(String[] args) {
        Deque<String> users = new ArrayDeque<>();

        users.add("Kanad");
        users.add("Sumit");
        users.add("Ankan");
        users.add("Bimal");
        users.add("Vansh");

        System.out.println(users);
        users.offerFirst("Vikas");
        System.out.println(users);
        users.offerLast("Vandan");
        System.out.println(users);

        users.pollFirst();
        System.out.println(users);
        users.pollLast();
        System.out.println(users);
        users.poll();
        System.out.println(users);
    }
}
