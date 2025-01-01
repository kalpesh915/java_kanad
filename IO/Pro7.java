import java.util.Scanner;

public class Pro7 {
    public static void main(String[] args) {
        try{
            Scanner sc = new Scanner(System.in);
            String fname;
            int id;
            float fees;
            char gender;
            boolean result;

            fname = sc.nextLine();
            id = sc.nextInt();
            fees = sc.nextFloat();
            gender = (char) sc.nextByte();
            result = sc.nextBoolean();
            
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
