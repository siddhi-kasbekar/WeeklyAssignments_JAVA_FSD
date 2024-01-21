package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo {

	public static void main(String[] args) {
		Connection conn = null;
		// step1
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// step 2
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hexaware_db", "root",
					"Sid@2002");

			//step 3
			String insert = "insert into Dept(Dno,Dname,location) values(70,'QA','Noida')";
			String update = "update Dept set location = 'Pune' where dno = 70";
			String delete = "delete from Dept where dno = 70";
			Statement stmt = conn.createStatement();

			// step 4
			int count = stmt.executeUpdate(delete);
			System.out.println(count + " records affected");
			
			//step 5 

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
