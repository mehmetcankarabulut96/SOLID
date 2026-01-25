package SOLID.L.cleancode.example1;

public class GuestUser extends User{
    @Override
    public void login() {
        System.out.println("guest login successful");
    }
}