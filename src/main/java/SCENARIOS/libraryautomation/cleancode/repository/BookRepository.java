package SCENARIOS.libraryautomation.cleancode.repository;

import SCENARIOS.libraryautomation.cleancode.business.entities.Book;

public interface BookRepository {
    void save(Book book);
    void delete(Book book);
}