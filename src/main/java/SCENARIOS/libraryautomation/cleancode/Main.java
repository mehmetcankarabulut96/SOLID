package SCENARIOS.libraryautomation.cleancode;

import SCENARIOS.libraryautomation.cleancode.business.*;
import SCENARIOS.libraryautomation.cleancode.business.entities.Book;
import SCENARIOS.libraryautomation.cleancode.business.entities.LibraryUser;
import SCENARIOS.libraryautomation.cleancode.business.entities.Professor;
import SCENARIOS.libraryautomation.cleancode.business.entities.User;
import SCENARIOS.libraryautomation.cleancode.core.BookLogger;
import SCENARIOS.libraryautomation.cleancode.core.ConsoleBookLogger;
import SCENARIOS.libraryautomation.cleancode.core.FileBookLogger;
import SCENARIOS.libraryautomation.cleancode.repository.BookRepository;
import SCENARIOS.libraryautomation.cleancode.repository.InMemoryBookRepository;

public class Main {
    static void main() {
        System.out.println("App initialized ...");

        LibraryManager libraryManager = new LibraryManager();

        BookLogger[] loggers = {new ConsoleBookLogger(), new FileBookLogger()};
        BookRepository bookRepository = new InMemoryBookRepository();
        BookOperation bookOperation = new AddOperation(bookRepository, loggers);
        Book book = new Book("Can", "Last Day on Earth");
        libraryManager.processBook(book, bookOperation);

        User libraryUser = new Professor("Mehmet");
        FineCalculator fineCalculator = new ProfessorFineCalculator();
        double fine = libraryManager.calculateFine(libraryUser, 4, fineCalculator);

        System.out.println("Fine for library user " + libraryUser.getName() + ": " + fine);
    }
}