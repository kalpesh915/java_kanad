import java.io.FileOutputStream;

public class Pro2 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("data.txt");
            fout.write(65);
            fout.close();
            System.out.println("Writing Completed");
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
