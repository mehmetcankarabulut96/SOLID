package SOLID.O.reportexporter.cleancode;

public class Main {
    static void main() {
        ExportManager exportManager = new ExportManager();

        ExporterService exporterService = new PDFExporter();
        exportManager.createExport(exporterService, "test");
    }
}