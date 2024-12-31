import java.sql.*;

public class Pro14 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kanadjava", "root", "");
            Statement st = conn.createStatement();
            conn.setAutoCommit(false);
            String sqlQuery = "insert into students (fname, lname, city) values ('Kanad', 'Joshi', 'Rajkot')";
            st.addBatch(sqlQuery);
            st.addBatch(sqlQuery);
            st.addBatch(sqlQuery);
            st.addBatch(sqlQuery);
            st.addBatch(sqlQuery);
            st.addBatch(sqlQuery);
            st.addBatch(sqlQuery);
            st.addBatch(sqlQuery);
            st.addBatch(sqlQuery);

            st.executeBatch();
            conn.commit();
            st.close();
            conn.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
