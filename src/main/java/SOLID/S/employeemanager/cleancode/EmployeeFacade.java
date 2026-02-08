package SOLID.S.employeemanager.cleancode;

public class EmployeeFacade {
    private final AccountingService accountingService;
    private final HRService hrService;
    private final EmployeeRepository employeeRepository;

    public EmployeeFacade(){
        this.accountingService = new AccountingService();
        this.hrService = new HRService();
        this.employeeRepository = new EmployeeRepository();
    }

    public void processEmployee(Employee employee){
        double pay = this.accountingService.calculatePay(employee);
        int hours = this.hrService.reportHours(employee);
        this.employeeRepository.save(employee);
    }
}