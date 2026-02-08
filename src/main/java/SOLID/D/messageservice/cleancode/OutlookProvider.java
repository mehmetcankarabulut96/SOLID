package SOLID.D.messageservice.cleancode;

public class OutlookProvider implements MessageService{
    @Override
    public void sendMessage(String message) {
        System.out.println("Outlook ile: " + message);
    }
}