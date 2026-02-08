package SOLID.O.reportexporter.cleancode;

public class ExcelExporter implements ExporterService{
    @Override
    public void export(String data) {
        System.out.println(data + " exported as Excel");
    }
}