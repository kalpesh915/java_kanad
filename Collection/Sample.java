import java.io.FileInputStream;
import java.io.IOException;

public class Sample {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("data1.txt");
            System.out.println(10 / 0);
            throw  new IOException("Sample");
        }catch (ArithmeticException err){
            System.out.println("Error is "+err);
        }catch (IOException err){
            System.out.println("Error is "+err);
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
