package SCENARIOS.payrollsystem.cleancode;


public class EmailService implements NotificationService{
    private void sendSalaryCaltulationInfo(String to, Double salary, String name) {
        String subject = "Maaş hesabınız hk.";
        String body = "Sayın " + name + ", maaşınız + " + salary + " olarak hesaplanmıştır.";

        System.out.println("Email gönderildi." + subject + ", " + body);
    }

    @Override
    public void notify(Employee employee) {
        sendSalaryCaltulationInfo(employee.getEmail(), employee.getSalary(), employee.getName());
    }
}