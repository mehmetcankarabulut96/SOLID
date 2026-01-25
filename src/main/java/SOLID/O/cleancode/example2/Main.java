package SOLID.O.cleancode.example2;

public class Main {
    static void main() {
        ExportManager exportManager = new ExportManager();

        ExporterService exporterService = new PDFExporter();
        exportManager.createExport(exporterService, "test");
    }
}