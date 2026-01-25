package SOLID.O.cleancode.example2;

public class ExportManager {
    public void createExport(ExporterService exporterService, String data){
        exporterService.export(data);
    }
}