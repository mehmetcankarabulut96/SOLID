package SOLID.S.employeemanager.cleancode;

public class HRService {

    public int reportHours(Employee employee){
        int weekendHours = 30;
        return employee.getWorkHour() + weekendHours;
    }
}