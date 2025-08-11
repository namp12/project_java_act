package service;

import model.User;
import model.Role;

public class AuthService {
    private UserService userService; // để tìm user
    private User currentUser;        // user hiện đang đăng nhập

    // Constructor
    public AuthService(UserService userService) {
        this.userService = userService;
    }

    /**
     * Đăng nhập
     * username tên đăng nhập
     * password mật khẩu
     * true nếu đăng nhập thành công, false nếu sai
     */
    public boolean login(String username, String password) {
        User user = userService.findByUsername(username);
        if (user != null && user.getPassword().equals(password)) {
            currentUser = user;
            return true;
        }
        return false;
    }

    /**
     * Đăng xuất
     */
    public void logout() {
        currentUser = null;
    }

    /**
     * Lấy thông tin user hiện tại
     */
    public User getCurrentUser() {
        return currentUser;
    }

    /**
     * Kiểm tra đã đăng nhập chưa
     */
    public boolean isLoggedIn() {
        return currentUser != null;
    }

    /**
     * Kiểm tra quyền
     * @param role quyền cần kiểm tra
     * @return true nếu user hiện tại có quyền này
     */
    public boolean hasRole(Role role) {
        return currentUser != null && currentUser.getRole() == role;
    }
}
