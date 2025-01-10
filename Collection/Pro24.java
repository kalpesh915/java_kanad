import java.util.*;
public class Pro24 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String >();

        map.put(1, "Rajkot");
        map.put(2, "Surat");
        map.put(3, "Ahamdabad");
        map.put(4, "Baroda");
        map.put(5, "Gandhinagar");

        for(Map.Entry entry : map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }

}
