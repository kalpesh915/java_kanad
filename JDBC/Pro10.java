import java.sql.*;
public class Pro10 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kanadjava", "root", "");
            Statement statement = conn.createStatement();
            DatabaseMetaData dbmd = conn.getMetaData();
            System.out.println(dbmd.getDriverName());
            System.out.println(dbmd.getDriverVersion());
            System.out.println(dbmd.getUserName());
            System.out.println(dbmd.getDatabaseProductName());
            System.out.println(dbmd.getDatabaseProductVersion());
            String data[] = {"TABLE"};
            ResultSet rs = dbmd.getTables(null, null, null, data);

            while (rs.next()){
                System.out.println(rs.getString(1)+" : "+rs.getString(3));
            }
            conn.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
