import java.io.FileInputStream;

public class Pro4 {
    public static void main(String[] args) {
        try{
            FileInputStream fin = new FileInputStream("data.txt");
            int i;
            //i = fin.read();
            //System.out.println((char) i);

            while((i = fin.read()) != -1){
                //System.out.print(i);
                System.out.print((char) i);
            }
            fin.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
