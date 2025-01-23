import java.util.*;
import java.util.stream.Collectors;

public class Pro35{
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<Integer>();

        data.add(911);
        data.add(151);
        data.add(141);
        data.add(311);
        data.add(141);
        data.add(116);
        data.add(171);
        data.add(611);

//        System.out.println(Collections.max(data));
//        System.out.println(Collections.min(data));
//        Collections.sort(data, Comparator.reverseOrder());
//        System.out.println(data);

        //System.out.println(data.stream().sorted().collect(Collectors.toCollection()));
        //data.stream().sorted().forEach(System.out::print);
        //int ans = data.stream().max(Integer::compare).get();
        //Optional<Integer> ans = data.stream().max(Comparator.reverseOrder());
        int ans = data.stream().reduce(0, (Integer integer1, Integer integer2) -> integer1 + integer2);
        System.out.println(""+ans);
    }
}
