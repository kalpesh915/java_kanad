import java.io.FileWriter;

public class Pro5 {
    public static void main(String[] args) {
        try{
            FileWriter fwriter = new FileWriter("data1.txt");
            String data = "Java IO Example With IO Package";
            fwriter.write(data);
            System.out.println("Writing Completed");
            fwriter.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
