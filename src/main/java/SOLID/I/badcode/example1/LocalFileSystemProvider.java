package SOLID.I.badcode.example1;

// This class violates ISP because it implements methods that it doesn't support
class LocalFileSystemProvider implements StorageProvider {

    public void uploadFile(String fileName) {
        System.out.println("Diske yazıldı.");
    }

    public void downloadFile(String fileName) {
        System.out.println("Disk okundu.");
    }

    // ISP violation
    @Override
    public String generateShareableLink(String fileName) {
        throw new UnsupportedOperationException("Lokal dosyalar paylaşılamaz!");
    }

    // ISP violation
    @Override
    public void rollbackToVersion(String fileName, int versionId) {
        throw new UnsupportedOperationException("Versiyonlama desteklenmiyor.");
    }
}