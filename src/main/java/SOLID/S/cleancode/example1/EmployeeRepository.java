package SOLID.S.cleancode.example1;

public class EmployeeRepository {

    public void save(Employee employee){
        System.out.println("Employee saved to db with id: " + employee.getId());
    }
}