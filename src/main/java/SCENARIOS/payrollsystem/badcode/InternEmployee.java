package SCENARIOS.payrollsystem.badcode;

public class InternEmployee extends BaseEmployee{
    @Override
    public void requestAnnualLeave() {
        throw new UnsupportedOperationException("Interns can not request annual leave");
    }
}