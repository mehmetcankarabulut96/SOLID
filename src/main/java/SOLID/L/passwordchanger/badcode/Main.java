package SOLID.L.passwordchanger.badcode;

public class Main {
    static void main() {
        User[] users = {new User(), new GuestUser()};

        for(User user: users){
            user.changePassword("1234");
        }
    }
}