package SOLID.I.storagemanager.cleancode;

public interface Versionable {
    void rollbackToVersion(String fileName, int versionId);
}