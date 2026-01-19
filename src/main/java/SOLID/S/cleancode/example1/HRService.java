package SOLID.S.cleancode.example1;

public class HRService {

    public int reportHours(Employee employee){
        int weekendHours = 30;
        return employee.getWorkHour() + weekendHours;
    }
}