package SOLID.L.passwordchanger.cleancode;

public class Main {
    static void main() {
        User[] users = {new AdminUser(), new GuestUser()};

        for(User user: users){
            user.login();
        }
    }
}