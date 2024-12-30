import java.sql.*;

public class Pro6 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kanadjava", "root", "");
            Statement st = conn.createStatement();

            String sqlQuery = "delete from students where city = 'Banglore'";

            int result = st.executeUpdate(sqlQuery);
            System.out.println(result+ " Records are Delete");

            st.close();
            conn.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
