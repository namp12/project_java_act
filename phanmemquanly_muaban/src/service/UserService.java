package service;

import model.User;
import model.Role;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private List<User> userList;

    public UserService() {
        this.userList = new ArrayList<>();

        // Dữ liệu mẫu: thêm tài khoản admin mặc định
        userList.add(new User("admin", "admin123", Role.ADMIN));
    }

    // Thêm người dùng mới
    public void addUser(User user) {
        userList.add(user);
    }

    // Lấy danh sách tất cả người dùng
    public List<User> getAllUsers() {
        return userList;
    }

    // Tìm người dùng theo tên đăng nhập
    public User findByUsername(String username) {
        for (User user : userList) {
            if (user.getUsername().equalsIgnoreCase(username)) {
                return user;
            }
        }
        return null;
    }

    // Xóa người dùng
    public boolean deleteUser(String username) {
        return userList.removeIf(u -> u.getUsername().equalsIgnoreCase(username));
    }

    // Cập nhật người dùng (cập nhật mật khẩu & vai trò)
    public boolean updateUser(User updatedUser) {
        for (int i = 0; i < userList.size(); i++) {
            User current = userList.get(i);
            if (current.getUsername().equalsIgnoreCase(updatedUser.getUsername())) {
                userList.set(i, updatedUser);
                return true;
            }
        }
        return false;
    }

    // Kiểm tra đăng nhập
    public boolean validateLogin(String username, String password) {
        User user = findByUsername(username);
        return user != null && user.getPassword().equals(password);
    }

    // Lấy vai trò của người dùng
    public Role getUserRole(String username) {
        User user = findByUsername(username);
        return user != null ? user.getRole() : null;
    }
}
