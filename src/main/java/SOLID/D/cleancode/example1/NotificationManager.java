package SOLID.D.cleancode.example1;

class NotificationManager {

    private final MessageService messageService;

    public NotificationManager(MessageService messageService){
        this.messageService = messageService;
    }

    public void notify(String message) {
        messageService.sendMessage(message);
    }
}