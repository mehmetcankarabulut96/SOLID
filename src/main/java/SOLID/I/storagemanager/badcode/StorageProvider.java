package SOLID.I.storagemanager.badcode;

public interface StorageProvider {
    void uploadFile(String fileName);
    void downloadFile(String fileName);
    String generateShareableLink(String fileName);
    void rollbackToVersion(String fileName, int versionId);
}