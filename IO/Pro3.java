import java.io.FileOutputStream;

public class Pro3 {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("data.txt");
            String data = "Kanad Joshi From Rajkot";
            byte data1[] = data.getBytes();
            fout.write(data1);
            fout.close();
            System.out.println("Writing Completed");
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
