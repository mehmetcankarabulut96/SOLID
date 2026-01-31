package SCENARIOS.libraryautomation.cleancode.business;

import SCENARIOS.libraryautomation.cleancode.business.entities.Book;
import SCENARIOS.libraryautomation.cleancode.repository.BookRepository;

public class DeleteOperation implements BookOperation{
    private final BookRepository bookRepository;

    public DeleteOperation(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void execute(Book book) {
        bookRepository.delete(book);
    }
}