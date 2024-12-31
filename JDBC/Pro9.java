import java.sql.*;
public class Pro9 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kanadjava", "root", "");
            Statement statement = conn.createStatement();
            String sqlQuery = "select * from students";
            ResultSet resultSet = statement.executeQuery(sqlQuery);
            ResultSetMetaData rsmd = resultSet.getMetaData();

            System.out.println(rsmd.getColumnCount());
            System.out.println(rsmd.getColumnLabel(1));
            System.out.println(rsmd.getColumnType(1));
            System.out.println(rsmd.getColumnType(3));
            System.out.println(rsmd.getColumnType(6));
            System.out.println(rsmd.getColumnTypeName(6));
            System.out.println(rsmd.getTableName(1));
            conn.close();
        }catch (Exception err){
            System.out.println("Error is "+err);
        }
    }
}
