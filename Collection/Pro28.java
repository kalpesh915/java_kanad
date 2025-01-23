import java.util.*;

public class Pro28 {
    public static void main(String[] args) {
        //Map<Integer, String> students = new HashMap();
        Map<Integer, String> students = new LinkedHashMap<>();
        students.put(1, "Kanad");
        students.put(4, "Sumit");
        students.put(3, "Karan");

        //System.out.println(students.get(10));
        //System.out.println(students.containsKey(11));
//        for(Map.Entry<Integer, String > entry : students.entrySet()){
//            System.out.println("ID is "+entry.getKey()+" Name is "+entry.getValue());
//        }

        System.out.println(students.replace(1, "Demo"));
    }
}
