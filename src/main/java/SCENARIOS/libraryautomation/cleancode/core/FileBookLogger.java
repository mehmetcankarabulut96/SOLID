package SCENARIOS.libraryautomation.cleancode.core;

import SCENARIOS.libraryautomation.cleancode.business.entities.Book;

import java.io.FileWriter;
import java.io.IOException;

public class FileBookLogger implements BookLogger{

    @Override
    public void log(Book book) {
        try (FileWriter writer = new FileWriter("library_log.txt", true)) {
            writer.write("Added: " + book.title + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}