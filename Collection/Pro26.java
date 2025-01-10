import java.util.*;
public class Pro26 {
    public static void main(String[] args) {
        //Map<Integer, String> map = new HashMap<Integer, String >();
        //Map<Integer, String> map = new LinkedHashMap<Integer, String >();
        TreeMap<Integer, String> map = new TreeMap<Integer, String>();

        map.put(1, "Rajkot");
        map.put(2, "Surat");
        map.put(5, "Ahamdabad");
        map.put(4, "Baroda");
        map.put(3, "Gandhinagar");

        System.out.println(map);
    }

}
