package SCENARIOS.payrollsystem.cleancode;

public class MySqlEmployeeRepository implements EmployeeRepository{
    private static final String connection = "jdbc:mysql://localhost:3306/hr_db";

    @Override
    public void save(Employee emp) {
        System.out.println(emp.getName() + " saved to mysql db. (Conn: " + connection + ")");
    }
}