package SCENARIOS.libraryautomation.cleancode.business;

import SCENARIOS.libraryautomation.cleancode.business.entities.Book;
import SCENARIOS.libraryautomation.cleancode.business.entities.LibraryUser;

public class LibraryManager {

    public void processBook(Book book, BookOperation bookOperation) {
        bookOperation.execute(book);
    }

    public double calculateFine(LibraryUser libraryUser, int daysOverdue, FineCalculator fineCalculator) {
        return fineCalculator.calculate(libraryUser, daysOverdue);
    }
}