import java.io.FileInputStream;
import java.sql.*;
public class Pro11 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kanadjava", "root", "");
            PreparedStatement prepared = conn.prepareStatement("insert into images (image) values (?)");
            FileInputStream fin = new FileInputStream("img8.jpg");
            prepared.setBinaryStream(1, fin);
            prepared.executeUpdate();
            System.out.println("File Uploaded on Database");
            conn.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
