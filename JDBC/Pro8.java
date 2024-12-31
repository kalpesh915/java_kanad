import java.sql.*;
public class Pro8 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kanadjava", "root", "");
            PreparedStatement prepared = conn.prepareStatement("insert into students (fname, lname, city) values (?, ?, ?)");
            prepared.setString(1, "Kanda");
            prepared.setString(2, "Joshi");
            prepared.setString(3, "Rajkot");
            int ans = prepared.executeUpdate();
            System.out.println(ans);
            conn.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
