package SOLID.L.cleancode.example1;

public class Main {
    static void main() {
        User[] users = {new AdminUser(), new GuestUser()};

        for(User user: users){
            user.login();
        }
    }
}