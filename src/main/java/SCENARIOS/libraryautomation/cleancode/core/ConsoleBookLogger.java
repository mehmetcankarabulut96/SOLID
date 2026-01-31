package SCENARIOS.libraryautomation.cleancode.core;

import SCENARIOS.libraryautomation.cleancode.business.entities.Book;

public class ConsoleBookLogger implements BookLogger{
    @Override
    public void log(Book book) {
        System.out.println("Book added: " + book.title + " by " + book.author);
    }
}