import java.util.ArrayList;

public class Pro11 {
    public static void main(String[] args) {
        try{
            ArrayList<String> students1 = new ArrayList<String>(10);
            ArrayList<String> students2 = new ArrayList<String>();

            students1.add("Kanad");
            students1.add("Karan");
            students1.add("Keyur");
            students1.add("Kamal");
            students1.add("Bimal");
            students1.add("Vraj");

            students2.add("Kanad");
            students2.add("Karan");

            //System.out.println(students1);
            //students1.remove("Kamal");
            //students1.remove(0);
            //System.out.println(students1);

            //students1.retainAll(students2);
            //System.out.println(students1);
            //System.out.println(students1.isEmpty());

            System.out.println(students1.size());
            //System.out.println(students1.ensureCapacity());
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}

