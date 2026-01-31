package SCENARIOS.libraryautomation.cleancode.business;

import SCENARIOS.libraryautomation.cleancode.business.entities.LibraryUser;

public class ProfessorFineCalculator implements FineCalculator{
    @Override
    public double calculate(LibraryUser user, int daysOverdue) {
        return user.getFineRate() * daysOverdue;
    }
}