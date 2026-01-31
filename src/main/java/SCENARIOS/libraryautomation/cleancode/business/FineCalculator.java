package SCENARIOS.libraryautomation.cleancode.business;

import SCENARIOS.libraryautomation.cleancode.business.entities.LibraryUser;

public interface FineCalculator {
    double calculate(LibraryUser user, int daysOverdue);
}