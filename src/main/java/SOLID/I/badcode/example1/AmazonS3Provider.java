package SOLID.I.badcode.example1;

class AmazonS3Provider implements StorageProvider {

    public void uploadFile(String fileName) {
        System.out.println("S3'e yüklendi.");
    }

    public void downloadFile(String fileName) {
        System.out.println("S3'ten indirildi.");
    }

    public String generateShareableLink(String fileName) {
        return "https://s3.aws.com/file";
    }

    public void rollbackToVersion(String fileName, int versionId) {
        System.out.println("Versiyon geri alındı.");
    }
}