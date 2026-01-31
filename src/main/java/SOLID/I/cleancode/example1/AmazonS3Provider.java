package SOLID.I.cleancode.example1;

public class AmazonS3Provider implements Storage, Shareable, Versionable {
    @Override
    public String generateShareableLink(String fileName) {
        return "https://s3.aws.com/file";
    }

    @Override
    public void uploadFile(String fileName) {
        System.out.println("S3'e yüklendi.");
    }

    @Override
    public void downloadFile(String fileName) {
        System.out.println("S3'ten indirildi.");
    }

    @Override
    public void rollbackToVersion(String fileName, int versionId) {
        System.out.println("Versiyon geri alındı.");
    }
}