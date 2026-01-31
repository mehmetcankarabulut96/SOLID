package SOLID.D.cleancode.example1;

public class OutlookProvider implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Outlook ile: " + message);
    }
}