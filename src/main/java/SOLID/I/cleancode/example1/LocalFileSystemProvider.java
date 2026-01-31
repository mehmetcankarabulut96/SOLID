package SOLID.I.cleancode.example1;

public class LocalFileSystemProvider implements Storage{

    @Override
    public void uploadFile(String fileName) {
        System.out.println("Diske yazıldı.");
    }

    @Override
    public void downloadFile(String fileName) {
        System.out.println("Disk okundu.");
    }
}