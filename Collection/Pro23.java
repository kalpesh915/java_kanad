import java.util.*;
public class Pro23 {
    public static void main(String[] args) {
        Map map = new HashMap();

        map.put(1, "Rajkot");
        map.put(2, "Surat");
        map.put(3, "Ahamdabad");
        map.put(4, "Baroda");
        map.put(5, "Gandhinagar");

        Set set = map.entrySet();

        Iterator iterator = set.iterator();

        while (iterator.hasNext()){
            //System.out.println(iterator.next());
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println(entry.getKey()+" is "+entry.getValue());
        }
    }

}
