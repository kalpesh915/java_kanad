import java.sql.*;

public class Pro4 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kanadjava", "root", "");
            Statement st = conn.createStatement();

            String sqlQuery = "insert into students (fname, lname, city) values ('Kanad', 'Joshi', 'Rajkot')";
            //String sqlQuery = "insert into students values ('Kanad', 'Joshi', 'Rajkot')";
            //String sqlQuery = "insert into students values (null, 'Kanad', 'Joshi', 'Rajkot', null, null)";
            int result = st.executeUpdate(sqlQuery);
            if(result == 1){
                System.out.println("New Row Created");
            }else{
                System.out.println("Error while Creating Row");
            }

            st.close();
            conn.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
