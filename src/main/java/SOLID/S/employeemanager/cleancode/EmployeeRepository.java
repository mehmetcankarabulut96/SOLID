package SOLID.S.employeemanager.cleancode;

public class EmployeeRepository {

    public void save(Employee employee){
        System.out.println("Employee saved to db with id: " + employee.getId());
    }
}