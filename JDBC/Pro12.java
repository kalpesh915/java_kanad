import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.*;
public class Pro12 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kanadjava", "root", "");
            PreparedStatement prepared = conn.prepareStatement("select * from images");
            ResultSet rs = prepared.executeQuery();
            while (rs.next()){
                Blob b = rs.getBlob(2);
                //System.out.print(" "+b);
                byte bytes[] = b.getBytes(1, (int)b.length());
                FileOutputStream fout = new FileOutputStream("img1.jpg");
                fout.write(bytes);
                fout.close();
            }
            conn.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
