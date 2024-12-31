import java.sql.*;

public class Pro13 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kanadjava", "root", "");
            Statement st = conn.createStatement();
            conn.setAutoCommit(false);
            String sqlQuery = "insert into students (fname, lname, city) values ('Kanad', 'Joshi', 'Rajkot')";
            int result = st.executeUpdate(sqlQuery);
            if(result == 1){
                System.out.println("New Row Created");
            }else{
                System.out.println("Error while Creating Row");
            }
            conn.commit();
            st.close();
            conn.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
