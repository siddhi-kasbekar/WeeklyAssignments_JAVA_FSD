package dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {// factory class
	
	public static Connection getDBConnection() {//factory method
		Connection conn = null;
		try {
		FileReader reader = new FileReader("resources/database.properties");
		Properties properties = new Properties();
		properties.load(reader);
		
		String driverclass = properties.getProperty("driverclass");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");

		
		
		
			Class.forName(driverclass);
			conn = DriverManager.getConnection(url,username,password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		
		return conn;
		
	}

}
