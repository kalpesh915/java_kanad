import java.sql.*;

public class Pro7 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kanadjava", "root", "");
            Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            String sqlQuery = "select * from students";

            ResultSet result = st.executeQuery(sqlQuery);

            while (result.next()){
                //System.out.println("Welcome "+result.getString(2)+" "+result.getString(3));
                //System.out.println("Welcome "+result.getString("fname")+" "+result.getString("lname")+" To "+result.getString("city"));
                System.out.println(result.getInt("id")+" Welcome "+result.getString("fname")+" "+result.getString("lname")+" To "+result.getString("city"));
            }
            result.previous();
            System.out.println(result.getInt("id")+" Welcome "+result.getString("fname")+" "+result.getString("lname")+" To "+result.getString("city"));
            st.close();
            conn.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
