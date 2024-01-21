package crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PSDemo {
	
	public static void main(String[] args) {
		Connection conn = DBUtil.getDBConnection();
		
		//insert
		
//		String insert = "insert into dept values(?, ?,?)";//positional param
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(insert);
//			pstmt.setInt(1, 80);
//			pstmt.setString(2, "QA");
//			pstmt.setString(3, "Noida");
//			
//			int count = pstmt.executeUpdate();
//			System.out.println(count+" rows affected");
//			
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
		
		//update
		
//		String update = "update dept set dname=?, location = ? where dno=?";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(update);
//			
//			pstmt.setString(1, "logistics");
//			pstmt.setString(2, "Pune");
//			pstmt.setInt(3, 80);
//			
//			int count = pstmt.executeUpdate();
//			System.out.println(count+" records updated");
//			
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
		
		//select 
		
		String select = "select dno, dname, location from dept where dno = ?";
		try {
			PreparedStatement pstmt = conn.prepareStatement(select);
			
			
			pstmt.setInt(1, 30);
			
			ResultSet rs  = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("dno")+" "+rs.getString("dname")+" "+rs.getString("location"));
				
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		//select all
//		String selectAll = "select dno, dname, location from dept";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(selectAll);
//			
//		
//			
//			ResultSet rs  = pstmt.executeQuery();
//			while(rs.next()) {
//				System.out.println(rs.getInt("dno")+" "+rs.getString("dname")+" "+rs.getString("location"));
//				
//			}
//			
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		
		
		
		
		
		// write for delete 
//		String delete = "delete from dept where dno = ?";
//		try {
//			PreparedStatement pstmt = conn.prepareStatement(delete);
//			
//			
//			pstmt.setInt(1, 80);
//			
//			int count  = pstmt.executeUpdate();
//			System.out.println(count+ " record deleted");
//			 
//			
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		
	}
	
	
	

}
