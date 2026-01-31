package SCENARIOS.libraryautomation.badcode;

import java.util.*;
import java.io.*;

public class LibraryManager {
    private final List<String> books = new ArrayList<>();

    // Violation of Single Responsibility Principle: This code can be changed by two reasons: adding and removing books
        // Because adding and removing books serves different business actions and they shouldn't managed by one method
    public void processBook(String title, String author, String action) {
        if (action.equals("add")) {
            books.add(title);
            System.out.println("Book added: " + title + " by " + author);

            try (FileWriter writer = new FileWriter("library_log.txt", true)) {
                writer.write("Added: " + title + "\n");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else if (action.equals("delete")) {
            books.remove(title);
        }
    }

    // Violation of Single Responsibility Principle: Students would be affected of changes made to the professors
    // Violation of Open-Closed Principle: If we need extend this while adding another user type, we would modify this code
    public double calculateFine(String userType, int daysOverdue) {
        if (userType.equals("Student")) {
            return daysOverdue * 0.50;
        } else if (userType.equals("Professor")) {
            return daysOverdue * 0.25;
        } else {
            return daysOverdue * 1.00;
        }
    }
}