import java.sql.*;

public class Pro3 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kanadjava", "root", "");
            Statement st = conn.createStatement();

            String sqlQuery = "create table students (id int auto_increment primary key, " +
                    "fname varchar(20), lname varchar(20), city varchar(20)," +
                    "created_at timestamp default current_timestamp, " +
                    "updated_at timestamp default current_timestamp on update current_timestamp)";
            int result = st.executeUpdate(sqlQuery);
            if(result == 1){
                System.out.println("Table Created");
            }else{
                System.out.println("Error while Creating Table");
            }

            st.close();
            conn.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
