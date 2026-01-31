package SCENARIOS.payrollsystem.badcode;

import java.io.FileWriter;
import java.io.IOException;

public class EmployeeManager {

    public void processEmployee(Employee emp) {
        // salary calculation
        if (emp.getType().equals("FullTime")) {
            emp.setSalary(50000);
        } else if (emp.getType().equals("Contractor")) {
            emp.setSalary(emp.getHoursWorked() * 250);
        }

        // db operations
        String connectionString = "jdbc:mysql://localhost:3306/hr_db";
        System.out.println(emp.getName() + " saved to db. (Conn: " + connectionString + ")");

        // 3. reporting
        try {
            String report = "Employee Report: " + emp.getName() + ", Salary: " + emp.getSalary();
            FileWriter myWriter = new FileWriter("report_" + emp.getId() + ".txt");
            myWriter.write(report);
            myWriter.close();
            System.out.println("Sending report with email");
        } catch (IOException e) {
            System.out.println("Error while write to file");
        }
    }
}