package SOLID.S.cleancode.example1;

public class Main {
    static void main() {
        EmployeeFacade employeeFacade = new EmployeeFacade();
        Employee newEmployee = new Employee(15, 80);

        employeeFacade.processEmployee(newEmployee);
    }
}