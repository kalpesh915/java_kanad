import java.util.*;

enum Days1  {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};

class Pro33 {
    public static void main(String[] args) {
        EnumMap<Days1, String> days = new EnumMap<Days1,String>(Days1.class);

        days.put(Days1.SUNDAY, "Holiday");
        days.put(Days1.MONDAY, "Office day");
        days.put(Days1.TUESDAY, "Office day");
        days.put(Days1.WEDNESDAY, "Office day");
        days.put(Days1.THURSDAY, "Office day");
        days.put(Days1.FRIDAY, "Half day");
        days.put(Days1.SATURDAY, "Holiday");

        for(Map.Entry<Days1, String> entry : days.entrySet()){
            System.out.println(entry.getKey()+" is "+entry.getValue());
        }
    }
}
