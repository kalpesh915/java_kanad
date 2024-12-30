import java.sql.*;

public class Pro5 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kanadjava", "root", "");
            Statement st = conn.createStatement();

            String sqlQuery = "update students set city = 'Banglore'";

            int result = st.executeUpdate(sqlQuery);
            System.out.println(result+ " Records are Updated");

            st.close();
            conn.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
