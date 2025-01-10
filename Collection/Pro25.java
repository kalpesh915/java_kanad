import java.util.*;
public class Pro25 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String >();

        map.put(1, "Rajkot");
        map.put(2, "Surat");
        map.put(5, "Ahamdabad");
        map.put(4, "Baroda");
        map.put(3, "Gandhinagar");

        map.entrySet()
                .stream()
                //.sorted(Map.Entry.comparingByKey())
                //.sorted(Map.Entry.comparingByValue())
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                //.forEach((x) -> System.out.println(x));
                .forEach(System.out::println);
    }

}
