package SCENARIOS.libraryautomation.cleancode.business.entities;

public class Student extends User implements LibraryUser {

    public Student(String name){
        super.setName(name);
    }

    @Override
    public double getFineRate() {
        return 0.50;
    }
}