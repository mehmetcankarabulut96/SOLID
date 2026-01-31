package SCENARIOS.libraryautomation.cleancode.business;

import SCENARIOS.libraryautomation.cleancode.business.entities.Book;
import SCENARIOS.libraryautomation.cleancode.core.BookLogger;
import SCENARIOS.libraryautomation.cleancode.repository.BookRepository;

public class AddOperation implements BookOperation{
    private final BookRepository bookRepository;
    private final BookLogger[] bookLoggers;

    public AddOperation(BookRepository bookRepository, BookLogger[] bookLoggers) {
        this.bookRepository = bookRepository;
        this.bookLoggers = bookLoggers;
    }

    @Override
    public void execute(Book book) {
        bookRepository.save(book);

        for (BookLogger logger: bookLoggers){
            logger.log(book);
        }
    }
}