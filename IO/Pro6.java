import java.io.FileReader;

public class Pro6 {
    public static void main(String[] args) {
        try{
            FileReader fileReader = new FileReader("data1.txt");

            //System.out.println(i);
            int i = 0;
            while (i != -1){
                i = fileReader.read();
                if(i == -1){
                    break;
                }
                System.out.print((char) i);
            }
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
