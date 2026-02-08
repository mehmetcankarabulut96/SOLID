package SOLID.L.passwordchanger.cleancode;

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