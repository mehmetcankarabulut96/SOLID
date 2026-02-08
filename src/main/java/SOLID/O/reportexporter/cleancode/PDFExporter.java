package SOLID.O.reportexporter.cleancode;

public class PDFExporter implements ExporterService{

    @Override
    public void export(String data) {
        System.out.println(data + " exported as PDF");
    }
}