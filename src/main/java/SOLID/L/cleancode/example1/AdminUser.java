package SOLID.L.cleancode.example1;

public class AdminUser extends User implements PasswordChangeable{
    @Override
    public void changePassword(String newPassword) {
        System.out.println("admin password changed: " + newPassword);
    }

    @Override
    public void login() {
        System.out.println("admin login successful");
    }
}