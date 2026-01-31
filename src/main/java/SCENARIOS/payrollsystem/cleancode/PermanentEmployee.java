package SCENARIOS.payrollsystem.cleancode;

public class PermanentEmployee extends Employee implements AnnualLeaveRequester{
    @Override
    public void requestAnnualLeave() {
        System.out.println("Requested annual leave");
    }

    @Override
    public void calculateSalary() {
        this.setSalary(this.getHoursWorked() * 250);
    }
}