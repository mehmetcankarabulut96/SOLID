package SOLID.I.cleancode.example1;

public interface Versionable {
    void rollbackToVersion(String fileName, int versionId);
}