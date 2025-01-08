import java.util.ArrayList;

public class Pro10 {
    public static void main(String[] args) {
        try{
            ArrayList<String> students1 = new ArrayList<String>();
            ArrayList<String> students2 = new ArrayList<String>();
            ArrayList<String> students3 = new ArrayList<String>();

            students1.add("Kanad");
            students1.add("Karan");

            students2.add("Keyur");
            students2.add("Kamal");

            students3.add("Bimal");
            students3.add("Vraj");

            //System.out.println(students1);
            //System.out.println(students2);

            //students1.addAll(students2);
            //System.out.println(students1);

            students1.addAll(students2);
            students1.addAll(1, students3);
            System.out.println(students1);
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
