package SOLID.S.customerservice.cleancode.domain;

public class Customer {
    private boolean locked;
    private String password;
    private Account defaultAccount;
    private boolean loggedIn;

    public void setLocked(boolean value){
        this.locked = value;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public Account getDefaultAccount(){
        return this.defaultAccount;
    }

    public String getPassword(){
        return this.password;
    }

    public boolean isLoggedIn(){
        return this.loggedIn;
    }

    public boolean isLocked(){
        return this.locked;
    }

    public void setLoggedIn(boolean b) {
        this.loggedIn = b;
    }
}