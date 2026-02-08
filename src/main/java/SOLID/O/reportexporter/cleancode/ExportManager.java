package SOLID.O.reportexporter.cleancode;

public class ExportManager {
    public void createExport(ExporterService exporterService, String data){
        exporterService.export(data);
    }
}