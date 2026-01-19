package SOLID.S.cleancode.example2;

public class Customer {
    private final String email;
    private final String number;

    public Customer(String email, String number){
        this.email = email;
        this.number = number;
    }

    public String getEmail(){
        return this.email;
    }

    public String getNumber(){
        return this.number;
    }
}
