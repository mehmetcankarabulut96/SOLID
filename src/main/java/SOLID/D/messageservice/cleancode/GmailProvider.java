package SOLID.D.messageservice.cleancode;

public class GmailProvider implements MessageService{

    @Override
    public void sendMessage(String message) {
        System.out.println("Gmail ile: " + message);
    }
}