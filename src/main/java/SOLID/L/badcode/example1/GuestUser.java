package SOLID.L.badcode.example1;

// This class breaks Liskov Substitution Principle because it doesn't supports superclass behaviours ( eg. update password )
public class GuestUser extends User{
    @Override
    public void changePassword(String newPassword){
        throw new UnsupportedOperationException("Guests cannot update password");
    }
}