package SOLID.L.badcode.example1;

public class Main {
    static void main() {
        User[] users = {new User(), new GuestUser()};

        for(User user: users){
            user.changePassword("1234");
        }
    }
}