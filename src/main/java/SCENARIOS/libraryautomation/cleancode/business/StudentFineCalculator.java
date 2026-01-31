package SCENARIOS.libraryautomation.cleancode.business;

import SCENARIOS.libraryautomation.cleancode.business.entities.LibraryUser;
import SCENARIOS.libraryautomation.cleancode.business.entities.Student;

public class StudentFineCalculator implements FineCalculator{

    @Override
    public double calculate(LibraryUser user, int daysOverdue) {
        return user.getFineRate() * daysOverdue;
    }
}