import java.util.*;

public class Pro2 {
    public static void main(String[] args) {
        List<String> students = new ArrayList<>();
        students.add("Kanad");
        students.add("Keval");
        students.add("Vihan");
        students.add("Vimol");
        students.add("Ankan");

        //System.out.println(students.get(1)); // index

        /*for(String tmp : students){
            System.out.println("Welcome "+tmp );
        }*/

        Iterator iterator = students.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
