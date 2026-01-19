package SOLID.S.cleancode.example1;

public class AccountingService {

    public double calculatePay(Employee employee){
        double payPerHour = 15.30;
        return employee.getWorkHour() * payPerHour;
    }
}