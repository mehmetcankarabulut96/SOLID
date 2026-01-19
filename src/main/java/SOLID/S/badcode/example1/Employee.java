package SOLID.S.badcode.example1;

// This class violates the SPR because those three methods are responsible to three very different actors. ( Clean Architecture - Robert C. Martin )
// In this structure, if we update one method, all other methods that haven't been updated will have to be recompiled.
public class Employee {
    private int workHour;

    // responsible to accounting department
    public double calculatePay(){
        double payPerHour = 15.30;
        return this.workHour * payPerHour;
    }

    // responsible to human resources department
    public int reportHours(){
        int weekendHours = 30;
        return workHour + weekendHours;
    }

    // responsible to database administrators
    public void save(){
        System.out.println("saved employee to db");
    }
}