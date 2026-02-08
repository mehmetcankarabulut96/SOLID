package SOLID.L.passwordchanger.cleancode;

public class GuestUser extends User {
    @Override
    public void login() {
        System.out.println("guest login successful");
    }
}