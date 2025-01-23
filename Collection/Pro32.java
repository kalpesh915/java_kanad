import java.util.*;

enum Days  {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};

public class Pro32 {
    public static void main(String[] args) {
        //Set <Days> daysSet = EnumSet.of(Days.SUNDAY, Days.SATURDAY);
        Set <Days> daysSet = EnumSet.allOf(Days.class);

        Iterator iterator = daysSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
