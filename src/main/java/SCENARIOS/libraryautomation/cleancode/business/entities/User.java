package SCENARIOS.libraryautomation.cleancode.business.entities;

public abstract class User implements LibraryUser{
    private String name;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
}