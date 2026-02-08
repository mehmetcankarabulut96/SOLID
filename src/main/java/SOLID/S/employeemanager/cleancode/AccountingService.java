package SOLID.S.employeemanager.cleancode;

public class AccountingService {

    public double calculatePay(Employee employee){
        double payPerHour = 15.30;
        return employee.getWorkHour() * payPerHour;
    }
}