import java.sql.*;

public class Pro2 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "");
            Statement st = conn.createStatement();

            String sqlQuery = "create database kanadJava";
            int result = st.executeUpdate(sqlQuery);
            if(result == 1){
                System.out.println("Database Created");
            }else{
                System.out.println("Error while Creating Database");
            }

            st.close();
            conn.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
