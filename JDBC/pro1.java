import java.sql.*;

public class pro1 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("show databases");

            while (rs.next()){
                System.out.println(" "+rs.getString(1));
            }
            conn.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
