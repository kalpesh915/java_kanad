import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Pro12 {
    public static void main(String[] args) {
        LinkedList<String> users = new LinkedList<>();
        LinkedList<String> users1 = new LinkedList<>();

        users.add("Kanad");
        users.add("Kamal");
        users.add("Keyur");
        users.add("Kishan");
        users.add("Krishan");

        users1.add("Vrajesh");
        users1.add("Vansh");
        users1.add("Viraj");

        //Iterator iterator = users.iterator();

//        while (iterator.hasNext()){
//            System.out.print(" "+iterator.next());
//        }


        //users.add(1,"Ravi");

        //users.addAll(users1);

        //users.addAll(0, users1);

        //users.addFirst("FirstUser");
        //users.addLast("LastUser");

        //users.remove(0);
        //users.remove("Kanad");
        //users.removeLast();
        //users.removeFirst();
        //users.clear();

        //Iterator iterator = users.iterator();
        Iterator iterator = users.descendingIterator();
        //ListIterator iterator = users.descendingIterator();

        while (iterator.hasNext()){
            System.out.print(" "+iterator.next());
        }
    }
}
