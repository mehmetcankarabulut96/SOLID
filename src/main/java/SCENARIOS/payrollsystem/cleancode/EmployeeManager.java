package SCENARIOS.payrollsystem.cleancode;

public class EmployeeManager {
    private final SalaryCalculator salaryCalculator;
    private final EmployeeRepository employeeRepository;
    private final EmployeeLogger employeeLogger;
    private final NotificationService notificationService;

    public EmployeeManager(SalaryCalculator salaryCalculator, EmployeeRepository employeeRepository, EmployeeLogger employeeLogger, NotificationService notificationService){
        this.salaryCalculator = salaryCalculator;
        this.employeeRepository = employeeRepository;
        this.employeeLogger = employeeLogger;
        this.notificationService = notificationService;
    }

    public void processEmployee(Employee employee){

        // 1. business logic
        salaryCalculator.calculate(employee);

        // 2. save
        employeeRepository.save(employee);

        // 3. log
        employeeLogger.log(employee);

        // 4. notify
        notificationService.notify(employee);
    }
}