import java.util.*;

public class Pro6 {
    // The stack is the subclass of Vector. It implements the last-in-first-out data structure,
    public static void main(String[] args) {
        PriorityQueue<String> students = new PriorityQueue<>();

        students.add("K");
        students.add("Kamal");
        students.add("Kanad");
        students.add("Karan");


        System.out.println(students.element());
        System.out.println(students.peek());

        System.out.println(students.remove());
        System.out.println(students.poll());

        /*Iterator<String> iterator = students.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }*/
    }
}
