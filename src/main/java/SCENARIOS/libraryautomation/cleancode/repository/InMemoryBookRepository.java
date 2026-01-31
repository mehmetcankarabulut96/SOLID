package SCENARIOS.libraryautomation.cleancode.repository;

import SCENARIOS.libraryautomation.cleancode.business.entities.Book;

import java.util.ArrayList;
import java.util.List;

public class InMemoryBookRepository implements BookRepository {
    private final List<String> books = new ArrayList<>();

    @Override
    public void save(Book book) {
        books.add(book.title);
    }

    @Override
    public void delete(Book book) {
        books.remove(book.title);
    }
}