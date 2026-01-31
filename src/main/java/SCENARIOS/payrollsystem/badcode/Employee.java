package SCENARIOS.payrollsystem.badcode;

public class Employee {
    private int id;
    private String name;
    private String type; // "FullTime", "Contractor", "Intern"
    private double salary;
    private int hoursWorked;

    public int getId() { return id; }
    public String getName() { return name; }
    public String getType() { return type; }
    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
    public int getHoursWorked() { return hoursWorked; }
}