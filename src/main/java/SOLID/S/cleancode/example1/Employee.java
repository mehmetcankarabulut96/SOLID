package SOLID.S.cleancode.example1;

public class Employee {
    private final int id;
    private final int workHour;

    public Employee(int id, int workHour){
        this.id = id;
        this.workHour = workHour;
    }

    public int getId(){
        return this.id;
    }

    public int getWorkHour(){
        return this.workHour;
    }
}