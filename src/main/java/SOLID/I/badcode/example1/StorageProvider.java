package SOLID.I.badcode.example1;

public interface StorageProvider {
    void uploadFile(String fileName);
    void downloadFile(String fileName);
    String generateShareableLink(String fileName);
    void rollbackToVersion(String fileName, int versionId);
}