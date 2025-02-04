package pages;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {
	public static Connection getConnection() {
		Connection conn = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // com.mysql.cj.jdbc.Driver
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/kanadjava", "root", "");
			
		}catch (Exception e) {
			System.out.println("Error is "+e);
		}
		
		return conn;
	}
	
	public static int save(Emp e) {
		int status = 0;
			try {
				Connection conn = EmpDao.getConnection();
				PreparedStatement statement = conn.prepareStatement("insert into users (name, password, email, country) values (?,?,?,?)");
				statement.setString(1, e.getName());
				statement.setString(2, e.getPassword());
				statement.setString(3, e.getEmail());
				statement.setString(4, e.getCountry());
				
				status = statement.executeUpdate(); // 1 or 0
				
				conn.close();
			}catch (Exception err) {
				System.out.println("Error is " +err);
			}
		return status;
	}
	
	public static int update(Emp e) {
		int status = 0;
		try {
			Connection conn = EmpDao.getConnection();
			PreparedStatement statement = conn.prepareStatement("update users set name = ?, password = ?, email = ?, country = ? where id = ?");
			statement.setString(1, e.getName());
			statement.setString(2, e.getPassword());
			statement.setString(3, e.getEmail());
			statement.setString(4, e.getCountry());
			statement.setInt(5, e.getId());
			status = statement.executeUpdate();
			conn.close();
			
		}catch (Exception err) {
			System.out.println("Error is "+err);
		}
		return status;
	}
	
	public static int delete(int id) {
		int status = 0;
		try {
			Connection conn = EmpDao.getConnection();
			PreparedStatement statement = conn.prepareStatement("delete from users where id = ?");
			statement.setInt(1, id);
			status = statement.executeUpdate();
			conn.close();
		}catch (Exception err) {
			System.out.println("Error is "+err);
		}
		return status;
	}
	
	
	public static Emp getEmpById(int id) {
		Emp emp = new Emp();
		
		try {
			Connection conn = EmpDao.getConnection();
			PreparedStatement statement = conn.prepareStatement("select * from users where id = ?");
			statement.setInt(1, id);
			
			ResultSet result = statement.executeQuery();
			
			while (result.next()) {
				emp.setId(result.getInt("id"));
				emp.setName(result.getString("name"));
				emp.setPassword(result.getString("password"));
				emp.setEmail(result.getString("email"));
				emp.setCountry(result.getString("country"));
			}
			conn.close();
		}catch (Exception err) {
			System.out.println("Error is "+err);
		}
		
		return emp;
	}
	
	public static List<Emp> getAllEmployees(){
		List<Emp> list = new ArrayList<Emp>();
		
		try {
			Connection conn = EmpDao.getConnection();
			PreparedStatement statement = conn.prepareStatement("select * from users");
			
			ResultSet result = statement.executeQuery();
			
			while(result.next()) {
				Emp emp = new Emp();
				emp.setId(result.getInt("id"));
				emp.setName(result.getString("name"));
				emp.setPassword(result.getString("password"));
				emp.setEmail(result.getString("email"));
				emp.setCountry(result.getString("country"));
				list.add(emp);
			}
			
			conn.close();
			
		}catch (Exception err) {
			System.out.println("Error is "+err);
		}
		
		return list;
	}
}
