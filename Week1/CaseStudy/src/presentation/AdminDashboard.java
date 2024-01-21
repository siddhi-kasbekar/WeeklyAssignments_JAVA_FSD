package presentation;

import java.util.List;
import java.util.Scanner;
import dao.IUserManagement;
import dao.UserManagementImpl;
import entity.User;

public class AdminDashboard {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        IUserManagement userDao = new UserManagementImpl();

        boolean flag = true;

        while (flag) {
            System.out.println("****USER MANAGEMENT SYSTEM ***");
            System.out.println("1. Add User");
            System.out.println("2. Update User");
            System.out.println("3. Delete User");
            System.out.println("4. View User by ID");
            System.out.println("5. View All Users");
            System.out.println("6. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    User user = readUserData();
                    int count = userDao.addUser(user);
                    System.out.println(count + " user added successfully");
                    break;

                case 2:
                    User userToUpdate = readUserData();
                    int updateCount = userDao.updateUser(userToUpdate);
                    System.out.println(updateCount + " user updated successfully");
                    break;

                case 3:
                    System.out.println("Enter UserID of user to be deleted:");
                    long userIdToDelete = scanner.nextLong();
                    int deleteCount = userDao.deleteUser(userIdToDelete);
                    System.out.println(deleteCount + " user deleted");
                    break;

                case 4:
                    System.out.println("Enter UserID:");
                    long userIdToView = scanner.nextLong();
                    User userToView = userDao.getUserById(userIdToView);

                    if (userToView != null) {
                        System.out.println(userToView);
                    } else {
                        System.out.println("No user found with the specified UserID.");
                    }
                    break;

                case 5:
                    List<User> userList = userDao.getAllUsers();
                    userList.forEach(System.out::println);
                    break;

                case 6:
                    System.out.println("Thank you! Visit again.");
                    flag = false;
                    break;

                default:
                    break;
            }
        }
    }

    public static User readUserData() {
        System.out.println("Enter UserID:");
        long userId = scanner.nextLong();
        scanner.nextLine(); // consume the newline character

        System.out.println("Enter UserName:");
        String userName = scanner.nextLine();

        System.out.println("Enter Password:");
        String password = scanner.nextLine();

        System.out.println("Enter Name:");
        String name = scanner.nextLine();

        System.out.println("Enter Gender:");
        String gender = scanner.nextLine();

        System.out.println("Enter ContactNumber:");
        String contactNumber = scanner.nextLine();

        System.out.println("Enter Email:");
        String email = scanner.nextLine();

        System.out.println("Enter Address:");
        String address = scanner.nextLine();

        User user = new User(userId, userName, password, name, gender, contactNumber, email, address);
        return user;
    }
}
