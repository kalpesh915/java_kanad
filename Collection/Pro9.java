import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Pro9 {
    public static void main(String[] args) {
        try{
            ArrayList<String> students = new ArrayList<String>();
            students.add("Kanad");
            students.add("Kamal");
            students.add("Kashyap");
            students.add("Kartik");
            students.add("Karan");

            FileOutputStream fout = new FileOutputStream("myfile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            oos.writeObject(students);
            oos.close();
            fout.close();

            FileInputStream fin = new FileInputStream("myfile");
            ObjectInputStream oin = new ObjectInputStream(fin);
            ArrayList list = (ArrayList) oin.readObject();
            System.out.println(list);
            fin.close();
            oin.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
