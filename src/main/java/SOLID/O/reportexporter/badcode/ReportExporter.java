package SOLID.O.reportexporter.badcode;

public class ReportExporter {
    public void exportReport(String data, String format) {
        if (format.equalsIgnoreCase("PDF")) {
            System.out.println("Exporting data with PDF, " + data);
        } else if (format.equalsIgnoreCase("EXCEL")) {
            System.out.println("Exporting to Excel: " + data);
        }
        // new if else ?
    }
}