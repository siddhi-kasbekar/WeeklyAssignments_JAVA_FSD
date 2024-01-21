package dao;

import java.util.List;

import entity.User;

public interface IUserManagement {

    // Create
    int addUser(User user);

    // Read
    User getUserById(Long userId);
    List<User> getAllUsers();

    // Update
    int updateUser(User user);

    // Delete
    int deleteUser(Long userId);
}

