import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Pro1 {
    public static void collectionExample(){
        int dataArray[] = new int[]{11, 22, 33, 44, 55};
        List<Integer> dataList = new ArrayList<>();
        Map<Integer, String> dataMap = new HashMap<>();

        dataList.add(11);
        dataList.add(22);
        dataList.add(33);

        //System.out.println(dataList);

        dataMap.put(1, "Kanad");
        dataMap.put(2, "Keval");
        dataMap.put(1, "KANAD");

        //System.out.println(dataMap);

        System.out.println(dataList.get(0));
        System.out.println(dataMap.get(0));

        /*for(int x : dataList){
            System.out.print(" "+x);
        }*/

        for(Map.Entry<Integer, String> entry: dataMap.entrySet()){
            //System.out.println("Welcome "+entry);
            System.out.println("Welcome "+entry.getValue()+" ID is "+entry.getKey());
        }
    }

    public static void main(String[] args) {
        collectionExample();
    }
}
