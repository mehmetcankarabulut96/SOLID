package SCENARIOS.payrollsystem.cleancode;

public class InternEmployee extends Employee{

    @Override
    public void calculateSalary() {
        this.setSalary(50000);
    }
}