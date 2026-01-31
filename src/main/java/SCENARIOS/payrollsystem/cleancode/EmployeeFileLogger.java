package SCENARIOS.payrollsystem.cleancode;

import java.io.FileWriter;
import java.io.IOException;

public class EmployeeFileLogger {

    public void log(String file, String message){
        try {
            FileWriter myWriter = new FileWriter(file);
            myWriter.write(message);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("Error while log to file");
        }
    }
}