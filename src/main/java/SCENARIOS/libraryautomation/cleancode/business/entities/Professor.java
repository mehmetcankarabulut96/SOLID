package SCENARIOS.libraryautomation.cleancode.business.entities;

public class Professor extends User implements LibraryUser{

    public Professor(String name){
        super.setName(name);
    }

    @Override
    public double getFineRate() {
        return 0.15;
    }
}