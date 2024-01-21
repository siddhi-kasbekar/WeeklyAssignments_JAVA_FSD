package dao;

import java.util.List;

import entity.User;



import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entity.User;

public class UserManagementImpl implements IUserManagement {

    Connection conn = null;

    public UserManagementImpl() {
        conn = DBUtil.getDBConnection();
    }

    @Override
    public int addUser(User user) {
        String insert = "INSERT INTO Users (UserName, Password, Name, Gender, ContactNumber, Email, Address) VALUES (?, ?, ?, ?, ?, ?, ?)";

        int count = 0;

        try {
            PreparedStatement pstmt = conn.prepareStatement(insert);

            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getName());
            pstmt.setString(4, user.getGender());
            pstmt.setString(5, user.getContactNumber());
            pstmt.setString(6, user.getEmail());
            pstmt.setString(7, user.getAddress());

            count = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
    }

    @Override
    public int updateUser(User user) {
        String update = "UPDATE Users SET UserName=?, Password=?, Name=?, Gender=?, ContactNumber=?, Email=?, Address=? WHERE UserID=?";

        int count = 0;

        try {
            PreparedStatement pstmt = conn.prepareStatement(update);

            pstmt.setString(1, user.getUserName());
            pstmt.setString(2, user.getPassword());
            pstmt.setString(3, user.getName());
            pstmt.setString(4, user.getGender());
            pstmt.setString(5, user.getContactNumber());
            pstmt.setString(6, user.getEmail());
            pstmt.setString(7, user.getAddress());
            pstmt.setLong(8, user.getUserID());

            count = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
    }

    @Override
    public int deleteUser(Long userId) {
        int count = 0;

        String delete = "DELETE FROM Users WHERE UserID = ?";

        try {
            PreparedStatement pstmt = conn.prepareStatement(delete);

            pstmt.setLong(1, userId);

            count = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return count;
    }

    @Override
    public User getUserById(Long userId) {
        User user = null;

        String select = "SELECT * FROM Users WHERE UserID = ?";

        try {
            PreparedStatement pstmt = conn.prepareStatement(select);

            pstmt.setLong(1, userId);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                user = new User(
                        rs.getLong("UserID"),
                        rs.getString("UserName"),
                        rs.getString("Password"),
                        rs.getString("Name"),
                        rs.getString("Gender"),
                        rs.getString("ContactNumber"),
                        rs.getString("Email"),
                        rs.getString("Address")
                );
                break;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return user;
    }

    @Override
    public List<User> getAllUsers() {
        String selectAll = "SELECT * FROM Users";

        List<User> list = new ArrayList<>();

        try {
            PreparedStatement pstmt = conn.prepareStatement(selectAll);

            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                User user = new User(
                        rs.getLong("UserID"),
                        rs.getString("UserName"),
                        rs.getString("Password"),
                        rs.getString("Name"),
                        rs.getString("Gender"),
                        rs.getString("ContactNumber"),
                        rs.getString("Email"),
                        rs.getString("Address")
                );

                list.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }
}
