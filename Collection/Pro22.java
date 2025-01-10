import java.util.*;
public class Pro22 {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put(1, "Rajkot");
        map.put(2, "Surat");
        map.put(3, "Ahamdabad");
        map.put(4, "Baroda");
        map.put(5, "Gandhinagar");

        Set set = map.entrySet();
        System.out.println(map);
        System.out.println(set);
        System.out.println(map.toString());
    }

}
