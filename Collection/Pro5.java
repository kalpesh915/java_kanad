
import java.util.*;

public class Pro5 {
    // The stack is the subclass of Vector. It implements the last-in-first-out data structure,
    public static void main(String[] args) {
        Stack<String> students = new Stack<>();

        students.push("Kanad");
        students.push("Kamal");
        students.push("Karan");

        System.out.println(students.pop());
        System.out.println("----------------------");
        Iterator<String> iterator = students.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
